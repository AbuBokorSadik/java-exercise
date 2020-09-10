package com.abs;

public class Furniture {
    private String name;
    private String material;
    private String color;
    Dimensions dimensions;

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Furniture(String name, String material, String color, Dimensions dimensions) {
        this.name = name;
        this.material = material;
        this.color = color;
        this.dimensions = dimensions;
    }

    public void getFurniture(){
        System.out.println(name);
        System.out.println("Menurecturing meterial = " + material);
        System.out.println("Color = " + color);
        dimensions.getDimention();
    }
}
