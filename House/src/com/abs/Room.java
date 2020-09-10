package com.abs;

public class Room {
    private String type;
    private Dimensions dimensions;
    private Furniture furniture;

    public String getType() {
        return type;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public Room(String type, Dimensions dimensions, Furniture furniture) {
        this.type = type;
        this.dimensions = dimensions;
        this.furniture = furniture;
    }

    public void getRoomArea(){
        System.out.println(type);
        System.out.println("Room area = " + dimensions.getArea() + " square feet");
    }
    public void getRoomFurniture(){
        furniture.getFurniture();
    }
}
