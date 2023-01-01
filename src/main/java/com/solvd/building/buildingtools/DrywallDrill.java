package com.solvd.building.buildingtools;

public class DrywallDrill extends BuildingTool {
    private String brand;
    private int price;
    private int screwsCanScrew;
    private int rpm;

    public DrywallDrill (){}

public DrywallDrill (String brand, int price, int screwsCanScrew, int rpm ) {
        this.brand = brand;
        this.price = price;
        this.rpm = rpm;
        this.screwsCanScrew = screwsCanScrew;
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

    public int getScrewsCanScrew() {
        return screwsCanScrew;
    }

    public void setScrewsCanScrew(int screwsCanScrew) {
        this.screwsCanScrew = screwsCanScrew;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }
}
