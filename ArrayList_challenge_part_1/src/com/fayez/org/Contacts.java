package com.fayez.org;

public class Contacts {



    private String name;
    private String phoneNumber;


    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }





    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }






    public String getName()
    {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }




    public static Contacts createContacts(String name, String phoneNumber){  // ******** THIS BLOCK OF  IS ACTUALLY CALLING THE CONSTRUCTOR---
                                                                            //****** TO CREATE A NEW CONTACT RECORD.

        return new Contacts(name, phoneNumber);
    }
}
