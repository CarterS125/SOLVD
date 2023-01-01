package com.solvd.building.buildingtools;

public class PaintBrush_PaintRoller extends BuildingTool {
    private String brand;
    private int price;
    private int amountOfBrissels;
    private String abiltiesForEachBrush;

    public PaintBrush_PaintRoller() {}

    public PaintBrush_PaintRoller(String brand, int price, int amountOfBrissels, String abiltiesForEachBrush) {
        this.brand = brand;
        this.price = price;
        this.abiltiesForEachBrush = abiltiesForEachBrush;
        this.amountOfBrissels = amountOfBrissels;
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

    public int getAmountOfBrissels() {
        return amountOfBrissels;
    }

    public void setAmountOfBrissels(int amountOfBrissels) {
        this.amountOfBrissels = amountOfBrissels;
    }

    public String getAbiltiesForEachBrush() {
        return abiltiesForEachBrush;
    }

    public void setAbiltiesForEachBrush(String abiltiesForEachBrush) {
        this.abiltiesForEachBrush = abiltiesForEachBrush;
    }
}
