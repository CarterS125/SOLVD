package com.solvd.building.materials;

public class Drywall extends BuildingMaterial {
    private int length;
    private int screwsNeededToSecure;
    private String durability;

    public Drywall () {}

    public Drywall (String durability, int screwsNeededToSecure, int length) {
        this.screwsNeededToSecure = screwsNeededToSecure;
        this.durability = durability;
        this.length = length;
    }

    public int getScrewsNeededToSecure() {
        return screwsNeededToSecure;
    }

    public void setScrewsNeededToSecure(int screwsNeededToSecure) {
        this.screwsNeededToSecure = screwsNeededToSecure;
    }

    public String getDurability() {
        return durability;
    }

    public void setDurability(String durability) {
        this.durability = durability;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
