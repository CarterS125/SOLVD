package com.solvd.building.materials;

public class Trim extends BuildingMaterial {
    private String type;
    private int length;

    public Trim() {}

    public Trim(int length, String type) {
        this.type = type;
        this.length = length;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
