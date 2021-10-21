package javastatemachine;

public class Enemy extends Entity{

	
	public Enemy(Position initPos) {
		super(initPos);
		if(pos.x > JavaStateMachine.mainPlayer.pos.x) {
			pos.setDirection("Left");
		}else {
			pos.setDirection("Right");
		}
		
		System.out.println(pos.getLookingDirection());
	}
}
