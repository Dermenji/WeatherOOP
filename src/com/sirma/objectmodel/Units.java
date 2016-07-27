package com.sirma.objectmodel;


public enum Units {
    TEMP("C"),
    PERCENT("%"),
    MM_KVM("мм/кв.м"),
    WIND("м/сек");

    private String unit;

    Units(String unit) {
        this.unit = unit;
    }

    public String value() {
        return unit;
    }
}
