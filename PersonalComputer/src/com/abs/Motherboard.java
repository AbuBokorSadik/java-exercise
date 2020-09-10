package com.abs;

public class Motherboard {
    private String model;
    private String menufacturer;
    private int ramSlot;
    private int cardSlot;
    private String bios;

    public Motherboard(String model, String menufacturer, int ramSlot, int cardSlot, String bios) {
        this.model = model;
        this.menufacturer = menufacturer;
        this.ramSlot = ramSlot;
        this.cardSlot = cardSlot;
        this.bios = bios;
    }

    public String getModel() {
        return model;
    }

    public String getMenufacturer() {
        return menufacturer;
    }

    public int getRamSlot() {
        return ramSlot;
    }

    public int getCardSlot() {
        return cardSlot;
    }

    public String getBios() {
        return bios;
    }

    public void loadProgram(String programName){
        System.out.println("Program " + programName +" is loading.....");
    }
}
