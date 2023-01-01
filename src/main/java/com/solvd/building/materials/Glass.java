package com.solvd.building.materials;

public class Glass extends BuildingMaterial {
    private String strength;
    private int height;
    private int width;
    private String outsideOrInside;

    public Glass () {}

    public Glass (String outsideOrInside, int width, int height, String strength) {
        this.strength = strength;
        this.width = width;
        this.outsideOrInside = outsideOrInside;
        this.height = height;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getOutsideOrInside() {
        return outsideOrInside;
    }

    public void setOutsideOrInside(String outsideOrInside) {
        this.outsideOrInside = outsideOrInside;
    }
}
