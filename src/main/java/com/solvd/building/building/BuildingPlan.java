package com.solvd.building.building;

import com.solvd.building.elements.Floor;
import com.solvd.building.elements.Room;

public class BuildingPlan {
    private String architecture;
    private int squareFeet;
    private Room rooms;
    private String color;
    private Floor Floor;

    private int capacity;

    public void BuildingPlan(String architecture, int squareFeet, Room rooms, Floor floors, String color, int capacity) {
        this.architecture = architecture;
        this.color = color;
        this.Floor = Floor;
        this.rooms = rooms;
        this.squareFeet = squareFeet;
        this.capacity = capacity;
    }

    public BuildingPlan(){}

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        architecture = architecture;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        squareFeet = squareFeet;
    }

    public Floor getFloor() {
        return Floor;
    }

    public void setFloors(Floor floor) {
        Floor = floor;
    }

    public Room getRooms() {
        return rooms;
    }

    public void setRooms(Room rooms) {
        this.rooms = rooms;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        color = color;
    }

    public void setFloor(com.solvd.building.elements.Floor floor) {
        Floor = floor;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
