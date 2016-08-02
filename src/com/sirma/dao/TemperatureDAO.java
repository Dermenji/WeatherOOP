package com.sirma.dao;


import com.sirma.dto.TemperatureDTO;

import java.util.List;

public interface TemperatureDAO {
    List<TemperatureDTO> getAll();

    void addTemperature(TemperatureDTO temperature);

    void deleteTemperature(TemperatureDTO temperature);
}
