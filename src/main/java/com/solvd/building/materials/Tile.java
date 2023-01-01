package com.solvd.building.materials;

public class Tile extends BuildingMaterial {
    private String style;
    private String madeOf;
    private String strength;

    public Tile () {}

    public Tile (String strength, String madeOf, String style) {
        this.madeOf = madeOf;
        this.strength = strength;
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getMadeOf() {
        return madeOf;
    }

    public void setMadeOf(String madeOf) {
        this.madeOf = madeOf;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

}
