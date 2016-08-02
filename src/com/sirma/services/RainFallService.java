package com.sirma.services;

import com.sirma.dao.RainfallDAO;
import com.sirma.dto.RainfallDTO;

import java.util.ArrayList;

public class RainFallService implements RainfallDAO {
    private ArrayList<RainfallDTO> rainfallArrayList = new ArrayList<RainfallDTO>();

    public RainFallService() {

    }

    @Override
    public ArrayList<RainfallDTO> getAll() {
        return rainfallArrayList;
    }

    @Override
    public void addRainfall(RainfallDTO rainfall) {

    }

    @Override
    public void deleteRainfall(RainfallDTO rainfall) {

    }
}
