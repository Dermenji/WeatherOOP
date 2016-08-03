package com.sirma.objectmodel;


import com.sirma.dto.MainDTO;

public class AirHumidity extends Measurements implements MainDTO {
    private int value;
    private final static String unit = Units.PERCENT.value();

    public AirHumidity(int value, String type) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "AirHumidity{" +
                "value=" + value +
                ", type='" + unit + '\'' +
                '}';
    }
}
