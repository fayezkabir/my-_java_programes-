package com.fayez.pkg;

public class Honda extends Car {



    private String colur;
    private String model;


    public Honda(String engine, int wheel, int door, String model, String color, double size, double height,String colur) {
        super(engine, wheel, door, model, color, size, height);
        this.colur=colur;
        this.model=model;
    }




    public void handSteering(String side){
        System.out.println("the haonda car is changing the direction to :- "+side);

    }



    public void changingGear(int num){
        System.out.println("the honda car is  changing gear at :- "+num);


    }



    public String getModel(){
        return model;
    }

    public String getColur() {
        return colur;
    }


//    @Override
//    public void window(int num1) {
//        super.window(num1);
//    }


    public void window(int num1){
        System.out.println("  bsgg");
    }








    public void moving(int speed){
        System.out.println("the speed of the honda  car is :- "+speed +" KMPH");
        window(6);
        super.window(10);







        }
    }

