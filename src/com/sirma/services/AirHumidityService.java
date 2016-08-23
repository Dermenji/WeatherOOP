package com.sirma.services;


import com.sirma.dao.AbstractController;
import com.sirma.dto.MainDTO;
import com.sirma.objectmodel.AirHumidity;

import java.util.ArrayList;
import java.util.List;

public class AirHumidityService extends AbstractController {
    private ArrayList<AirHumidity> airArrayList = new ArrayList<AirHumidity>();

    public AirHumidityService() {

    }

    @Override
    public List getAll() {
        return null;
    }

    @Override
    public Object update(Object entity) {
        return null;
    }

    @Override
    public Object add(Object entity) {
        return null;
    }

    @Override
    public Object getEntityById(Object id) {
        return null;
    }

    @Override
    public Object getByName(Object name) {
        return null;
    }

    @Override
    public boolean remove(Object id) {
        return false;
    }

    @Override
    public boolean create(Object entity) {
        return false;
    }
}
