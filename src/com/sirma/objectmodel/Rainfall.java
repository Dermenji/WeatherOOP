package com.sirma.objectmodel;


public class Rainfall extends Measurements {
    private int value;
    private static String unit = Units.MM_KVM.value();

    public Rainfall(int value, String type) {
        this.value = value;
        this.unit = unit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getType() {
        return unit;
    }

    public void setType(Units type) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Rainfall{" +
                "value=" + value +
                ", type='" + unit + '\'' +
                '}';
    }
}
