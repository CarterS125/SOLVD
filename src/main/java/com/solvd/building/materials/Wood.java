package com.solvd.building.materials;

public class Wood extends BuildingMaterial {
    private String type;
    private String longivity;
    private String howWellCanItHoldUpInElements;

    public Wood () {}

    public Wood (String type, String longivity, String howWellCanItHoldUpInElements) {
        this.howWellCanItHoldUpInElements = howWellCanItHoldUpInElements;
        this.longivity = longivity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLongivity() {
        return longivity;
    }

    public void setLongivity(String longivity) {
        this.longivity = longivity;
    }

    public String getHowWellCanItHoldUpInElements() {
        return howWellCanItHoldUpInElements;
    }

    public void setHowWellCanItHoldUpInElements(String howWellCanItHoldUpInElements) {
        this.howWellCanItHoldUpInElements = howWellCanItHoldUpInElements;
    }
}
