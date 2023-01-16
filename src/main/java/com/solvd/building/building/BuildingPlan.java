package com.solvd.building.building;

import com.solvd.building.elements.Floor;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class BuildingPlan {

    static Logger logger = Logger.getLogger(BuildingPlan.class.getName());
    private String architecture;
    private int squareFeet;
    private int rooms;
    private String color;
    private Floor floor;
    private int capacity;

    public BuildingPlan(String architecture, int squareFeet, int rooms, String color) {
        this.architecture = architecture;
        this.squareFeet = squareFeet;
        this.rooms = rooms;
        this.color = color;
        this.floor = floor;
        this.capacity = capacity;

        List<BuildingPlan> buildings = Arrays.asList(
                new BuildingPlan("Contemporary", 2000, 4, "Blue"),
                new BuildingPlan("Mediterranean", 1500, 3, "White"),
                new BuildingPlan("Victorian", 2500, 5, "Yellow"),
                new BuildingPlan("Colonial", 3000, 6, "Green")
        );

        List<BuildingPlan> filteredBuildings = buildings.stream()
                .filter(b -> b.getArchitecture().equals("Contemporary") && b.getSquareFeet() > 2000 && b.getRooms() > 4)
                .sorted((b1, b2) -> Integer.compare(b2.getCapacity(), b1.getCapacity()))
                .collect(Collectors.toList());
        logger.info("Filtered buildings sorted by capacity: " + filteredBuildings);
    }

    public String getArchitecture() {
        return architecture;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public int getRooms() {
        return rooms;
    }

    public int getCapacity() {
        return capacity;
    }

}
