package com.fayez.stu;

public class Motherboard {

    private  String model;
    private String manufacturer;
    private int cardslots;
    private int ramslots;
    private String bios;



    public Motherboard(String model,String manufacturer,int cardslots,int ramslots,String bios){

        this.model=model;
        this.manufacturer=manufacturer;
        this.cardslots=cardslots;
        this.ramslots=ramslots;
        this.bios=bios;
    }



    public void LoadProgram(String program){
        System.out.println("the program is "+program+" is now loading");
    }



    public String getModel(){
        return model;

    }

    public String getManufacturer(){
        return manufacturer;
    }

    public int getCardslots(){
        return cardslots;

    }

    public int getRamslots(){
        return ramslots;
    }

    public String getBios(){
        return bios;
    }


}
