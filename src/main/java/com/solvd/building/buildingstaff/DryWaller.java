package com.solvd.building.buildingstaff;

import com.solvd.building.buildingtools.DrywallDrill;
import com.solvd.building.materials.Drywall;

public class DryWaller extends Builder {
    private Drywall drywall;
    private DrywallDrill drywallDrill;

    public DryWaller() {}

    public DryWaller (DrywallDrill drywallDrill, Drywall drywall) {
        this.drywall = drywall;
        this.drywallDrill = drywallDrill;
    }

    public Drywall getDrywall() {
        return drywall;
    }

    public void setDrywall(Drywall drywall) {
        this.drywall = drywall;
    }

    public DrywallDrill getDrywallDrill() {
        return drywallDrill;
    }

    public void setDrywallDrill(DrywallDrill drywallDrill) {
        this.drywallDrill = drywallDrill;
    }
}
