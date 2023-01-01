package com.solvd.building.buildingstaff;

import com.solvd.building.buildingtools.TrimNailGun;
import com.solvd.building.materials.Trim;

public class TrimGuy extends Builder {
    private TrimNailGun trimNailGun;
    private Trim trim;

    public TrimGuy() {}

    public TrimGuy (Trim trim, TrimNailGun trimNailGun) {
        this.trimNailGun = trimNailGun;
        this.trim = trim;
    }

    public TrimNailGun getTrimNailGun() {
        return trimNailGun;
    }

    public void setTrimNailGun(TrimNailGun trimNailGun) {
        this.trimNailGun = trimNailGun;
    }

    public Trim getTrim() {
        return trim;
    }

    public void setTrim(Trim trim) {
        this.trim = trim;
    }
}
