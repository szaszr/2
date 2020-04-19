package org.ucode.hotelProject;

import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        HotelManager hotelManager = new HotelManager("C:\\Users\\fast\\IdeaProjects\\thirdlesson\\src\\main\\resources\\hotel.txt");

        List<Apartment> apartments =  hotelManager.listApartments();
        List<SingleRoom> singleRooms = hotelManager.listSingleRooms();

        //List all free rooms
        List <Room> freeRooms = hotelManager.listFreeRooms();

        //List all rooms with a given maximum price;
        List <Room> roomsWithPrice = hotelManager.listRoomsWithMaximumPrice(140);

        //Set rooms as occupied
        List<Apartment> allApartments = hotelManager.listApartments();
        //rent apartment
        hotelManager.rentRoom(1);

        hotelManager.freeRoom(1);

        hotelManager.rentRoom(1);
        hotelManager.rentRoom(2);
        hotelManager.rentRoom(3);

        hotelManager.getOccupiedRatio();

        //Create customer
        DateFormat formatter = new SimpleDateFormat("dd MM yyyy");
        Date birthDate = formatter.parse("12 03 1977");
        Date issuedAt = formatter.parse("12 03 1997");
        Date expiresAt = formatter.parse("12 03 2017");

        IdentityCard identityCard = new IdentityCard(birthDate,"somewhere in london", "351381331",issuedAt,birthDate);
        Customer customer = new Customer("Boris", "Johnson", identityCard , "boris.j@uk.com", false);

        hotelManager.giveAReview(customer, 5, "The staying was awesome");
        hotelManager.giveAReview(customer, 3, "The staying was awesome");
        hotelManager.giveAReview(customer, 4, "The staying was awesome");


        //get all reviews above x stars
        int stars = 3;
        List<Review> reviewsList = hotelManager.getAllReviewsAboveStars(stars);
        System.out.println(reviewsList.toString());

    }
}
