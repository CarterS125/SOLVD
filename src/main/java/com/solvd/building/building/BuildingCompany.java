package com.solvd.building.building;

public class BuildingCompany {
    private String companyName;
    private int yearsOfEXP;
    private int price;
    private int avgTimeline;
    private int numOfWorkers;

    public BuildingCompany() {}

    public BuildingCompany (String companyName, int yearsOfEXP, int price, int avgTimeline, int numOfWorkers) {
        this.avgTimeline = avgTimeline;
        this.companyName = companyName;
        this.numOfWorkers = numOfWorkers;
        this.yearsOfEXP = yearsOfEXP;
        this.price = price;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getYearsOfEXP() {
        return yearsOfEXP;
    }

    public void setYearsOfEXP(int yearsOfEXP) {
        this.yearsOfEXP = yearsOfEXP;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAvgTimeline() {
        return avgTimeline;
    }

    public void setAvgTimeline(int avgTimeline) {
        this.avgTimeline = avgTimeline;
    }

    public int getNumOfWorkers() {
        return numOfWorkers;
    }

    public void setNumOfWorkers(int numOfWorkers) {
        this.numOfWorkers = numOfWorkers;
    }
}
