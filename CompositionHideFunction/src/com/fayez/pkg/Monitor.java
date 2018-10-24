package com.fayez.pkg;

public class Monitor {


        private String model;
        private String manufacturer;
        private int size;
        private  Resolution nativeResolution;     // this is composition in OOP



        public Monitor(String model,String manufacturer,int size,Resolution nativeResolution){
            this.model=model;
            this.manufacturer=manufacturer;
            this.size=size;
            this.nativeResolution=nativeResolution;
        }


        public void drawpixel(int x,int y,String color){

            System.out.println("drawing pixel at  "+x+ " , "+ y+" and color is "+color);
        }


        public String getModel(){
            return model;

        }

        public String  getManufacturer(){
            return manufacturer;
        }


        public int getSize(){
            return size;

        }

        public Resolution getNativeResolution(){
            return nativeResolution;
        }
    }


