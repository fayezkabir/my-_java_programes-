package com.fayez.pkg;

public class PC {


        private Case theCase;
        private Monitor themonitor;
        private Motherboard themotherboard;


        public PC (Case theCase,Monitor themonitor,Motherboard themotherboard){

            this.theCase=theCase;
            this.themonitor=themonitor;
            this.themotherboard=themotherboard;

        }

        public void powerUp(){
            theCase.pressPowerbutton();
            drawlogo("8.1");
        }


        public  void drawlogo(String windows) {
            //fancy logo will come up
            themonitor.drawpixel(120,140,"indigo");

    }


    public void pcType(){
            themotherboard.quality();
    }


       /* private Monitor getMonitor(){
            return monitor;

        }

        private Motherboard getMotherrboard(){
            return themotherboard;
        }

    private Case getTheCase(){
        return theCase;
    }*/
}

