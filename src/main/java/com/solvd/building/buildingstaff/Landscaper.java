package com.solvd.building.buildingstaff;

import com.solvd.building.buildingtools.PlantingTool;
import com.solvd.building.materials.GrassAndPlant;

public class Landscaper extends Builder {
    private GrassAndPlant grassAndPlant;
    private PlantingTool plantingTool;

    public Landscaper() {}

    public Landscaper (GrassAndPlant grassAndPlant, PlantingTool plantingTool) {
        this.grassAndPlant = grassAndPlant;
        this.plantingTool = plantingTool;
    }

    public GrassAndPlant getGrassAndPlant() {
        return grassAndPlant;
    }

    public void setGrassAndPlant(GrassAndPlant grassAndPlant) {
        this.grassAndPlant = grassAndPlant;
    }

    public PlantingTool getPlantingTool() {
        return plantingTool;
    }

    public void setPlantingTool(PlantingTool plantingTool) {
        this.plantingTool = plantingTool;
    }
}
