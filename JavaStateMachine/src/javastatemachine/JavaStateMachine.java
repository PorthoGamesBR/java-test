/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastatemachine;

//Made by: Portho

public class JavaStateMachine {

	public static Player mainPlayer;
	
    public static void main(String[] args) {
       System.out.println("Hello World");
       
       mainPlayer = new Player();
       Enemy enm1 = new Enemy(new Position(-1,0));
    }
    
}
