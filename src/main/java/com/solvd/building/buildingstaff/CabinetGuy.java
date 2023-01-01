package com.solvd.building.buildingstaff;

import com.solvd.building.buildingtools.CabinetDrill;
import com.solvd.building.materials.Cabinets;

public class CabinetGuy extends Builder {
    private CabinetDrill cabinetDrill;
    private Cabinets cabinets;

    public CabinetGuy (Cabinets cabinets, CabinetDrill cabinetDrill) {
        this.cabinetDrill = cabinetDrill;
        this.cabinets = cabinets;
    }

    public CabinetGuy() {

    }

    public CabinetDrill getCabinetDrill() {
        return cabinetDrill;
    }

    public void setCabinetDrill(CabinetDrill cabinetDrill) {
        this.cabinetDrill = cabinetDrill;
    }

    public Cabinets getCabinets() {
        return cabinets;
    }

    public void setCabinets(Cabinets cabinets) {
        this.cabinets = cabinets;
    }
}
