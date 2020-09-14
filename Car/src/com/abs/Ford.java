package com.abs;

public class Ford extends Car{
    public Ford(int cylinders) {
        super("Ford", cylinders);
    }

    @Override
    public void startEngine(){
        System.out.println("Start Ford engine");
    }

    @Override
    public void accelerate(){
        System.out.println("Ford accelerate");
    }

    @Override
    public void brake(){
        System.out.println("Ford break");
    }
}
