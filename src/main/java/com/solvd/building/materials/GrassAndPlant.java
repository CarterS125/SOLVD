package com.solvd.building.materials;

public class GrassAndPlant extends BuildingMaterial{
    private String plants;
    private String SOD;

    public GrassAndPlant() {}

    public GrassAndPlant(String plants, String SOD) {
        this.plants = plants;
        this.SOD = SOD;
    }

    public String getPlants() {
        return plants;
    }

    public void setPlants(String plants) {
        this.plants = plants;
    }

    public String getSOD() {
        return SOD;
    }

    public void setSOD(String SOD) {
        this.SOD = SOD;
    }

}
