package com.fayez.stu;

public class BankAccount
{
    private String account_no;
    private double balence;
    private String customerName;
    private String email;
    private String phoneno;






    public BankAccount(){

        this("5678",2000,"molla","a.@","4455987");  // special this case
        System.out.println("this is a empty constructer");
    }






    public BankAccount(String account_no,double balence,String customerName,String email,String phoneno){
        System.out.println("account constructer with parameter called");

        this.account_no=account_no;
        this.balence=balence;
        this.customerName=customerName;
        this.email=email;
        this.phoneno=phoneno;
    }









    public void deposite(double depositeAmount)
    {
        this.balence+=depositeAmount;
        System.out.println("deposite of :-"+depositeAmount+" makes the total amount :-"+this.balence);

    }



    public void withdrawl(double withdrawlAmount)
    {
        if (this.balence-withdrawlAmount<0){
            System.out.println("only"+this.balence+"available . withdraw not procced");
        }
        else{
            this.balence-=withdrawlAmount;
            System.out.println("withdrawl of " + withdrawlAmount + "procced.  and the available balence  remaining :- "+this.balence);
        }


    }



    //THIS SECTION FOR ACCOUNT NO


    public void setAccount_no(String  account_no) {
        this.account_no = account_no;
    }

    public String getAccount_no() {
        return account_no;
    }



    //THIS SECTION IS FOR  BALENCE

    public void setBalence(double balence) {
        this.balence = balence;
    }

    public double getBalence() {
        return balence;
    }





    //THIS SECTION IS FOR CUSTOMER NAME

    public void setCustomerName(String customerName) {
        this.customerName =customerName;
    }

    public String getCustomerName() {
        return customerName;
    }





    //THIS SECTION IS FOR  PHONE NUMBER


    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getPhoneno() {
        return phoneno;
    }





    //THIS SECTION IS FOR EMAIL ADDRESS


    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}

