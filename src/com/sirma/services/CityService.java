package com.sirma.services;

import com.sirma.dao.AbstractController;
import com.sirma.dto.CityDTO;

import java.util.ArrayList;
import java.util.List;

public class CityService extends AbstractController {

    private ArrayList<CityDTO> cityArrayList = new ArrayList<CityDTO>();

    public CityService() {

    }

    @Override
    public List getAll() {
        return cityArrayList;
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
