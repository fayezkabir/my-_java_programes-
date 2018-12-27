package com.fayez.org;

import java.util.Scanner;

public class Main {
    private static Scanner s=new Scanner(System.in) ;
    private static int[] baseData=new int[10];


    public static void main(String args[]){
        System.out.println("enter 10 digit");
        getInput();
        printArray(baseData);
        resizeArray();
        System.out.println("enter the 12  digit");
        getInput();
//        baseData[10]=12;     // ******this is the one way of resizing array
//
//        baseData[11]=32;     // ******by  giving explicitly  index wise input
        printArray(baseData);

    }
    private static void getInput(){
        for (int i=0;i<baseData.length;i++) {
            baseData[i] = s.nextInt();
        }

    }
    private static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            System.out.println();

        }

    }

    private static void resizeArray(){
        int[] original=baseData;
        baseData=new int[12];


        for (int i=0;i<original.length;i++){
            baseData[i]=original[i];

        }
    }

}
