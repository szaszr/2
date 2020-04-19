package org.ucode.petshopProject;

public class Cat extends Mammal {
    private boolean isIndoor;

    public boolean isIndoor() {
        return isIndoor;
    }

    public void setIndoor(boolean indoor) {
        this.isIndoor = indoor;
    }

    public Cat(boolean indoor) {
        this.isIndoor = indoor;
    }
}
