package com.sirma.objectmodel;


public enum Units {
    TEMP("C"),
    PERCENT("%"),
    MM_KVM("мм/кв.м"),
    M_SEK("м/сек"),
    EAST,
    WEST,
    NORTH,
    SOUTH;

    private String unit;

    Units(String unit) {
        this.unit = unit;
    }

    Units() {

    }

    public String value() {
        return unit;
    }
}
