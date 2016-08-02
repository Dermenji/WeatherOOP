package com.sirma.services;


import com.sirma.dao.WindDAO;
import com.sirma.dto.WindDTO;

import java.util.ArrayList;
import java.util.List;

public class WindService implements WindDAO {

    private ArrayList<WindDTO> windArrayList = new ArrayList<WindDTO>();

    @Override
    public List<WindDTO> getAll() {
        return windArrayList;
    }

    @Override
    public void addWind(WindDTO wind) {

    }

    @Override
    public void deleteWind(WindDTO wind) {

    }
}
