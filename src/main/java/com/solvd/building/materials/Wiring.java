package com.solvd.building.materials;

public class Wiring extends BuildingMaterial {
    private String wattage;
    private String capabilites;
    private int lengthNeeded;

    public Wiring () {}

    public Wiring (String wattage, String capabilites, int lengthNeeded) {
        this.capabilites = capabilites;
        this.lengthNeeded = lengthNeeded;
        this.wattage = wattage;
    }

    public String getWattage() {
        return wattage;
    }

    public void setWattage(String wattage) {
        this.wattage = wattage;
    }

    public String getCapabilites() {
        return capabilites;
    }

    public void setCapabilites(String capabilites) {
        this.capabilites = capabilites;
    }

    public int getLengthNeeded() {
        return lengthNeeded;
    }

    public void setLengthNeeded(int lengthNeeded) {
        this.lengthNeeded = lengthNeeded;
    }
}
