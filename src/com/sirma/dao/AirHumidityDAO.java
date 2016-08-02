package com.sirma.dao;

import com.sirma.dto.AirHumidityDTO;

import java.util.List;

public interface AirHumidityDAO {
    List<AirHumidityDTO> getAll();

    void addAirHumidity(AirHumidityDTO airHumidity);

    void deleteAirHumidity(AirHumidityDTO airHumidity);
}
