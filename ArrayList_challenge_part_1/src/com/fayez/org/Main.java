package com.fayez.org;

import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    private static MobilePhone mobilePnone= new MobilePhone("7278916458");


    public static void main(String args[]){

        boolean quit=false;
        startPhone();
        printActions();
        while (!quit){
            System.out.println("\nEnter action (6 to show available actions)");
            int action =scanner.nextInt();
            scanner.nextLine();

            switch(action){

                case 0: {
                    System.out.println(" the device is shutting down......");

                    quit=true;
                    break;
                }
                case 1: {
                    mobilePnone.printContacts();
                   break;
                }
                case 2:{
                    addNewContacts();
                    break;

                }
                case 3:{
                    updateContacts();
                    break;
                }
                case 4:{
                    removeContacts();
                    break;
                }

                case 5:{
                    queryContacts();
                    break;
                }
                case 6:{
                    printActions();
                    break;

                }

            }


        }




    }//***args


    private static void addNewContacts(){
        System.out.println(" please enter the contacts name : ");
        String name=scanner.nextLine();
        System.out.println("  please enter the phone number : ");
        String phone=scanner.nextLine();

        Contacts newContact=Contacts.createContacts(name,phone);  // ***see Contact class for clarifications it just pass the name and phone

        if (mobilePnone.addNewContacts(newContact)){
            System.out.println("your contact added--> :"+name+" ,, phone number  is --> "+phone);
        }
        else {
            System.out.println("can nit add --"+name+" --> it is already on thr file");
        }


    }


    private static void updateContacts(){
        System.out.println("enter the  existing name you want to update");
        String name=scanner.nextLine();
        Contacts existingContactRecord= mobilePnone.queryContact(name);
        if (existingContactRecord==null){
            System.out.println("the  entered name is not found in the list");
            return;
        }
        System.out.print(" please enter the new contacts name : ");
        String newName=scanner.nextLine();
        System.out.print("  please enter the new contact  number : ");
        String newPhone =scanner.nextLine();

        Contacts newContact=Contacts.createContacts(newName,newPhone);

        if(mobilePnone.updateContact(existingContactRecord,newContact)){
            System.out.println("successfully updated the contact");
        }
        else{
            System.out.println("error while updating the number");
        }
    }



    private static void removeContacts() {
        System.out.println("enter the  existing name you want to update");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePnone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("the  entered name is not found in the list");
            return;
        }

        if(mobilePnone.removeContact(existingContactRecord)){
            System.out.println("successfully deleted the contact");
        }
        else{
            System.out.println("there is error in deleting the contact");
        }
    }



    private static void queryContacts() {
        System.out.println("enter the   name you want to search");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePnone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("the  entered name is not found in the list");
            return;
        }

        System.out.println("name -->"+existingContactRecord.getName()+" , and the phone number"+existingContactRecord.getPhoneNumber()+" has found ");


    }






   /* private static void printContacts(){   //**** its  implemented  in case1******\\\\
        mobilePnone.printContacts();
    }*/


    private static void startPhone(){
        System.out.println(" now your phone is ready to start.....");
    }


    private  static void printActions(){
        System.out.println("\nAvailable actions are : \npress :");

        System.out.println( "0---> to shut doen\n"+
                            "1---> to print contacts\n"+
                            "2---> to add a contact\n"+
                            "3---> to update an existing contacts\n"+
                            "4---> to remove an existing contacts\n"+
                            "5---> to query if an existing contact exists\n"+
                            "6---> to print a list of te available  actions");


        System.out.println("choose your action : ");
    }
}
