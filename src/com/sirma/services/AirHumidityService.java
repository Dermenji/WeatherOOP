package com.sirma.services;


import com.sirma.dao.AirHumidityDAO;
import com.sirma.dto.AirHumidityDTO;

import java.util.ArrayList;

public class AirHumidityService implements AirHumidityDAO {

    private ArrayList<AirHumidityDTO> airHumidityArrayList = new ArrayList<AirHumidityDTO>();

    public AirHumidityService() {

    }

    @Override
    public ArrayList<AirHumidityDTO> getAll() {
        return airHumidityArrayList;
    }

    @Override
    public void addAirHumidity(AirHumidityDTO airHumidity) {

    }

    @Override
    public void deleteAirHumidity(AirHumidityDTO airHumidity) {

    }
}
