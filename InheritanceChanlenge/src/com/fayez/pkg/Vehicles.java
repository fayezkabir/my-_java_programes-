package com.fayez.pkg;

public class Vehicles
{
    private  String engine;
    private  int wheel;
    private int doors;
    private String model;



    public Vehicles(){
        this("defaultengine",4,5,"stylish");
    }


    public String getEngine() {
        return engine;
    }

    public int getWheel() {
        return wheel;
    }

    public int getDoors() {
        return doors;
    }

    public String getModel() {
        return model;
    }

    public Vehicles(String engine, int wheel, int doors, String model){
        this.engine=engine;
        this.wheel=wheel;
        this.doors=doors;
        this.model=model;







    }
}
