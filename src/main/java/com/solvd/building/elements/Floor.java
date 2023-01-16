package com.solvd.building.elements;

import com.solvd.building.interfaces.IFloor;
import com.solvd.building.materials.Concrete;
import com.solvd.building.materials.Drywall;
import com.solvd.building.materials.Paint;
import com.solvd.building.materials.Wiring;

public class Floor<T> extends Element<T> implements IFloor {
    public static final int GROUND = 2 ;
    private String design;
    private int numOfFloors;
    private int numOfRoomsOnEachFloor;
    private Concrete concrete;
    private Drywall drywall;
    private Paint paint;
    private Wiring wiring;

    public Floor() {}

    public Floor(String design, int numOfFloors, int numOfRoomsOnEachFloor, Concrete concrete, Drywall drywall, Paint paint, Wiring wiring) {
        this.concrete = concrete;
        this.numOfFloors = numOfFloors;
        this.wiring = wiring;
        this.drywall = drywall;
        this.paint = paint;
        this.design = design;
        this.numOfRoomsOnEachFloor = numOfRoomsOnEachFloor;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public int getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(int numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    public int getNumOfRoomsOnEachFloor() {
        return numOfRoomsOnEachFloor;
    }

    public void setNumOfRoomsOnEachFloor(int numOfRoomsOnEachFloor) {
        this.numOfRoomsOnEachFloor = numOfRoomsOnEachFloor;
    }

    public Concrete getConcrete() {
        return concrete;
    }

    public void setConcrete(Concrete concrete) {
        this.concrete = concrete;
    }

    public Drywall getDrywall() {
        return drywall;
    }

    public void setDrywall(Drywall drywall) {
        this.drywall = drywall;
    }

    public Paint getPaint() {
        return paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    public Wiring getWiring() {
        return wiring;
    }

    public void setWiring(Wiring wiring) {
        this.wiring = wiring;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void buildFloor(Floor f) {

    }
}

