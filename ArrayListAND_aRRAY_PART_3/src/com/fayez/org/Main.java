package com.fayez.org;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

        private static Scanner scanner=new Scanner(System.in);
        private static GroceryList groceryList= new GroceryList();
        public static void main(String args[]){
            boolean quit=false;
            int choice = 0;
            printInstructions();
            while(!quit){
                System.out.println("enter your choice : ");
                choice=scanner.nextInt();
                scanner.nextLine();
                switch(choice){
                    case 0 :
                        printInstructions();
                        break;

                    case 1:
                        groceryList.printGroceryList();
                        break;

                    case 2:
                        addItem();
                        break;


                    case 3:
                        modifyItem();
                        break;

                    case 4:
                        removeItem();
                        break;

                    case 5:
                        searchforItem();
                        break;

                        case 6:
                            processedArrayList();
                            break;
                    case 7:

                        quit=true;
                        break;





                }

            }


        }




        public  static void printInstructions(){
            System.out.println("\npress");
            System.out.println("\t 0 - to print the choice option .");
            System.out.println("\t 1 - to list the grocery iitem .");
            System.out.println("\t 2 - to add an item to the list .");
            System.out.println("\t 3 - to modify an item to the list  .");
            System.out.println("\t 4 - to remove an item  to the list .");
            System.out.println("\t 5 - to search an item in the list  .");
            System.out.println("\t 6 - change to array .");
            System.out.println("\t 7 - to to quit the application .");
        }

        public static  void addItem(){
            System.out.print("please enter the grocery  item .");
            groceryList.addgroceryList(scanner.nextLine());

        }


        public  static void modifyItem(){
            System.out.print ("please enter current the item number name  .");
            String ItemNo=scanner.nextLine();

            System.out.print("enter the replacement item");
            String Newitem=scanner.nextLine();
            groceryList.modifyGroceryItem(ItemNo,Newitem);


        }


        public static void removeItem(){

            System.out.print("please enter the item number .");
            String ItemNo=scanner.nextLine();

            groceryList.removeGroceryItem(ItemNo);


        }



        public static void searchforItem(){
            System.out.print("item to search for ");
            String searchItem= scanner.nextLine();

            if (groceryList.onFILE(searchItem)){
                System.out.println("we have found "+searchItem+" in our grocery list.");

            }
            else{
                System.out.println(searchItem+" is not found in our grocery list");
            }

        }


        public static void processedArrayList(){
            ArrayList<String> newArray=new ArrayList<String>();          //******* this the one way of  coping an arraylist ******\\\\\\
            newArray.addAll(groceryList.getGroceryList());

           // ArrayList<String> nextArray=new ArrayList<String>(groceryList.getGroceryList());  //***** anpther way of coping arrayList****\\\



           // String[] myArray=new String[groceryList.getGroceryList().size()];
          //  myArray=groceryList.getGroceryList().toArray(myArray);           //****  it will  convert arrayList to array *******\\\\\\\
        }










    }



