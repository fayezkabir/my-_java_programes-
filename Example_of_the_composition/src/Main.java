import com.stu.pkg.Lamp;

public class Main {


    public static void main(String args[]){

        Wall wall1=new Wall("south");
        Wall wall2=new Wall("west");
        Wall wall3=new Wall("esat");
        Wall wall4=new Wall("north");

        Ceiling theCeiling=new Ceiling(10,55);

        Bed theBed=new Bed("box-khat",3,4,2,3);

        Lamp theLamp=new Lamp("tango",true,3);

        Bedroom theBedroom=new Bedroom("fayez's room",wall1,wall2,wall3,wall4,theCeiling,theBed,theLamp);

        theBedroom.makeBed();
        theBedroom.getLamp().turnOn();


    }
}
