package com.fayez.stu;

public class Car  extends Veheicle{
    private int wheels;
    private int gears;
    private int doors;

    private boolean isManual;


    private int currentGear;

    public Car(String name ,String size,int wheels,int gears,int doors,boolean isManual){

        super("name","big");

        this.wheels=wheels;
        this.gears=gears;
        this.doors=doors;
        this.isManual=isManual;
        this.currentGear=1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeGear ():  changed to :- "+this.currentGear+" gears");
    }

   public void changeVelocity(int speed,int direction){
       System.out.println("Car.changeVelocity() :  velocity "+speed+" direction " +direction);

       move(speed, 3);

   }

   public void stop(){
        super.stop();
   }
}
