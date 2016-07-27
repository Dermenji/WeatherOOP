package com.sirma.objectmodel;

public class Wind extends Measurements {
    private static final String UNIT = Units.WIND.value();

    private String value;
    private WindDirection direction;

    Wind(String value, WindDirection direction) {
        this.value = value;
        this.direction = direction;
    }

    public static String getUNIT() {
        return UNIT;
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
                "скорост " + this.value + " " + UNIT + ", " +
                "направление " + this.direction.value();
    }
}
