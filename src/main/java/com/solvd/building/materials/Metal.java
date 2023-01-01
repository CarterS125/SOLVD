package com.solvd.building.materials;

public class Metal extends BuildingMaterial {
    private String type;
    private int weight;
    private String durability;

    public Metal () {}

    public Metal (int weight, String durability, String type) {
        this.durability = durability;
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getDurability() {
        return durability;
    }

    public void setDurability(String durability) {
        this.durability = durability;
    }
}
