package com.sirma.services;

import com.sirma.dao.TemperatureDAO;
import com.sirma.dto.TemperatureDTO;

import java.util.ArrayList;


public class TemperatureService implements TemperatureDAO {

    private ArrayList<TemperatureDTO> temperatureArrayList = new ArrayList<TemperatureDTO>();

    @Override
    public ArrayList<TemperatureDTO> getAll() {
        return temperatureArrayList;
    }

    @Override
    public void addTemperature(TemperatureDTO temperature) {

    }

    @Override
    public void deleteTemperature(TemperatureDTO temperature) {

    }
}
