package com.fayez.org;


class member{
    int a=20;
    int b=15;
    int sum=0;
public void add(){
     int sum = ( a+  b);
    System.out.println("ressult"+sum);
}
    public void sub(){
        int sum = ( a-  b);
        System.out.println("ressult"+sum);
    }
    public void mul(){
        int sum = ( a*  b);
        System.out.println("ressult"+sum);
    }


}


public class Main {
 public static void main(String args[]){

     member MEM=new member();
     MEM.add();
     MEM.sub();
     MEM.mul();
    }
}
