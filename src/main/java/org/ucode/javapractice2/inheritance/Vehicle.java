package org.ucode.javapractice2.inheritance;

// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.

public class Vehicle {
    private int weight;
    private int length;
    private int height;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(int weight, int length, int height, int currentVelocity, int currentDirection) {
        this.weight = weight;
        this.length = length;
        this.height = height;
        this.currentVelocity = currentVelocity;
        this.currentDirection = currentDirection;
    }

    public void stop(){
        this.currentVelocity=0;
    }

    public void steer (int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at "+currentDirection+" degrees.");
    }

    public void move (int velocity, int direction){
        currentVelocity=velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at "+currentVelocity+" in direction "+currentDirection);
    }

    public int getWeight() {
        return weight;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
