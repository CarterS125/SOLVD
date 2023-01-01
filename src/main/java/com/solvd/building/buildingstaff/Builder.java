package com.solvd.building.buildingstaff;

public abstract class Builder {
    private String build;
    private String fName;
    private String lName;
    private String companyName;
    private int price;

    public Builder(){}

    public Builder(String build, String fName, String lName, String companyName, int price) {
        this.build = build;
        this.companyName = companyName;
        this.price = price;
        this.fName = fName;
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void Builder(String build) {
        this.build = build;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }
}
