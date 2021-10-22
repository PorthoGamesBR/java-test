/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastatemachine;

/**
 *
 * @author User
 */
public class Position {
    int x,y;
    int rotation;
    int frontDir;
    int anotherNumber;
    
    //1 = Right, -1 = Left
    
    public Position(int x, int y){
        this.x = x;
        this.y = y;
        rotation = 0;
        frontDir = 1;
    }
    
    public String getLookingDirection(){
        String direction = "Right";
        switch(frontDir){
            case 1:
                direction = "Right";
                break;
            case -1:
                direction = "Left";
                break;
        }
        
       return direction;
    }
    
    public int getX(){return x;}
    public int getY(){return y;}
    
    public void setX(int x){this.x = x;}
    public void setY(int y){this.y = y;}
    
    public void SetPosition(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void setDirection(int dir){frontDir = dir;}
    public void setDirection(String dir){
        switch(dir){
            case "Right":
             frontDir = 1;
             break;
            case "Left":
             frontDir = -1;
             break;
        }
    }
    

}
