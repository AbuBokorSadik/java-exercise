package com.abs;

public class HealthyBurger extends Hamburger{
    private boolean mushroom;
    private double mushroomPrice;
    private boolean arugula;
    private double arugulaPrice;

    public HealthyBurger() {
        super("Happy Burger", "Brown Rye", "Turkey", 15);
        mushroom = false;
        mushroomPrice = 0;
        arugula = false;
        arugulaPrice = 0;
    }

    public HealthyBurger(String name, String breadRollType, String meat, double basePrice) {
        super(name, breadRollType, meat, basePrice);
    }

    @Override
    public double priceTotal() {
        return super.priceTotal() + mushroomPrice + arugulaPrice;
    }

    public boolean isMushroom() {
        return mushroom;
    }

    public void setMushroom(boolean mushroom) {
        this.mushroom = mushroom;
    }

    public double getMushroomPrice() {
        return mushroomPrice;
    }

    public void setMushroomPrice(double mushroomPrice) {
        this.mushroomPrice = mushroomPrice;
    }

    public boolean isArugula() {
        return arugula;
    }

    public void setArugula(boolean arugula) {
        this.arugula = arugula;
    }

    public double getArugulaPrice() {
        return arugulaPrice;
    }

    public void setArugulaPrice(double arugulaPrice) {
        this.arugulaPrice = arugulaPrice;
    }
}
