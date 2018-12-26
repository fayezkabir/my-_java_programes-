package com.fayez.org;

import java.util.Scanner;

public class Main {
    private  static Scanner scan = new Scanner(System.in);
    public static void main(String args[]){
        int[] myInteger= getInteger(5);
        for (int i=0;i<myInteger.length;i++){
            System.out.println("element "+i+" , typed value "+myInteger[i]);


        }
        System.out.println("the average will be "+ getAverage(myInteger));


    }
    public static int[] getInteger(int number){
        System.out.println("Enter "+number+" integer  value.\r");
        int [] values=new int[number];

        for (int i=0;i<values.length;i++){
            values[i] = scan.nextInt();

        }
        return values;
    }


    public static double getAverage(int[] array){
        int sum=0;
        for (int i=0;i<array.length;i++)
        {
            sum +=array[i];

        }
        return (double) sum/ (double) array.length;
    }
}
