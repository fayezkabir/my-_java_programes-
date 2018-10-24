package com.fayez.stu;

public class EnhancedPlayer {


    private String name;
    private int hitPoint =100;  // we have renamed the (health-->>hitPoint)
    private String weapon;      //but still it will show no error of constructer this is cool feature of encapsulation


    public EnhancedPlayer(String name,int health,String weapon){

        this.name=name;

        if(health > 0 && health <=100) {    // this is encapsulation
            this.hitPoint = health;
        }
        this.weapon=weapon;
    }

    public void sorir(){
        System.out.println("00");



    }

     public void loseHeath(int damage){
     this.hitPoint =this.hitPoint -damage;
        if(this.hitPoint <=0) {
        System.out.println("player is knocked out");
        //reduce the number  of lives of the remaining players
    }
}

    public int getHealth(){
        return hitPoint;
    }

    public String getWeapon(String cricketbat){
        System.out.println("my weapon  is :- "+weapon);
        return weapon;
    }
}
