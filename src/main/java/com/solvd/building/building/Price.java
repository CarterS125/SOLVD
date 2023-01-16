package com.solvd.building.building;

public enum Price {

    PRICE("50 million dollars") {
        @Override
        public boolean isTrue() {
            return false;
        }
    },
    FINALPRICE("67 million dollars") {
        @Override
        public boolean isTrue() {
            return false;
        }
    };

    Price(String information) {}

    public abstract boolean isTrue();

    public String information() {
        return information();
    }

    public double getPrice() {
        return 0;
    }
}
