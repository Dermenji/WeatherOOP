package com.sirma.objectmodel;

public class Temperature extends Measurements {
    private int value;
    private final static String unit = Units.TEMP.value();

    public Temperature(int value, String unit) {
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
        return "Temperature{" +
                "value=" + value +
                ", type='" + unit + '\'' +
                '}';
    }
}
