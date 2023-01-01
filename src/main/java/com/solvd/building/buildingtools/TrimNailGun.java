package com.solvd.building.buildingtools;

public class TrimNailGun extends BuildingTool{
    private int nailsNeeded;
    private int amountOfNailsCanShoot;
    private String brand;
    private int price;
    private String longivity;

    public TrimNailGun () {}

    public TrimNailGun(int price, int amountOfNailsCanShoot, int nailsNeeded, String brand, String longivity) {
        this.price = price;
        this.amountOfNailsCanShoot = amountOfNailsCanShoot;
        this.nailsNeeded = nailsNeeded;
        this.brand = brand;
        this.longivity = longivity;
    }

    public int getNailsNeeded() {
        return nailsNeeded;
    }

    public void setNailsNeeded(int nailsNeeded) {
        this.nailsNeeded = nailsNeeded;
    }

    public int getAmountOfNailsCanShoot() {
        return amountOfNailsCanShoot;
    }

    public void setAmountOfNailsCanShoot(int amountOfNailsCanShoot) {
        this.amountOfNailsCanShoot = amountOfNailsCanShoot;
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

    public String getLongivity() {
        return longivity;
    }

    public void setLongivity(String longivity) {
        this.longivity = longivity;
    }
}
