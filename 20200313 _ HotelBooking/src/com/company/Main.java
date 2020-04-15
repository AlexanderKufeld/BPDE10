package com.company;

public class Main {

    public static void main(String[] args) {
        Room r1 = new StandardRooms("1", 11, 100);
        Room r2 = new StandardRooms("2", 2, 95);
        Room r3 = new DeLuxeRooms("3", 1, 200);
        Room r4 = new DeLuxeRooms("4", 2, 150);
        Room r5 = new SuiteRooms("5", 3, 120);


        Person p1 = new Person("Ivan");
        System.out.println(p1);
        System.out.println(r1);
        Date d1 = new Date(1, 10, 2020);
        Date d2 = new Date(20, 10, 2020);
        Booking b1 = new Booking(p1, r1, d1, d2);
        System.out.println(b1);

        Person p2 = new Person("Jack", 20);
        System.out.println(p2);
        System.out.println(r2);
        Date d3 = new Date(2, 12, 2020);
        Date d4 = new Date(12, 12, 2020);
        Booking b2 = new Booking(p2, r2, d3, d4);
        System.out.println(b2);


        Booking[] bookings = new Booking[]{b1, b2};
        BookingList myList = new BookingList(20);
        myList.addBooking(b1);
        myList.addBooking(b2);

        System.out.println("Booking from  " + myList.addBooking(b1) + myList.addBooking(b1) + " before delete");
        System.out.println("Booking from  " + myList.deleteBooking(p1) + myList.deleteBooking(p1) + "before delete");

        System.out.println(myList.getBookingsByPerson(p2));



    }

}















