package com.solvd.building.buildingtools;

public class CabinetDrill extends BuildingTool{
    private int rpm;
    private int screwsCanScrew;
    private String wirelessOrWired;
    private int price;

    public CabinetDrill () {}

    public CabinetDrill(int rpm, int screwsCanScrew, int price, String wirelessOrWired) {
        this.rpm = rpm;
        this.price = price;
        this.screwsCanScrew = screwsCanScrew;
        this.wirelessOrWired = wirelessOrWired;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public int getScrewsCanScrew() {
        return screwsCanScrew;
    }

    public void setScrewsCanScrew(int screwsCanScrew) {
        this.screwsCanScrew = screwsCanScrew;
    }

    public String getWirelessOrWired() {
        return wirelessOrWired;
    }

    public void setWirelessOrWired(String wirelessOrWired) {
        this.wirelessOrWired = wirelessOrWired;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
