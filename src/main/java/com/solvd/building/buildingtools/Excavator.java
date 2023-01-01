package com.solvd.building.buildingtools;

public class Excavator extends BuildingTool {

    private int price;
    private String company;
    private int weightCanLift;
    private int materialCanMove;
    private String brand;
    private int age;

    public Excavator () {}

    public Excavator ( String company, int price, String brand, int age, int weightCanLift, int materialCanMove) {
        this.company = company;
        this.price = price;
        this.age = age;
        this.materialCanMove = materialCanMove;
        this.weightCanLift = weightCanLift;
        this.brand = brand;

    }

    public int getWeightCanLift() {
        return weightCanLift;
    }

    public void setWeightCanLift(int weightCanLift) {
        this.weightCanLift = weightCanLift;
    }

    public int getMaterialCanMove() {
        return materialCanMove;
    }

    public void setMaterialCanMove(int materialCanMove) {
        this.materialCanMove = materialCanMove;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
