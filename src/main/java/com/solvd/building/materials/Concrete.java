package com.solvd.building.materials;

public class Concrete extends BuildingMaterial {
    private int weight;
    private String locationOfConcrete;
    private String strength;
    private String longivity;

    public Concrete () {}

    public Concrete (int weight, String longivity, String locationOfConcrete, String strength) {
        this.longivity = longivity;
        this.locationOfConcrete = locationOfConcrete;
        this.strength = strength;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getLocationOfConcrete() {
        return locationOfConcrete;
    }

    public void setLocationOfConcrete(String locationOfConcrete) {
        this.locationOfConcrete = locationOfConcrete;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getLongivity() {
        return longivity;
    }

    public void setLongivity(String longivity) {
        this.longivity = longivity;
    }

}
