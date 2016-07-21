package com.sirma.objectmodel;


public class WindSpeed extends Measurements {
    private int value;
    private static String unit = Units.M_SEK.value();

    public WindSpeed(int value, String type) {
        this.value = value;
        this.unit = type;
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
        return "WindSpeed{" +
                "value=" + value +
                ", type='" + unit + '\'' +
                '}';
    }
}
