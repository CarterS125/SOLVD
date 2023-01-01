package com.solvd.building.materials;

public abstract class BuildingMaterial {
    private String material;
    private String amount;
    private int price;

    public BuildingMaterial() {}

    public BuildingMaterial(String materials, String amount, int price) {
        this.material = materials;
        this.price = price;
        this.amount = amount;
    }

    public String getMaterials() {
        return material;
    }

    public void setMaterials(String material) {
        this.material = material;
    }
}