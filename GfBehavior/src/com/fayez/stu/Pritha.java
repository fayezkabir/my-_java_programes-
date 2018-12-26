package com.fayez.stu;

public class Pritha extends  Women{

    private String  attitude;
    private  String behavior;


    public Pritha(int hand, int nose, int legs, int body, String typeOFmind, String lips, String hair, String hips, String attitude, String behavior) {
        super(hand, nose, legs, body, typeOFmind, lips, hair, hips);
        this.attitude = attitude;
        this.behavior = behavior;
    }

    public String getAttitude() {
        return attitude;
    }

    public void setAttitude(String attitude) {


        this.attitude = attitude;


    }





    public void setBehavior(){
        System.out.println("hey angry bird how are you ??? ");
    }
}
