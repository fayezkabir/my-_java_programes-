package com.stu.pkg;

public class Car
{
    private int doors;
    private int wheels;
    private String model;
    private String engien;
    private String color;


    //THIS IS THE BLOCK FOR MODEL SECTION

    public void  setModel(String model)
    {
        String validModel=model.toLowerCase(); // validation to the model parameter
        if(validModel.equals("icon") ||validModel.equals("desire")) {
            this.model = model; // updating  the private model parameter with the method
        }
        else
            {
                this.model="unkhown";

        }

    }
    public String getModel()
    {
        return this.model;

    }


    // NOW WE DO IT FOR THE  COLOR SECTION

    public void  setColor(String color)
    {
        String validColor=color.toLowerCase(); // validation to the model parameter
        if(validColor.equals("red") ||validColor.equals("brown")) {
            this.color = color; // updating  the private model parameter with the method
        }
        else
        {
            this.color="unkhown";

        }

    }
    public String getColor()
    {
        return this.color;

    }





//    THIS SECTION IS FOR THE  DOOR SECTIONS OF THE CAR


    public void setDoors(int doors)
    {
        if(doors==6 || doors==5)
        {
            this.doors = doors;
        }
        else {
            this.doors=0;
        }

    }

    public int getDoors()
    {
        return this.doors;

    }





    // THIS PART IS FOR  THE ENGINE ASSEMBLING



    public void  setEngien(String engine)
    {
        String validEngine=engine.toLowerCase(); // we are validating the string engine to take all the input as  to lower character
        if (engine.equals("tata motors") || engine.equals("honda self"))  // we are giving a condition to select the  engine brand
        {
            this.engien = engine;

        }

    }
    public String getEngien()
    {
        return this.engien=engien;

    }









    public void setWheels(int wheels)
    {
        if(wheels==4)
        {
            this.wheels = wheels;
        }
        else {
            this.wheels=0;
        }

    }

    public int getWheels()
    {
        return this.wheels;

    }

}
