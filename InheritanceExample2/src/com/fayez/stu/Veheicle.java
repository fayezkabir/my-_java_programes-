package com.fayez.stu;

public class Veheicle {

    private String name;
    private String  size;
    private int  currentVelocity;
    private  int currentDirection;


    public Veheicle(){
        this("unknown","kandar");

    }

    public Veheicle(String name ,String size){

        this.name=name;
        this.size=size;

        this.currentDirection=0;
        this.currentVelocity=0;
    }


    public void steer(int direction){
        this.currentDirection+=direction;
        System.out.println("Veheicle.steer() : steering at "+this.currentDirection+" degree");
    }


    public void move(int velocity,int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("veheicle.move() : moving at :- "+currentVelocity+" in the direction of "+currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop(){
        this.currentVelocity=0;
    }
}
