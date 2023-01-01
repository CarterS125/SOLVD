package com.solvd.building.buildingtools;

public class GeneralTool extends BuildingTool {
    private int amountNeeded;
    private String durability;
    private String brand;
    private int price;

    public GeneralTool () {}

    public GeneralTool (int amountNeeded, String durability, String brand, int price) {
        this.price = price;
        this.amountNeeded = amountNeeded;
        this.brand = brand;
        this.durability = durability;

    }

    public int getAmountNeeded() {
        return amountNeeded;
    }

    public void setAmountNeeded(int amountNeeded) {
        this.amountNeeded = amountNeeded;
    }

    public String getDurability() {
        return durability;
    }

    public void setDurability(String durability) {
        this.durability = durability;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
