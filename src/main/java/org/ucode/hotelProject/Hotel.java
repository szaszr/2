package org.ucode.hotelProject;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private int stars;
    private List<Room> rooms;
    private List<String> facilities;
    private int noOfParkingSpots;
    private Contact contact;
    private List<Review> reviews;

    public Hotel() {
        reviews = new ArrayList<>();
    }

    public Hotel(String name, int stars, int noOfParkingSpots, Contact contact) {
        this.name = name;
        this.stars = stars;
        this.noOfParkingSpots = noOfParkingSpots;
        this.contact = contact;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<String> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<String> facilities) {
        this.facilities = facilities;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getNoOfParkingSpots() {
        return noOfParkingSpots;
    }

    public void setNoOfParkingSpots(int noOfParkingSpots) {
        this.noOfParkingSpots = noOfParkingSpots;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
