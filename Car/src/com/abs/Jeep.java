package com.abs;

public class Jeep extends Car{
    public Jeep(int cylinders) {
        super("Jeep", cylinders);
    }

    @Override
    public void startEngine(){
        System.out.println("Start Jeep engine");
    }

    @Override
    public void accelerate(){
        System.out.println("Jeep accelerate");
    }

    @Override
    public void brake(){
        System.out.println("Jeep break");
    }
}
