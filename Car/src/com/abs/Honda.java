package com.abs;

public class Honda extends Car{
    public Honda(int cylinders) {
        super("Honda", cylinders);
    }

    @Override
    public void startEngine(){
        System.out.println("Start Honda engine");
    }

    @Override
    public void accelerate(){
        System.out.println("Honda accelerate");
    }

    @Override
    public void brake(){
        System.out.println("Honda break");
    }
}
