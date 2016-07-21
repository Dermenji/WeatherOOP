package com.sirma.objectmodel;

public class Temperature extends Measurements {
    private int value;
    private Unit type;

    public Temperature(int value, Unit type) {
        this.value = value;
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Unit getType() {
        return type;
    }

    public void setType(Unit type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "value=" + value +
                ", type='" + type + '\'' +
                '}';
    }
}
