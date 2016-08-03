package com.sirma.objectmodel;

import com.sirma.dto.WindDTO;

public class Wind extends Measurements implements WindDTO {
    private static final String unit = Units.WIND.value();

    private int value;
    private WindDirection direction;

    Wind(int value, WindDirection direction) {
        this.value = value;
        this.direction = direction;
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
