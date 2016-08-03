package com.sirma.objectmodel;


import com.sirma.dto.CityDTO;

public class City extends Measurements implements CityDTO {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
