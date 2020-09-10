package com.abs;

public class Dimensions {
    private int width;
    private int height;

    public Dimensions(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void getDimention(){
        System.out.println("Dimention width = " + width + "ft, height = " + height + " ft");
    }

    public double getArea(){
        return width * height;
    }
}
