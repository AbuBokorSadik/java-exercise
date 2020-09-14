package com.abs;

public class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.engine = true;
        this.wheels = 4;
        this.name = name;
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine(){
        System.out.println("Start car engine");
    }

    public void accelerate(){
        System.out.println("Car accelerate");
    }

    public void brake(){
        System.out.println("Car brake");
    }
}
