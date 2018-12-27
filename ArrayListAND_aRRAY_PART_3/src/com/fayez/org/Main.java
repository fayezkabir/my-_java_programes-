package com.fayez.org;

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
            System.out.println("\t 6 - to to quit the application .");
        }

        public static  void addItem(){
            System.out.print("please enter the grocery  item .");
            groceryList.addgroceryList(scanner.nextLine());

        }


        public  static void modifyItem(){
            System.out.print ("please enter the item number .");
            int ItemNo=scanner.nextInt();
            scanner.nextLine();
            System.out.print("enter the replacement item");
            String Newitem=scanner.nextLine();
            groceryList.mdifyGroceryItem(ItemNo-1,Newitem);   // ********we have to deduct 1  because list in java starts  with 0


        }


        public static void removeItem(){

            System.out.print("please enter the item number .");
            int ItemNo=scanner.nextInt();
            scanner.nextLine() ;
            groceryList.removeGroceryItem(ItemNo-1);


        }



        public static void searchforItem(){
            System.out.print("item to search for ");
            String searchItem= scanner.nextLine();

            if (groceryList.findItem(searchItem)!=null){
                System.out.println("we have found "+searchItem+" in our grocery list.");

            }
            else{
                System.out.println(searchItem+" is not available in our grocery list");
            }

        }










    }



