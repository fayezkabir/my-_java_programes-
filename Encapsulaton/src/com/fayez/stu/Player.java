package com.fayez.stu;



//  generally  we do  not  write code  like that because  it has no control to the Player class


public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHeath(int damage){

        this.health=this.health-damage;
        if(this.health<=0) {
            System.out.println("player is knocked out");
            //reduce the number  of lives of the remaining players
        }
    }


    public int healthRemaining(){
        return this.health;
    }

}

