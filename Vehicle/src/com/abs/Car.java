package com.abs;

public class Car extends Vehicle{
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGears;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name,size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGears = 1;
    }

    public void changeGear(int currentGears) {
        this.currentGears = currentGears;
        System.out.println("Car.setCurrentGears(): changed to " + this.currentGears + " gear");
    }

    public void changeVelocity(int speed, int direction){
        System.out.println("changeVelocity(): velocity " + speed + " direction " + direction);
        move(speed,direction);
    }
}
