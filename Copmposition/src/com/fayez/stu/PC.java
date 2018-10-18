package com.fayez.stu;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard themotherboard;


    public PC (Case theCase,Monitor monitor,Motherboard motherboard){

        this.theCase=theCase;
        this.monitor=monitor;
        this.themotherboard=motherboard;

    }


    public Case getTheCase(){
        return theCase;
    }

    public Monitor getMonitor(){
        return monitor;

    }

    public Motherboard getMotherrboard(){
        return themotherboard;
    }
}