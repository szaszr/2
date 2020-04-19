package org.ucode.hotelProject;

public abstract class Room {
    private int number;
    private int numberOfBeds;
    private boolean isSmoking;
    private boolean hasMinibar;
    private boolean isOccupied;
    private double price;
    private int sizeInSqrFt;

    public Room(int number, int numberOfBeds, boolean isSmoking, boolean hasMinibar, boolean isOccupied, double price, int sizeInSqrFt) {
        this.number = number;
        this.numberOfBeds = numberOfBeds;
        this.isSmoking = isSmoking;
        this.hasMinibar = hasMinibar;
        this.isOccupied = isOccupied;
        this.price = price;
        this.sizeInSqrFt = sizeInSqrFt;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isSmoking() {
        return isSmoking;
    }

    public void setSmoking(boolean smoking) {
        isSmoking = smoking;
    }

    public boolean isHasMinibar() {
        return hasMinibar;
    }

    public void setHasMinibar(boolean hasMinibar) {
        this.hasMinibar = hasMinibar;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSizeInSqrFt() {
        return sizeInSqrFt;
    }

    public void setSizeInSqrFt(int sizeInSqrFt) {
        this.sizeInSqrFt = sizeInSqrFt;
    }
}
