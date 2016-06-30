package com.sirma.items;


public class City {
    private String name;
    private Factors factors;

    public City(String name, Factors factors) {
        this.name = name;
        this.factors = factors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Factors getFactors() {
        return factors;
    }

    public void setFactors(Factors factors) {
        this.factors = factors;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", factors=" + factors.toString() +
                '}';
    }
}
