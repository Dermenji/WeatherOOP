package com.sirma.objectmodel;


public class AirHumidity extends Measurements {
    private int value;
    private final static String unit = Units.PERCENT.value();

    public AirHumidity(int value, String type) {
        this.value = value;
    }

    public static String getUnit() {
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
