package com.fayez.stu;

public class Dog extends Animal{

    private int eyes;
    private  int legs;
    private  int tail;
    private int teeth;
    private  String coat;




    public  Dog(String name,int size,int weight,int eyes,int legs,int tail,int teeth,String coat){
        super(name,1,1,size,weight);


        this.eyes=eyes;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
        this.coat=coat;
    }

    public void chew(){
        System.out.println("dog is chewing food");
    }


    public void poty(){
        System.out.println("  dogy.poty  is caled  :::--  dog is doing poty ");
    }


    public void eat(){                                                      // overdiding eat method

        System.out.println("  dogy.eat  method is called   :::-- dog is eating");
        chew();
        poty();
        eat("chicken");
    }


    public void walk(){
        System.out.println(" dogy.walk is called  :::--  dog is walking");
        super.move(5);

    }

    public void run(){

        System.out.println("dogy.run is called   :::---  dog is running ");
        move(10);
    }


    public void moveLegs(int speed){
        System.out.println("dogy.moveLegs is called :::---  dogy is moving");
    }
                public void move(int speed){                                        //overridding the move method
            moveLegs(speed);
            super.move(10);

            System.out.println("dogy.move is called   :::---  dog is moving fast");
        }
}
