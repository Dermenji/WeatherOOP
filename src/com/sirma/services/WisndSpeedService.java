package com.sirma.services;

import com.sirma.dao.WindSpeedDAO;
import com.sirma.dto.WindSpeedDTO;

import java.util.ArrayList;
import java.util.List;

public class WisndSpeedService implements WindSpeedDAO {

    private ArrayList<WindSpeedDTO> windArrayList = new ArrayList<WindSpeedDTO>();

    @Override
    public List<WindSpeedDTO> getAll() {
        return windArrayList;
    }

    @Override
    public void addWindSpeed(WindSpeedDTO windSpeed) {

    }

    @Override
    public void deleteWindSpeed(WindSpeedDTO windSpeed) {

    }
}
