package com.sirma.services;

import com.sirma.dao.AbstractController;
import com.sirma.dto.MainDTO;
import com.sirma.objectmodel.WindSpeed;

import java.util.ArrayList;
import java.util.List;

public class WindSpeedService extends AbstractController {

    private ArrayList<WindSpeed> windSpeedArrayList = new ArrayList<WindSpeed>();


    @Override
    public List getAll() {
        return windSpeedArrayList;
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
