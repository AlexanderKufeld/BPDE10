package com.company;


public class DeLuxeRooms extends Room {

    private int prise;

    public DeLuxeRooms(String number, int capacity, int prise) {
        super(number, capacity);
        this.prise = prise;
    }

    @Override
    public int getPrise() {
        return prise;
    }

    @Override
    public void doService() {

        System.out.println("All inclusive");

    }

}

