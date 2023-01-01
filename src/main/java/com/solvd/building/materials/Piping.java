package com.solvd.building.materials;

public class Piping extends BuildingMaterial {
    private int lengthNeeded;
    private String madeOf;
    private String glueOrScrewTogether;

    public Piping () {}

    public Piping (int lengthNeeded, String madeOf, String glueOrScrewTogether) {
        this.glueOrScrewTogether = glueOrScrewTogether;
        this.lengthNeeded = lengthNeeded;
        this.madeOf = madeOf;
    }

    public int getLengthNeeded() {
        return lengthNeeded;
    }

    public void setLengthNeeded(int lengthNeeded) {
        this.lengthNeeded = lengthNeeded;
    }

    public String getMadeOf() {
        return madeOf;
    }

    public void setMadeOf(String madeOf) {
        this.madeOf = madeOf;
    }

    public String getGlueOrScrewTogether() {
        return glueOrScrewTogether;
    }

    public void setGlueOrScrewTogether(String glueOrScrewTogether) {
        this.glueOrScrewTogether = glueOrScrewTogether;
    }
}
