package com.fayez.stu;

public class Main {
    public static void main(String args[]) {


        Dimention dimention = new Dimention(14, 15, 10);
        Case theCase = new Case("jhkm200", "dell", "220", dimention);    //calling the value by creating object


        Resolution nativeResolution = new Resolution(120, 150);
        Monitor monitor = new Monitor("shark", "asus", 1080 * 720, nativeResolution);


        // Monitor monitor=new Monitor("gsf","gshag",536,new Resolution(120,150));   // this the alternative method of the above two lines


        Motherboard theMotherboard = new Motherboard("poco", "dell", 5, 4, "version2.45");

        PC thePC = new PC(theCase, monitor, theMotherboard);
        thePC.getMonitor().drawpixel(1200,1800,"sky blue");  // invoking method

        thePC.getMotherrboard().LoadProgram("windows 8.1");
        thePC.getTheCase().pressPowerbutton();




    }
}
