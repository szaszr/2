package org.ucode.hotelProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelManager {
    private String resourceFilePath;
    private Hotel hotel;

    public HotelManager(String resourceFilePath) throws FileNotFoundException {
        this.resourceFilePath = resourceFilePath;
        hotel = loadHotel();
    }

    public List<Apartment> listApartments() {

        List <Apartment> apartments = new ArrayList<>();

        for (Room room: hotel.getRooms()){
            if (room instanceof Apartment){
                apartments.add((Apartment) room);
            }

        }

        return apartments;
    }

    public List<SingleRoom> listSingleRooms() {

        List <SingleRoom> singleRooms = new ArrayList<>();

        for (Room room: hotel.getRooms()){
            if (room instanceof SingleRoom){
                singleRooms.add((SingleRoom) room);
            }

        }
        return singleRooms;
    }

    public List<Room> listFreeRooms(){

        List <Room> freeRooms = new ArrayList<>();

        for (Room room: hotel.getRooms()){
            if (!room.isOccupied()){
                freeRooms.add(room);
            }
        }
        return freeRooms;
    }

    public List<Room> listRoomsWithMaximumPrice(double maxPrice){

        List <Room> roomsWithMaximumPrice = new ArrayList<>();

        for (Room room: hotel.getRooms()){
            if (room.getPrice()<maxPrice){
                roomsWithMaximumPrice.add(room);
            }
        }

        return roomsWithMaximumPrice;
    }

    public void rentRoom(int roomNumber){
        for (Room room: hotel.getRooms()){
            if (room.getNumber() == roomNumber && !room.isOccupied()) {
                room.setOccupied(true);
            }
        }
    }

    public void freeRoom(int roomNumber){
        for (Room room: hotel.getRooms()){
            if (room.getNumber() == roomNumber && room.isOccupied()) {
                room.setOccupied(false);
            }
        }
    }

    public int getOccupiedRatio(){
        int noOfOccupiedRooms=0;

        for (Room room: hotel.getRooms()){
            if (room.isOccupied()){
                noOfOccupiedRooms++;
            }
        }
        return (noOfOccupiedRooms * 100) / hotel.getRooms().size();
    }


    public void giveAReview (Customer customer, int stars, String review){
        Review review1 = new Review(stars, review,customer);

        hotel.getReviews().add(review1);
    }

    public List<Review> getAllReviewsAboveStars(int stars){
        List<Review> reviewList = new ArrayList<>();
        for (Review review: hotel.getReviews()){
            if (review.getStars()>stars){
                reviewList.add(review);
            }
        }
        return reviewList;
    }

    private Hotel loadHotel() throws FileNotFoundException {
        File hotelFile = new File(resourceFilePath);
        Hotel hotel = null;
        try {
            Scanner sc = new Scanner(hotelFile);

            //set hotel
            hotel = loadHotel(sc);

            //set facilities
            ArrayList<String> listOfFacilities = loadFacilities(sc);
            hotel.setFacilities(listOfFacilities);

            //set contact details
            Contact contact = loadContact(sc);
            hotel.setContact(contact);

            //add rooms
            //single, 1, 1, false, true, false, 200, 100, false
            //apartment, 6, 2, false, true, false, 300, 200, true, 2
            //loop trough the txt file and add every room

            ArrayList<Room> roomsList = getRooms(sc);
            hotel.setRooms(roomsList);


            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            throw e;
        }
        return hotel;
    }

    private Hotel loadHotel(Scanner sc) {
        Hotel hotel;
        hotel = new Hotel();

        String line = sc.nextLine();
        String[] fields = line.split(",");

        hotel.setName(fields[0].trim());
        hotel.setStars(Integer.parseInt(fields[1].trim()));
        hotel.setNoOfParkingSpots(Integer.parseInt(fields[2].trim()));
        return hotel;
    }

    private ArrayList<String> loadFacilities(Scanner sc) {
        String line;
        line = sc.nextLine();
        String[] facilities = line.split(",");

        ArrayList<String> listOfFacilities = new ArrayList<>();
        for (int i = 0; i < facilities.length; i++) {
            listOfFacilities.add(facilities[i].trim());
        }
        return listOfFacilities;
    }

    private Contact loadContact(Scanner sc) {
        String line;
        line = sc.nextLine();
        String[] contactDetails = line.split(",");

        Address address = new Address(contactDetails[0].trim(), contactDetails[1].trim(), contactDetails[2].trim(), contactDetails[3].trim());
        return new Contact(contactDetails[4].trim(), address, contactDetails[5].trim(), contactDetails[6].trim());
    }

    private ArrayList<Room> getRooms(Scanner sc) {
        String line;
        ArrayList<Room> roomsList = new ArrayList<>();

        while (sc.hasNextLine()){
            line = sc.nextLine();
            String [] rooms = line.split(",");

            if(rooms[0].equals("single")){
                SingleRoom single = new SingleRoom(Integer.parseInt(rooms[1].trim()), Integer.parseInt(rooms[2].trim()),
                        Boolean.parseBoolean(rooms[3]), Boolean.parseBoolean(rooms[4]), Boolean.parseBoolean(rooms[5]),
                        Double.parseDouble(rooms[6].trim()), Integer.parseInt(rooms[7].trim()), Boolean.parseBoolean(rooms[8]));
                roomsList.add(single);
            }
            else if (rooms[0].equals("apartment")){
                Apartment apartment = new Apartment(Integer.parseInt(rooms[1].trim()), Integer.parseInt(rooms[2].trim()),
                        Boolean.parseBoolean(rooms[3]), Boolean.parseBoolean(rooms[4]), Boolean.parseBoolean(rooms[5]),
                        Integer.parseInt(rooms[6].trim()), Integer.parseInt(rooms[7].trim()), Boolean.parseBoolean(rooms[8]),Integer.parseInt(rooms[9].trim()));
                roomsList.add(apartment);
            }
        }
        return roomsList;
    }
}
