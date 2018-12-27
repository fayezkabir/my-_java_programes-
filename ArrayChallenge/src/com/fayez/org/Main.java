package com.fayez.org;

import java.util.Arrays;
import java.util.Scanner;


                                    //***********         THIS A CODE FOR SORTED LIST  USING ARRAY        ************************\\\\\\\



public class Main {
    private static Scanner scanner=new Scanner(System.in);

    public  static void main(String args[]){
        int[] myInteger= getInteger(5);

        /*for (int i=0;i<myInteger.length;i++){
            System.out.println("element"+i+"the value is "+myInteger[i]);
        }*/


        int[] sorted=sortedIntegers(myInteger);

        printArray(sorted);

    }


    //**** this block is for taking user input   *******\\\\

    public static int[] getInteger(int capacity)
    {
        System.out.println("please enter the number "+capacity+" of integer value .\r");

        int[] array=new int[capacity];
        for (int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();

        }

        return array;
    }


    ////****** this block is for  printing the array ******\\\\

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("element "+i+" contains "+array[i]);
        }

    }


    ///****** this block is for taking the user input array and  sorting the array ****\\\\


    public static int[] sortedIntegers ( int[] array){

        /*int[] sortedArray=new int[array.length];

        for (int i=0;i<array.length;i++){
            sortedArray[i]=array[i];
        }*/

        int[] sortedArray = Arrays.copyOf(array,array.length);  // java gives us built in functions

        boolean flag =true;
        int temp;
        while (flag) {
            flag = false;

            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;

                }
            }
        }
        return sortedArray;

    }
}
