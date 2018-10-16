package com.fayez.stu;

public class Human {

    private int hand;
    private int nose;
    private int legs;
    private int body;
    private String typeOFmind;


    public Human(){
        this(2,1,2,1,"peace full");
    }


    public  Human(int hand,int nose,int legs,int body,String typeOFmind){
        this.hand=hand;
        this.nose=nose;
        this.legs=legs;
        this.body=body;
        this.typeOFmind=typeOFmind;

    }




    public void walk(int speed){
        System.out.println("Human.walk() called :::---  you are walking at the speed of :- "+speed);
    }



    public void eat(String khana){

        System.out.println("Human.eat()  called:::--   you are eating"+khana);
    }



    public void sleep(String greet){

        System.out.println("you are sleeping at night so :- "+greet);

    }


//
//        public void setHand( int hand){
//        this.hand=hand;
//    }




    public int getHand(){
        return hand;
    }


    public int getNose(){
        System.out.println("wow you have lovely pair "+nose+" of hand");
        return nose;
    }


    public int getLegs(){
        System.out.println("wow you have lovely pair "+legs+" of hand");
        return legs;
    }


    public int getBody(){
        System.out.println("wow you have lovely pair "+body+" of hand");
        return body;
    }


    public String getTypeOFmind(){
        System.out.println("wow you have lovely pair "+typeOFmind+" of hand");
        return typeOFmind;
    }




}
