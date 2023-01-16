package com.solvd.building.buildingtools;

public class BuildingTool {
    private String tool;

    public BuildingTool(String tool) {
        this.tool = tool;
    }

    public BuildingTool() {
    }

    public String getTools() {
        return tool;
    }

    public void setTools(String tool) {
        this.tool = tool;
    }

    public double getWeight() {
        return 0;
    }

    public Object getType() {
        return null;
    }
}
