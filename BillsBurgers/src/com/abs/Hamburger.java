package com.abs;

public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private double basePrice;

    private boolean extraCheese;
    private double extraCheesePrice;
    private boolean lettuce;
    private double lettucePrice;
    private boolean tomato;
    private double tomatoPrice;
    private boolean carrot;
    private double carrotPrice;

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public void setCarrot(boolean carrot) {
        this.carrot = carrot;
    }

    public Hamburger() {
        name = "Hamburger";
        breadRollType = "English Muffin";
        meat = "Beaf";
        basePrice = 12;
        extraCheese = false;
        extraCheesePrice = 5;
        lettuce = false;
        lettucePrice = 3;
        tomato = false;
        tomatoPrice = 2;
        carrot = false;
        carrotPrice = 1;
    }

    public Hamburger(String name, String breadRollType, String meat, double basePrice) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = basePrice;
    }
    
    public double priceTotal(){
        return basePrice + extraCheesePrice + lettucePrice + tomatoPrice + carrotPrice;
    }

    public String getName() {
        return name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public double getExtraCheesePrice() {
        return extraCheesePrice;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public double getLettucePrice() {
        return lettucePrice;
    }

    public boolean isTomato() {
        return tomato;
    }

    public double getTomatoPrice() {
        return tomatoPrice;
    }

    public boolean isCarrot() {
        return carrot;
    }

    public double getCarrotPrice() {
        return carrotPrice;
    }
}
