package com.company;

public class Booking {

    private Person person;
    private Room room;
    private Date startDate;
    private Date endDate;

    public Person getPerson() {
        return person;
    }

    public Room getRoom() {
        return room;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Booking(Person person, Room room, Date startDate, Date endDate) {
        this.person = person;
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "person=" + person +
                ", room=" + room +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
