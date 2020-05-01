package org.ucode.javapractice2.inheritance;

public class Car extends Vehicle{
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(int weight, int length, int height, int currentVelocity, int currentDirection, int wheels, int doors, int gears, boolean isManual, int currentGear) {
        super(weight, length, height, currentVelocity, currentDirection);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear){
        this.currentGear = currentGear;
        System.out.println("Car.changeGear(): Changed to "+currentGear+" gear.");
    }

    public void changeVelocity(int speed, int direction){
        move(speed, direction);
        System.out.println("Car.changeVelocity(): Velocity "+speed+" direction "+direction);
    }


}
