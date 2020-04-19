package org.ucode.petshopProject;

public class InventoryItem {
    private double price;
    private int quantity;
    private Pet item;

    public InventoryItem(int price, int quantity, Pet pet) {
        this.price = price;
        this.quantity = quantity;
        this.item = pet;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Pet getItem() {
        return item;
    }

    public void setItem(Pet item) {
        this.item = item;
    }
}
