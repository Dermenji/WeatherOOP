package com.sirma.services;

import com.sirma.dao.CityDAO;
import com.sirma.dto.CityDTO;

import java.util.ArrayList;

public class CityService implements CityDAO {

    private ArrayList<CityDTO> cityArrayList = new ArrayList<CityDTO>();

    public CityService() {

    }
    @Override
    public ArrayList<CityDTO> getAll() {
        return cityArrayList;
    }

    @Override
    public CityDTO getCityByName(String name) {
        return null;
    }

    @Override
    public void addCity(CityDTO city) {

    }

    @Override
    public void deleteCity(CityDTO city) {

    }
}
