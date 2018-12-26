package com.fayez.org;

public class Main {

    public static void main(String args[]) {

        /*int[] myIntArray={10,12,15,45,16,78,91,12,30,41};    //**** one way of retrieve value in array
        System.out.println(myIntArray[2]);
        System.out.println(myIntArray[2]);
        System.out.println(myIntArray[6]);
        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[8]);*/


        int[] myInteArray = new int[10];         //****** another process of retrieve  array value




        for (int i = 0; i < myInteArray.length; i++) {   //***** putting myInteArray.length  we did code more flexible--
            //*** --and user friendly and  exception free too most importantly
            //myInteArray[i] = i*5;
            System.out.println(myInteArray[i] = i + 5);

        }
       /* for(int i=0;i<myInteArray.length;i++){
            System.out.println("element "+i+" the value is "+myInteArray[i]);

        }*/


        PrintArray(myInteArray);


    }

    public static void PrintArray(int[] array) {      // this is another way of implementing for loop  pass the argument to the main function
        for (int i = 0; i < array.length; i++) {
            System.out.println("element " + i + " the value is " + array[i]);

        }
    }
}
