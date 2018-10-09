package com.fayez.stu;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;


    public Fish(String name,int brain ,int body,int size,int weight,int gills,int eyes,int fins){
        super(name,brain,body,size,weight);
        this.gills=gills;
        this.eyes=eyes;
        this.fins=fins;
    }



    public void rest(){

    }


    public void movemustle( int speed){
        System.out.println("fish is moving mushle");

    }

    public void moveBackFin( int speed){
        System.out.println("the fish is moving back finn");

    }

    public int getGills() {
        return gills;
    }

    public int getEyes() {
        return eyes;
    }

    public int getFins() {
        return fins;
    }

    public void swim(int speed){

        System.out.println("the fish is swimimg at the speed  of :-");
        movemustle(10);
        moveBackFin(20);


    }

}
