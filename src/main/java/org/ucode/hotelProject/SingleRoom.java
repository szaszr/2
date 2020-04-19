package org.ucode.hotelProject;

public class SingleRoom extends Room{
    private boolean hasBunkBeds;

    public SingleRoom(int number, int numberOfBeds, boolean isSmoking, boolean hasMinibar, boolean isOccupied, double price, int sizeInSqrFt, boolean hasBunkBeds) {
        super(number, numberOfBeds, isSmoking, hasMinibar, isOccupied, price, sizeInSqrFt);
        this.hasBunkBeds = hasBunkBeds;
    }

    public boolean isHasBunkBeds() {
        return hasBunkBeds;
    }

    public void setHasBunkBeds(boolean hasBunkBeds) {
        this.hasBunkBeds = hasBunkBeds;
    }
}
