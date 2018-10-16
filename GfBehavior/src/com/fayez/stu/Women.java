package com.fayez.stu;

public class Women extends Human{
    private  String lips;
    private String hair;
    private String hips;


    public Women(int hand ,int nose ,int legs,int body,String typeOFmind,String lips, String hair,String hips){
        super(2,1,2,1,"typeof mind");
        this.hair=hair;
        this.lips=lips;
        this.hips=hips;

    }

    public String getLips() {
        return lips;
    }

    public String getHair() {
        return hair;
    }

    public String getHips() {
        return hips;
    }

    public void setHair(){
        System.out.println("you have nice long hair");
    }
    public void setLips(){

        System.out.println("you have a pair of sexy lips" +"\n"+
                "i love to eat your juicy lips ");

    }


    public void setHips(){
        System.out.println("your hips is nice " + " \n " + " but "+"\n"+" you need  to devlop your hips more");
    }



    public void looks(){
        System.out.println();
        setHair();
        setLips();
        setHips();
    }
}
