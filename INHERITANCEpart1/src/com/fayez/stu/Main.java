package com.fayez.stu;

public class Main {

    public static void main(String args[]){



        Animal animal=new Animal("animal",1,1,5,50);
        System.out.println("the name of the animal is :- "+animal.getName());
        System.out.println("the weight of the  dog is  :- "+animal.getWeight()+" kilogram");


        Dog dogy=new Dog("aslecian",10,80,2,4,2,33,"cluster");
        System.out.println("the dog is :- "+dogy.getBody());
        System.out.println("the name of the dog is :- "+dogy.getName());



        Fish fish=new Fish("katla",1,1,1,50,3,2,6);
        System.out.println("the name of the fish is := "+fish.getName());
        System.out.println("the number of finns is :- "+fish.getFins());



         dogy.eat();
        dogy.walk();
        dogy.poty();
        dogy.run();
        fish.swim(20);

    }
}
