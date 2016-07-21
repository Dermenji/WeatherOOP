package com.sirma.objectmodel;

public class Temperature extends Measurements {
    private int value;
    private static String unit = Units.TEMP.value();

    public Temperature(int value, String unit) {
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
        return "Temperature{" +
                "value=" + value +
                ", type='" + unit + '\'' +
                '}';
    }
}
