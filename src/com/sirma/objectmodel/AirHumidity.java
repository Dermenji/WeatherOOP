package com.sirma.objectmodel;


public class AirHumidity extends Measurements {
    private int value;
    private  static String unit = Units.PERCENT.value();

    public AirHumidity(int value, Units type) {
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
        return "AirHumidity{" +
                "value=" + value +
                ", type='" + unit + '\'' +
                '}';
    }
}
