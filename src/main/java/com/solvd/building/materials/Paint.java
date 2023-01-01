package com.solvd.building.materials;

public class Paint extends BuildingMaterial {
    private String brandOfPaint;
    private int coatsNeeded;
    private String color;

    public Paint () {}

    public Paint (String brandOfPaint, int coatsNeeded, String color) {
        this.color = color;
        this.brandOfPaint = brandOfPaint;
        this.coatsNeeded = coatsNeeded;
    }

    public String getBrandOfPaint() {
        return brandOfPaint;
    }

    public void setBrandOfPaint(String brandOfPaint) {
        this.brandOfPaint = brandOfPaint;
    }

    public int getCoatsNeeded() {
        return coatsNeeded;
    }

    public void setCoatsNeeded(int coatsNeeded) {
        this.coatsNeeded = coatsNeeded;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
