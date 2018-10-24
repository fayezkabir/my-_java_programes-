package com.fayez.stu;

public class Main {
    public static void main(String args[]){



       /* Player player =new Player();
        player.name="fayez";
        player.health=20;
        player.weapon="gun";

        int damage=10;
        player.loseHeath(damage);
        System.out.println("remaining health -> "+ player.healthRemaining());

        damage=11;
        player.health=200;   // this is a problem here we ahve over-ride the value and this makes code  unprotected
        player.loseHeath(damage);
        System.out.println("remaining health -> "+ player.healthRemaining());*/







       EnhancedPlayer players=new EnhancedPlayer("fayez",200,"cricket bat") ;
        System.out.print("initial health is :-->"); players.sorir();
        System.out.println("you have not more health than :- "+players.getHealth());
    }
}
