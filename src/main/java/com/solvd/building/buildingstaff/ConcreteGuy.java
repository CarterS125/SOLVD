package com.solvd.building.buildingstaff;

import com.solvd.building.buildingtools.ConcretePump;
import com.solvd.building.materials.Concrete;

public class ConcreteGuy extends Builder {
    private Concrete concrete;
    private ConcretePump concretePump;

    public ConcreteGuy(Concrete concrete, ConcretePump concretePump) {
        this.concrete = concrete;
        this.concretePump = concretePump;
    }

    public ConcreteGuy() {

    }

    public Concrete getConcrete() {
        return concrete;
    }

    public void setConcrete(Concrete concrete) {
        this.concrete = concrete;
    }

    public ConcretePump getConcretePump() {
        return concretePump;
    }

    public void setConcretePump(ConcretePump concretePump) {
        this.concretePump = concretePump;
    }
}