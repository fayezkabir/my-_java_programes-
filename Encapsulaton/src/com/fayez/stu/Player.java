package com.fayez.stu;

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

