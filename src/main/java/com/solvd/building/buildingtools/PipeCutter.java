package com.solvd.building.buildingtools;

public class PipeCutter extends BuildingTool {
    private int size;
    private String brand;
    private int price;
    private String madeOf;
    private String length;

    public PipeCutter(int size, int price, String brand, String length, String madeOf) {
        this.brand = brand;
        this.size = size;
        this.price = price;
        this.length = length;
        this.madeOf = madeOf;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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

    public String getMadeOf() {
        return madeOf;
    }

    public void setMadeOf(String madeOf) {
        this.madeOf = madeOf;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
}
