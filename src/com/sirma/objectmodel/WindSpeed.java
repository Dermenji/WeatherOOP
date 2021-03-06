package com.sirma.objectmodel;


import com.sirma.dto.MainDTO;

public class WindSpeed extends Measurements implements MainDTO {
    private int value;
    private final static String unit = Units.WIND.value();

    public WindSpeed(int value, String type) {
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
        return "WindSpeed{" +
                "value=" + value +
                ", type='" + unit + '\'' +
                '}';
    }
}
