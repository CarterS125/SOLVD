package com.solvd.building.buildingstaff;

import com.solvd.building.buildingtools.PipeCutter;
import com.solvd.building.materials.Piping;

public class Plumber extends Builder {
    private Piping piping;
    private PipeCutter pipeCutter;

    public Plumber () {}

    public Plumber (PipeCutter pipeCutter, Piping piping) {
        this.pipeCutter = pipeCutter;
        this.piping = piping;
    }

    public Piping getPiping() {
        return piping;
    }

    public void setPiping(Piping piping) {
        this.piping = piping;
    }

    public PipeCutter getPipeCutter() {
        return pipeCutter;
    }

    public void setPipeCutter(PipeCutter pipeCutter) {
        this.pipeCutter = pipeCutter;
    }
}
