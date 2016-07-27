package com.sirma.objectmodel;

public enum WindDirection {
    NORTH("север"),
    EAST("изток"),
    WEST("запад"),
    SOUTH("юг");

    private String direction;

    WindDirection(String direction) {
        this.direction = direction;
    }

    public String value() {
        return direction;
    }
}
