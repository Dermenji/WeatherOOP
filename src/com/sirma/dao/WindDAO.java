package com.sirma.dao;


import com.sirma.dto.WindDTO;

import java.util.List;

public interface WindDAO {
    List<WindDTO> getAll();

    void addWind(WindDTO wind);

    void deleteWind(WindDTO wind);
}
