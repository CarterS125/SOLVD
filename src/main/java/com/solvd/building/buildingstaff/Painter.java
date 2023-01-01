package com.solvd.building.buildingstaff;

import com.solvd.building.buildingtools.PaintBrush_PaintRoller;
import com.solvd.building.materials.Paint;

public class Painter extends Builder {
    private Paint paint;
    private PaintBrush_PaintRoller paintBrush_paintRoller;

    public Painter() {}

    public Paint getPaint() {
        return paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    public PaintBrush_PaintRoller getPaintBrush_paintRoller() {
        return paintBrush_paintRoller;
    }

    public void setPaintBrush_paintRoller(PaintBrush_PaintRoller paintBrush_paintRoller) {
        this.paintBrush_paintRoller = paintBrush_paintRoller;
    }

    public Painter (Paint paint, PaintBrush_PaintRoller paintBrush_paintRoller) {
        this.paint = paint;
        this.paintBrush_paintRoller = paintBrush_paintRoller;
    }
}
