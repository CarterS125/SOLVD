package com.solvd.building.buildingtools;

public class ConcretePump extends BuildingTool {

    private String company;
    private int amountCanPump;
    private int areaCanCover;
    private int amountOfConcreteNeededToOperate;
    private int price;

    public ConcretePump () {}

    public ConcretePump ( String company, int price, int amountCanPump, int areaCanCover, int amountOfConcreteNeededToOperate) {
        this.company = company;
        this.price = price;
        this.amountCanPump = amountCanPump;
        this.amountOfConcreteNeededToOperate = amountOfConcreteNeededToOperate;
        this.areaCanCover = areaCanCover;
    }

    public int getAmountCanPump() {
        return amountCanPump;
    }

    public void setAmountCanPump(int amountCanPump) {
        this.amountCanPump = amountCanPump;
    }

    public int getAreaCanCover() {
        return areaCanCover;
    }

    public void setAreaCanCover(int areaCanCover) {
        this.areaCanCover = areaCanCover;
    }

    public int getAmountOfConcreteNeededToOperate() {
        return amountOfConcreteNeededToOperate;
    }

    public void setAmountOfConcreteNeededToOperate(int amountOfConcreteNeededToOperate) {
        this.amountOfConcreteNeededToOperate = amountOfConcreteNeededToOperate;
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
