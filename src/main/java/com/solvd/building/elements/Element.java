package com.solvd.building.elements;

import com.solvd.building.building.Building;
import com.solvd.building.building.Runner;
import com.solvd.building.exceptions.BuilderNotAvailableException;
import com.solvd.building.exceptions.BuildingMaterialNotFoundException;
import java.util.Collection;
import java.util.logging.Logger;

public class Element<T> {
    private int height;
    private int width;
    private int weight;
    private int columns;
    private int amount;

    public Element() {
    }

    public Element(int height, int width, int weight, int columns, int amount) {
        this.columns = columns;
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.amount = amount;
    }

    public Element(String element) {
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void add(Element<T> element) {
    }

    public void processBuilding(Building data, String element) throws BuildingMaterialNotFoundException, BuilderNotAvailableException {
        if (this.getApprovedElementsList().isEmpty()) {
            throw new BuildingMaterialNotFoundException(" WARNING: no material like that exists " + this.getApprovedElementsList() + " pick a different one!");
        }
    }

    private Collection<Object> getApprovedElementsList() {
        return null;
    }

    Logger logger = Logger.getLogger(Runner.class.getName());
    public void printElement(String element) {
        String message;
        message = "elements are floor, room, wall, roof, basement";
        logger.info(message);
    }
}
