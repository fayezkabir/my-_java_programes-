package com.fayez.pkg;

public class Dimention {


        private int height ;
        private int width ;
        private int depth;


        public Dimention (int height, int width,int depth){

            this.height=height;
            this.width=width;
            this.depth=depth;
        }

        public void check(){
            System.out.println("fuck");
        }


        public int getWidth(){
            return width;
        }

        public int getHeight(){

            return height;
        }

        public int getDepth(){
            return depth;
        }
    }


