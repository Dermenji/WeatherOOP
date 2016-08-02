package com.sirma.dao;

import com.sirma.dto.CityDTO;

import java.util.List;

public interface CityDAO {
    List<CityDTO> getAll();

    CityDTO getCityByName(String name);

    void addCity(CityDTO city);

    void deleteCity(CityDTO city);
}
