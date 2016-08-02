package com.sirma.dao;


import com.sirma.dto.WindSpeedDTO;

import java.util.List;

public interface WindSpeedDAO {
    List<WindSpeedDTO> getAll();

    void addWindSpeed(WindSpeedDTO windSpeed);

    void deleteWindSpeed(WindSpeedDTO windSpeed);
}
