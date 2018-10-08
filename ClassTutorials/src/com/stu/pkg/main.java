package com.stu.pkg;

public class main
{
    public static void main(String args[])
    {
        Car honda=new Car(); //(creating the object of the car class and initializing honda to some value ) together im 1 line
        Car swift=new Car(); //(creating another object of the car class and initializing honda to some value ) together im 1 line



       honda.setModel("icon");  // passing the parameter we have created  and its value as icon
        System.out.println("the model is :-"+honda.getModel());




        honda.setColor("brown");  // passing the parameter we have created  and its value as red
        System.out.println("the model color is :-"+honda.getColor());



        honda.setDoors(5);
        System.out.println("the nuber doors of the car is :- "+honda.getDoors());



        honda.setEngien("tata motors");
        System.out.println("the engine of the car is :- "+honda.getEngien());






        honda.setWheels(4);
        System.out.println("the number of wheel of the car is  :- "+honda.getWheels());

    }
}
