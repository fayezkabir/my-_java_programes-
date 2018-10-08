package com.fayez.stu;

public class vipCustomer {

    private String name;
    private double creditLimits;
    private String emailAdress;



    public vipCustomer(){
        this("mollaji",4000,"fayez.2@gmal.com");

    }


    public vipCustomer(String name, double creditLimits){
        this(name,creditLimits,"balchal@mail.com");

    }



    public vipCustomer(String name , double creditsLimits,String emailAdress){
        this.name=name;
        this.creditLimits=creditsLimits;
        this.emailAdress=emailAdress;

    }

    public String getName() {
        return name;
    }

    public double getCreditLimits() {
        return creditLimits;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}
