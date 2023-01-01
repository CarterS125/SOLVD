package com.solvd.building.buildingtools;

public class Crane extends BuildingTool {
    private int height;
    private int amountCanLift;
    private int length;
    private int price;
    private String company;

    public Crane () {}

    public Crane (int height, int amountCanLift, int length, String company, int price) {
        this.company = company;
        this.price = price;
        this.amountCanLift = amountCanLift;
        this.height = height;
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAmountCanLift() {
        return amountCanLift;
    }

    public void setAmountCanLift(int amountCanLift) {
        this.amountCanLift = amountCanLift;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
