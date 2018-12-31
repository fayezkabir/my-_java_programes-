package com.fayez.org;

import java.util.ArrayList;

public class MobilePhone
{
    private String myNumber;
    private ArrayList<Contacts>myContacts;

    public MobilePhone(String myNumber) {  //***** THIS IS  A CONSTRUCTOR TO CREATE A EMPTY ARRAYLIST.
        this.myNumber = myNumber;
        this.myContacts=new ArrayList<Contacts>();
    }

    public boolean addNewContacts(Contacts contacts){          //********this block of code first checking the name if it exists the printing msg---
        if (findContacts(contacts.getName())>0){               //******** and if not present then its adding the new name
            System.out.println("Contact is ALREADY IN THE FILE");
            return false;
        }
        myContacts.add(contacts);
        return true;

    }



    public boolean updateContact(Contacts oldContact,Contacts newContact){   //****this block of code taking the old name and searching the lists--
        int foundPosition=findContacts(oldContact);                          //****if not foound then printing msg-----
        if (foundPosition<0){                                                //****if found the replacing the old name with new one
            System.out.println(oldContact.getName()+"   -- was not found");
            return  false;
        }
        this.myContacts.set(foundPosition,newContact);
        System.out.println(oldContact.getName()+"  is  replaced  with "+newContact.getName());
        return  true;
    }



    public boolean removeContact(Contacts contacts){     //***** this block of code is first checking the lists if  not found then printing the msg--
        int foundPosition=findContacts(contacts);        //**** if found then its actually removing the  contact  from the lists
        if (foundPosition<0){
            System.out.println(contacts.getName()+"   -- was not found");
            return  false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contacts.getName()+" is now deleted");
        return true;

    }

    private int findContacts(Contacts contacts){  // this block of actually finding the INDEX NO from the arraylists
        return myContacts.indexOf(contacts);
    }




    private int findContacts(String contactName){   // THIS BLOCK WILL CHECK WEATHER THE TYPED NAME IS IN THE CONTACT LIST OR NOT
        for (int i=0; i<this.myContacts.size();i++){
            Contacts contacts=this.myContacts.get(i);
            if (contacts.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }
    public String queryContact(Contacts contacts){   // this block of code will search for the index  number of the typed name if it is exists
        if (findContacts(contacts)>=0){
            return contacts.getName();

        }
        return null;

    }


    public  Contacts queryContact(String name){  //*** this block of code will search  the contact list  for the name that is typed
        int position = findContacts(name);      //*****  and will return it  to the contact list
        if (position>=0){
            return this.myContacts.get(position);
        }
        return  null;
    }

    public void printContacts(){       // *********  this block of code will print the contact list that are available in the contact list
        System.out.println("contacts lists");
        for (int i=0;i<this.myContacts.size();i++){

            System.out.println((i+1)+"."+
                                this.myContacts.get(i).getName()+"-->"+
                                this.myContacts.get(i).getPhoneNumber() );
        }
    }








}
