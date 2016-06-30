package com.sirma.services;

import com.sirma.dao.Controller;
import com.sirma.items.City;

import java.util.ArrayList;
import java.util.List;

public class FactorsService implements Controller {
    private ArrayList<City> cityArrayList = new ArrayList<City>();

    public FactorsService() {

    }

    public List getAll() {
        return cityArrayList;
    }

    public Object update(Object entity) {
        return null;
    }

    public Object add(Object entity) {
        return null;
    }

    public Object getEntityById(Object id) {
        return null;
    }

    public Object getByName(Object name) {
        return null;
    }

    public boolean remove(Object id) {
        return false;
    }

    public boolean create(Object entity) {
        return false;
    }
}