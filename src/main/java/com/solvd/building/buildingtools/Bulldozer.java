package com.solvd.building.buildingtools;

public class Bulldozer extends BuildingTool {
    private String weight;
    private int weightCanHold;
    private String company;
    private int price;
    private int weightCanMove;

    public Bulldozer () {}

    public Bulldozer (String weight, int weightCanHold, int weightCanMove, String company, int price) {
        this.company = company;
        this.price = price;
        this.weightCanHold = weightCanHold;
        this.weight = weight;
        this.weightCanMove = weightCanMove;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getWeightCanHold() {
        return weightCanHold;
    }

    public void setWeightCanHold(int weightCanHold) {
        this.weightCanHold = weightCanHold;
    }

    public int getWeightCanMove() {
        return weightCanMove;
    }

    public void setWeightCanMove(int weightCanMove) {
        this.weightCanMove = weightCanMove;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
