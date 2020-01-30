package org.ucode.homework9;

import java.util.ArrayList;
import java.util.Scanner;

public class CarRentalService {
    public static void main(String[] args) {
        ArrayList<Car> inventory = new ArrayList<Car>();
        ArrayList<Car> availableCars = new ArrayList<Car>();
        ArrayList<Car> rentedCars = new ArrayList<Car>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Robert's Car Rental Service");
        String input;
        do {
            System.out.println("Please choose from the following options: ");
            System.out.println("\t1. Add a new car.");
            System.out.println("\t2. Display the inventory of cars");
            System.out.println("\t3. Rent a car");
            System.out.println("\t4. Return a car");
            System.out.println("\t5. Quit program");
            System.out.println(">");

            input = sc.next();

            if (input.equals("1")) {
                System.out.println("Please specify the new car id");
                int id = sc.nextInt();
                for (int i = 0; i < inventory.size(); i++) {
                    if (id == inventory.get(i).carID) {
                        System.out.println("That car id is already taken. Please specify another one.");
                        id = sc.nextInt();
                    }
                }
                System.out.println("Please specify the make");
                String make = sc.next();
                while (make.length() > 50) {
                    System.out.println("Make of the car can not be equal to or more than 50 characters. Please try again");
                    make = sc.next();
                }
                System.out.println("Please specify the model");
                String model = sc.next();
                while (model.length() > 50) {
                    System.out.println("Model of the car can not be equal to or more than 50 characters. Please try again");
                    model = sc.next();
                }
                System.out.println("Please specify the rental price");
                int rentalPrice = sc.nextInt();
                while (rentalPrice <= 0) {
                    System.out.println("Please input a correct rental price(more than 0)");
                    rentalPrice = sc.nextInt();
                }
                System.out.println("Please specify the year");
                int year = sc.nextInt();
                while (year <= 0) {
                    System.out.println("Please input a correct year(more than 0)");
                    year = sc.nextInt();
                }
                System.out.println("Please specify the mileage");
                int mileage = sc.nextInt();
                while (mileage <= 0) {
                    System.out.println("Please input a correct mileage(more than 0)");
                    mileage = sc.nextInt();
                }
                System.out.println("Please specify the fuel");
                String fuelType = sc.next();
                while (!fuelType.equals("petrol") || !fuelType.equals("diesel") || !fuelType.equals("electric")) {
                    System.out.println("Please specify a valid fuel type(petrol, diesel or electric)");
                    fuelType = sc.next();
                }
                inventory.add(new Car(id, make, model, rentalPrice, year, mileage, fuelType));
                availableCars.add(new Car(id, make, model, rentalPrice, year, mileage, fuelType));
                System.out.println("New car added");
            } else if (input.equals("2")) {
                for (int i = 0; i < inventory.size(); i++) {
                    System.out.println("car id: " + inventory.get(i).carID);
                    System.out.println("make: " + inventory.get(i).make);
                    System.out.println("model: " + inventory.get(i).model);
                    System.out.println("rental price: " + inventory.get(i).rentalPrice);
                    System.out.println("year: " + inventory.get(i).year);
                    System.out.println("mileage: " + inventory.get(i).mileage);
                    System.out.println("fuel type: " + inventory.get(i).fuelType);
                    System.out.println();
                }
            }
            else if (input.equals("3")) {
                /*while (availableCars.size() != 0) {
                    if (availableCars.size() == 0) {
                        System.out.println("We are sorry but right now we do not have any available cars.");
                        input = sc.next();
                    }*/
                    System.out.println("Please specify the car ID which the customer would like to rent");
                    int rent = sc.nextInt();
                    for (int i = 0; i < availableCars.size(); i++) {
                        if (rent == availableCars.get(i).carID) {
                            rentedCars.add(new Car(inventory.get(i).carID, inventory.get(i).make, inventory.get(i).model, inventory.get(i).rentalPrice, inventory.get(i).year, inventory.get(i).mileage, inventory.get(i).fuelType));
                            availableCars.remove(new Car(inventory.get(i).carID, inventory.get(i).make, inventory.get(i).model, inventory.get(i).rentalPrice, inventory.get(i).year, inventory.get(i).mileage, inventory.get(i).fuelType));
                            System.out.println("Successful rental for car with id " + inventory.get(i).carID);
                        }
                        while (rent != availableCars.get(i).carID) {
                            System.out.println("Car with id " + rent + " is not available. Please try again");
                            rent = sc.nextInt();
                        }
                    }
                }
            else if (input.equals("4")) {
                /*while (rentedCars.size() == 0) {
                    System.out.println("There are no rented out cars, please first rent a car and then return it.");
                }*/
                System.out.println("Please specify the car ID which the customer would like to rent");
                int returnCar = sc.nextInt();
                for (int i = 0; i < rentedCars.size(); i++) {
                    if (returnCar == rentedCars.get(i).carID) {
                        rentedCars.remove(new Car(inventory.get(i).carID, inventory.get(i).make, inventory.get(i).model, inventory.get(i).rentalPrice, inventory.get(i).year, inventory.get(i).mileage, inventory.get(i).fuelType));
                        availableCars.add(new Car(inventory.get(i).carID, inventory.get(i).make, inventory.get(i).model, inventory.get(i).rentalPrice, inventory.get(i).year, inventory.get(i).mileage, inventory.get(i).fuelType));
                        System.out.println("Successful return for car with id " + inventory.get(i).carID);
                    }
                    while (returnCar != rentedCars.get(i).carID) {
                        System.out.println("Car with id " + returnCar + " was not rented. Please try again.");
                        returnCar = sc.nextInt();
                    }
                }
            }
        }
        while (!input.equals("5"));
    }
}
