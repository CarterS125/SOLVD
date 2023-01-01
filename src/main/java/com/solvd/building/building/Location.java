package com.solvd.building.building;

public enum Location {
    CITY("miami") {
        @Override
        public boolean isTrue() {
            return false;
        }
    },
    STATE("florida") {
        @Override
        public boolean isTrue() {
            return false;
        }
    },
    COUNTY("Miami-Dade-County") {
        @Override
        public boolean isTrue() {
            return true;
        }
    },
    NEAROCEAN("Is Near Ocean") {
        @Override
        public boolean isTrue() {
            return false;
        }
    };

    Location(String information) {}

    public abstract boolean isTrue();

    public String information() {
        return information();
    }
}