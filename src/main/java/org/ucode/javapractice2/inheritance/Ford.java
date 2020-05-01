package org.ucode.javapractice2.inheritance;

public class Ford extends Car{
    private int carryingCapacity;

    public Ford(int weight, int length, int height, int currentVelocity, int currentDirection, int wheels, int doors, int gears, boolean isManual, int currentGear, int carryingCapacity) {
        super(weight, length, height, currentVelocity, currentDirection, wheels, doors, gears, isManual, currentGear);
        this.carryingCapacity = carryingCapacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity()+rate;
        if(newVelocity==0){
            stop();
        }
        else if (newVelocity>0 && newVelocity<=10){
            changeGear(1);
        }
        else if (newVelocity>10 && newVelocity<=20){
            changeGear(2);
        }
        else if (newVelocity>20 && newVelocity<=30){
            changeGear(3);
        }
        else {
            changeGear(4);
        }

        if (newVelocity>0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }



}
