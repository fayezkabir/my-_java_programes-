package com.fayez.pkg;

public class Main {
    public static void main(String args[]) {


        Vehicles vehicles = new Vehicles("tata motors", 4, 5, "brezzera");


        System.out.println("the model of the vehicles is :- " + vehicles.getModel());





        Car car=new Car("tata",6,9,"lori","red hot",25.2,20.0);






        Honda honda=new Honda("germani",22,25,"desier","bkack",50.3,30.5,"green");

        System.out.println("the name of the engine is :-"+honda.getEngine());

        System.out.println("the color of the honda car is :- "+honda.getColur());
        System.out.println("the model of the honda car is :- "+honda.getModel());

        honda.moving(50);



    }

}