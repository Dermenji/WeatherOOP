package com.sirma.services;

import com.sirma.dao.MeasurmentsDAO;
import com.sirma.objectmodel.Measurements;

import java.util.ArrayList;
import java.util.List;

public class MeasurmentsService implements MeasurmentsDAO {
    private ArrayList<Measurements> measurmentsArrayList = new ArrayList<Measurements>();

    public MeasurmentsService() {

    }

    public List getAll() {
        return measurmentsArrayList;
    }

    public Object update(Object entity) {
        return null;
    }

    public Object add(Object entity) {
        return null;
    }

    public Object getByName(Object name) {
        return null;
    }

    public boolean create(Object entity) {
        return false;
    }
}