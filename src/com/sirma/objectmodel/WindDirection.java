package com.sirma.objectmodel;

public class WindDirection extends Measurements {
    private int value;
    private Units unit;

    public WindDirection(int value, Units type) {
        this.value = value;
        this.unit = unit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Units getType() {
        return unit;
    }

    public void setType(Units type) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "WindDirection{" +
                "value=" + value +
                ", type='" + unit + '\'' +
                '}';
    }
}
