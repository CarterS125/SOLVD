package com.solvd.building.elements;

import com.solvd.building.interfaces.IBasement;
import com.solvd.building.materials.Concrete;

public class Basement extends Element<T> implements IBasement {
    private int parkingSpacesAvailable;
    private Concrete concrete;
    private int depth;
    private int numOfFloors;
    private int weightCanHold;
    private String durability;

    public Basement() {
    }

    public Basement(int parkingSpacesAvailable, Concrete concrete, int depth, int weightCanHold, int numOfFloors, String durability) {
        this.concrete = concrete;
        this.depth = depth;
        this.durability = durability;
        this.numOfFloors = numOfFloors;
        this.weightCanHold = weightCanHold;
        this.parkingSpacesAvailable = parkingSpacesAvailable;
    }

    public Concrete getConcrete() {
        return concrete;
    }

    public void setConcrete(Concrete concrete) {
        this.concrete = concrete;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(int numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    public int getWeightCanHold() {
        return weightCanHold;
    }

    public void setWeightCanHold(int weightCanHold) {
        this.weightCanHold = weightCanHold;
    }

    public String getDurability() {
        return durability;
    }

    public void setDurability(String durability) {
        this.durability = durability;
    }

    public int getParkingSpacesAvailable() {
        return parkingSpacesAvailable;
    }

    public void setParkingSpacesAvailable(int parkingSpacesAvailable) {
        this.parkingSpacesAvailable = parkingSpacesAvailable;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void buildBasement(Basement b) {

    }
}