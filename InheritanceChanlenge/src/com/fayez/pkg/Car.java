package com.fayez.pkg;

public class Car extends Vehicles {

    private String color;
    private double size;
    private double height;

    public Car(String engine,int wheel,int door ,String model,String color, double size,double height){
        super("tata",8,3,"nexa");

        this.color=color;
        this.height=height;
        this.size=size;
    }

    public String getColor() {
        return color;
    }

    public double getSize() {
        return size;
    }

    public double getHeight() {
        return height;
    }


    public void window(int num1){
        System.out.println("the car has the number of window :- "+num1);
    }
}
