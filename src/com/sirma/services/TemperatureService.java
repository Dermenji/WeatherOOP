package com.sirma.services;

import com.sirma.dao.AbstractController;
import com.sirma.dto.MainDTO;
import com.sirma.objectmodel.Temperature;

import java.util.ArrayList;
import java.util.List;


public class TemperatureService extends AbstractController {

    private ArrayList<Temperature> temperatureArrayList = new ArrayList<Temperature>();


    @Override
    public List getAll() {
        return temperatureArrayList;
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
