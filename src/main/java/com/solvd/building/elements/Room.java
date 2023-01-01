package com.solvd.building.elements;

import com.solvd.building.elements.Element;
import com.solvd.building.interfaces.IRoom;

public class Room extends Element implements IRoom {

    private int floorNumber;
    private String design;
    private String sideOfBuilding;
    private String oceanOrCityView;
    private int squareFeet;

    public Room(){}

    public Room(String design, String sideOfBuilding, int floorNumber, int squareFeet, String oceanOrCityView) {
        this.design = design;
        this.floorNumber = floorNumber;
        this.oceanOrCityView = oceanOrCityView;
        this.squareFeet = squareFeet;
        this.sideOfBuilding = sideOfBuilding;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public String getSideOfBuilding() {
        return sideOfBuilding;
    }

    public void setSideOfBuilding(String sideOfBuilding) {
        this.sideOfBuilding = sideOfBuilding;
    }

    public String getOceanOrCityView() {
        return oceanOrCityView;
    }

    public void setOceanOrCityView(String oceanOrCityView) {
        this.oceanOrCityView = oceanOrCityView;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    @Override
    public String toString() {
        return super.toString();
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
    public void buildRoom(Room r) {

    }
}
