package org.ucode.hotelProject;

import java.util.Date;

public class Booking {
    private Date startDate;
    private Date endDate;
    private Room room;
    private Customer customer;

    public Booking(Date startDate, Date endDate, Room room, Customer customer) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.room = room;
        this.customer = customer;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
