package com.solvd.building.elements;

import com.solvd.building.interfaces.IRoof;
import com.solvd.building.materials.Metal;
import com.solvd.building.materials.Wood;

public class Roof extends Element implements IRoof {
    private Wood wood;
    private Metal metal;
    private String durability;
    private String viewFromRoofTop;
    private int whenToReplace;

    public Roof(){}

    public Roof(Wood wood, Metal metal, String durability, String viewFromRoofTop, int whenToReplace) {
        this.durability = durability;
        this.metal = metal;
        this.viewFromRoofTop = viewFromRoofTop;
        this.wood = wood;
        this.whenToReplace = whenToReplace;
    }

    public Wood getWood() {
        return wood;
    }

    public void setWood(Wood wood) {
        this.wood = wood;
    }

    public Metal getMetal() {
        return metal;
    }

    public void setMetal(Metal metal) {
        this.metal = metal;
    }

    public String getDurability() {
        return durability;
    }

    public void setDurability(String durability) {
        this.durability = durability;
    }

    public String getViewFromRoofTop() {
        return viewFromRoofTop;
    }

    public void setViewFromRoofTop(String viewFromRoofTop) {
        this.viewFromRoofTop = viewFromRoofTop;
    }

    public int getWhenToReplace() {
        return whenToReplace;
    }

    public void setWhenToReplace(int whenToReplace) {
        this.whenToReplace = whenToReplace;
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
    public void buildRoof(Roof r) {

    }
}
