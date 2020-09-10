package com.abs;

public class House {
    private Room room;
    private Dimensions dimensions;

    public House(Room room, Dimensions dimensions) {
        this.room = room;
        this.dimensions = dimensions;
    }

    public void roomDefinations(){
        System.out.println("Room area = " + dimensions.getArea() + " square feet");
        room.getRoomArea();
        room.getRoomFurniture();

    }
}
