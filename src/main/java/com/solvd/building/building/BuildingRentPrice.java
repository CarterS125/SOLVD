package com.solvd.building.building;

public class BuildingRentPrice {
    private int normalRent;
    private int luxuryRent;
    private int pentHouseRent;

    public BuildingRentPrice(int normalRent, int luxuryRent, int pentHouseRent) {
        this.normalRent = normalRent;
        this.luxuryRent = luxuryRent;
        this.pentHouseRent = pentHouseRent;
    }

    public BuildingRentPrice() {

    }

    public int getNormalRent() {
        return normalRent;
    }

    public void setNormalRent(int normalRent) {
        normalRent = normalRent;
    }

    public int getLuxuryRent() {
        return luxuryRent;
    }

    public void setLuxuryRent(int luxuryRent) {
        luxuryRent = luxuryRent;
    }

    public int getPentHouseRent() {
        return pentHouseRent;
    }

    public void setPentHouseRent(int pentHouseRent) {
        pentHouseRent = pentHouseRent;
    }
}
