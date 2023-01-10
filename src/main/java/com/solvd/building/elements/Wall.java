package com.solvd.building.elements;

import com.solvd.building.interfaces.IWall;
import com.solvd.building.materials.Drywall;
import com.solvd.building.materials.Paint;
import com.solvd.building.materials.Wood;

public class Wall extends Element<T> implements IWall {
    private String sideOfBuilding;
    private int amountOfWindows;
    private Wood wood;
    private Drywall drywall;
    private Paint paint;

    public Wall(){}

    public Wall(int amountOfWindows, String sideOfBuilding, Wood wood, Paint paint, Drywall drywall) {
        this.amountOfWindows = amountOfWindows;
        this.sideOfBuilding = sideOfBuilding;
        this.drywall = drywall;
        this.wood = wood;
        this.paint = paint;
    }


    public String getSideOfBuilding() {
        return sideOfBuilding;
    }

    public void setSideOfBuilding(String sideOfBuilding) {
        this.sideOfBuilding = sideOfBuilding;
    }

    public int getAmountOfWindows() {
        return amountOfWindows;
    }

    public void setAmountOfWindows(int amountOfWindows) {
        this.amountOfWindows = amountOfWindows;
    }

    public Wood getWood() {
        return wood;
    }

    public void setWood(Wood wood) {
        this.wood = wood;
    }

    public Drywall getDrywall() {
        return drywall;
    }

    public void setDrywall(Drywall drywall) {
        this.drywall = drywall;
    }

    public Paint getPaint() {
        return paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public void buildWall(Wall w) {

    }
}
