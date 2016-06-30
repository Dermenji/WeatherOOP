package com.sirma.items;


public class WindSpeed {
    private int value;
    private String type;

    public WindSpeed(int value, String type) {
        this.value = value;
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "WindSpeed{" +
                "value=" + value +
                ", type='" + type + '\'' +
                '}';
    }
}
