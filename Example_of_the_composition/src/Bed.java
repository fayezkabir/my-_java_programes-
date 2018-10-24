public class Bed {

    private String style;
    private int height ;
    private int pillows;
    private int sheets;
    private int quilts;

    public Bed(String style,int height,int pillows,int sheets,int quilts){

        this.style=style;
        this.height=height;
        this.pillows=pillows;
        this.sheets=sheets;
        this.sheets=sheets;
        this.quilts=quilts;

    }


    public void make(){

        System.out.println("bed -> is on the way");
    }

    public String getStyle(){
        return style;
    }

    public int getHeight(){

        return height;
    }

    public int getPillows(){
        return pillows;
    }

    public int getSheets(){
        return sheets;
    }

    public int getQuilts(){
        return quilts;
    }




}
