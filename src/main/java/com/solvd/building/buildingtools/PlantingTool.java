package com.solvd.building.buildingtools;

public class PlantingTool extends BuildingTool {
    private String brand;
    private int price;
    private int plantAmount;
    private String durability;

    public PlantingTool() {}

    public PlantingTool(String brand, String durability, int price, int plantAmount) {
        this.brand = brand;
        this.plantAmount = plantAmount;
        this.price = price;
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

    public int getPlantAmount() {
        return plantAmount;
    }

    public void setPlantAmount(int plantAmount) {
        this.plantAmount = plantAmount;
    }

    public String getDurability() {
        return durability;
    }

    public void setDurability(String durability) {
        this.durability = durability;
    }
}
