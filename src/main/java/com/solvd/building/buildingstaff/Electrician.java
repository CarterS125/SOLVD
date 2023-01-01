package com.solvd.building.buildingstaff;

import com.solvd.building.buildingtools.WireCutter;
import com.solvd.building.materials.Wiring;

public class Electrician extends Builder {
    private Wiring wiring;
    private WireCutter wireCutter;


    public Electrician () {}

    public Electrician (Wiring wiring, WireCutter wireCutter) {
        this.wireCutter = wireCutter;
        this.wiring = wiring;
    }

    public Wiring getWiring() {
        return wiring;
    }

    public void setWiring(Wiring wiring) {
        this.wiring = wiring;
    }

    public WireCutter getWireCutter() {
        return wireCutter;
    }

    public void setWireCutter(WireCutter wireCutter) {
        this.wireCutter = wireCutter;
    }
}
