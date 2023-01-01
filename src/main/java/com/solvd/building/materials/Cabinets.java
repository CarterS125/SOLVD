package com.solvd.building.materials;

public class Cabinets extends BuildingMaterial {
    private String companyTheyCameFrom;
    private String durability;
    private int numOfCabinetsRequired;
    private String strength;

    public Cabinets() {}

    public Cabinets(String durability, int numOfCabinetsRequired, String strength, String companyTheyCameFrom) {
        this.numOfCabinetsRequired = numOfCabinetsRequired;
        this.companyTheyCameFrom = companyTheyCameFrom;
        this.strength = strength;
        this.durability = durability;
    }

    public String getDurability() {
        return durability;
    }

    public void setDurability(String durability) {
        this.durability = durability;
    }

    public int getNumOfCabinetsRequired() {
        return numOfCabinetsRequired;
    }

    public void setNumOfCabinetsRequired(int numOfCabinetsRequired) {
        this.numOfCabinetsRequired = numOfCabinetsRequired;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getCompanyTheyCameFrom() {
        return companyTheyCameFrom;
    }

    public void setCompanyTheyCameFrom(String companyTheyCameFrom) {
        this.companyTheyCameFrom = companyTheyCameFrom;
    }

}
