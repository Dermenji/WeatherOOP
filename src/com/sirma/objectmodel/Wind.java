package com.sirma.objectmodel;

public class Wind extends Measurements {
    private static final String unit = Units.WIND.value();

    private String value;
    private WindDirection direction;

    Wind(String value, WindDirection direction) {
        this.value = value;
        this.direction = direction;
    }

    public static String getUnit() {
        return unit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public WindDirection getDirection() {
        return direction;
    }

    public void setDirection(WindDirection direction) {
        this.direction = direction;
    }

    public String toString() {
        return "Вятър: " +
                "скорост " + this.value + " " + unit + ", " +
                "направление " + this.direction.value();
    }
}
