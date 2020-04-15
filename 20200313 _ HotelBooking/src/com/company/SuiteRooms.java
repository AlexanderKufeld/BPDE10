package com.company;


    public class SuiteRooms extends Room {
        protected int prise;
        public SuiteRooms(String number, int capacity, int prise) {
            super(number, capacity);
            this.prise = prise;
        }


        public SuiteRooms(String number, int prise) {
            super(number);
            this.prise = prise;
        }


        @Override
        public void doService() {

            System.out.println("All drinks cost extra");
        }

        @Override
        public int getPrise(){
            return prise;
        }
    }

