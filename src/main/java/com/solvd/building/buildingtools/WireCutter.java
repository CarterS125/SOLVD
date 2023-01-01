package com.solvd.building.buildingtools;

public class WireCutter extends BuildingTool {
    private String brand;
    private String color;
    private String capabilites;
    private int amountOfWireCanCut;

    public WireCutter () {}

    public WireCutter(String brand, String color, String capabilites, int amountOfWireCanCut) {
        this.amountOfWireCanCut = amountOfWireCanCut;
        this.color = color;
        this.brand = brand;
        this.capabilites = capabilites;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCapabilites() {
        return capabilites;
    }

    public void setCapabilites(String capabilites) {
        this.capabilites = capabilites;
    }

    public int getAmountOfWireCanCut() {
        return amountOfWireCanCut;
    }

    public void setAmountOfWireCanCut(int amountOfWireCanCut) {
        this.amountOfWireCanCut = amountOfWireCanCut;
    }
}
