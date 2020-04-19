package org.ucode.hotelProject;

public class Apartment extends Room{
    private boolean hasKitchen;
    int noOfSpaces;

    public Apartment(int number, int numberOfBeds, boolean isSmoking, boolean hasMinibar, boolean isOccupied, double price, int sizeInSqrFt, boolean hasKitchen, int noOfSpaces) {
        super(number, numberOfBeds, isSmoking, hasMinibar, isOccupied, price, sizeInSqrFt);
        this.hasKitchen = hasKitchen;
        this.noOfSpaces = noOfSpaces;
    }

    public boolean isHasKitchen() {
        return hasKitchen;
    }

    public void setHasKitchen(boolean hasKitchen) {
        this.hasKitchen = hasKitchen;
    }

    public int getNoOfSpaces() {
        return noOfSpaces;
    }

    public void setNoOfSpaces(int noOfSpaces) {
        this.noOfSpaces = noOfSpaces;
    }
}
