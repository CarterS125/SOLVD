package com.solvd.building.building;

public enum Resident {
    FNAME("residents first name") {
        @Override
        public boolean isTrue() {
            return false;
        }
    },
    LNAME("residents last name") {
        @Override
        public boolean isTrue() {
            return false;
        }
    },
    AGE("age of resident") {
        @Override
        public boolean isTrue() {
            return true;
        }
    },
    GENDER("gender of resident") {
        @Override
        public boolean isTrue() {
            return false;
        }
    },

    OCCUPATION("job of resident") {
        @Override
        public boolean isTrue () {
            return false;
        }
    };

    Resident(String information) {
    }

    public abstract boolean isTrue();

    public String information() {
        return information();
    }
}