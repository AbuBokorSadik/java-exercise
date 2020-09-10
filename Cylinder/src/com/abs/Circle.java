package com.abs;

public class Circle {
    private double radius;

    public Circle(double radious){
        if (radious < 0){
            this.radius = 0;
        }else {
            this.radius = radious;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
}
