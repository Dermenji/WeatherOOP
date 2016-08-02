package com.sirma.dao;


import com.sirma.dto.RainfallDTO;

import java.util.List;

public interface RainfallDAO {
    List<RainfallDTO> getAll();

    void addRainfall(RainfallDTO rainfall);

    void deleteRainfall(RainfallDTO rainfall);
}
