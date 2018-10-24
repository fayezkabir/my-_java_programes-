package com.fayez.pkg;


    public class Case {
        private String model;
        private String manufacturer;
        private String powerSupplier;
        private Dimention dimention;



        public Case(String model, String manufacturer, String powerSupplier, Dimention dimention) {
            this.model = model;
            this.manufacturer = manufacturer;
            this.powerSupplier = powerSupplier;
            this.dimention = dimention;

        }

        public void check(){
            System.out.println("fuck");
        }

        public void pressPowerbutton(){
            System.out.println("power button pressed");
        }

        public String getModel() {
            return model;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public String getPowerSupplier() {
            return powerSupplier;
        }

        public Dimention getDimention() {
            return dimention;
        }
    }


