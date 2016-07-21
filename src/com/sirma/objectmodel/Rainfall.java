package com.sirma.objectmodel;


public class Rainfall extends Measurements {
    private int value;
    private final static String unit = Units.MM_KVM.value();

    public Rainfall(int value, String type) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }


    @Override
    public String toString() {
        return "Rainfall{" +
                "value=" + value +
                ", type='" + unit + '\'' +
                '}';
    }
}
