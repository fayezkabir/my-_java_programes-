package com.fayez.stu;

public class Main {
public static void main(String args[]){


vipCustomer consumer1=new vipCustomer();
    System.out.println( consumer1.getName());

    vipCustomer cosumer2=new vipCustomer("fayez",40000.0);
    System.out.println(cosumer2.getCreditLimits());
    System.out.println(cosumer2.getName());


    vipCustomer consumer3=new vipCustomer("kabir",5000,"fayez.3@gmail.com");
    System.out.println(consumer3.getEmailAdress());
    System.out.println(consumer3.getCreditLimits());
    System.out.println(consumer3.getName());

}
}