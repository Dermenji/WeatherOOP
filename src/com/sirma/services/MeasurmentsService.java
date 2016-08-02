package com.sirma.services;

import com.sirma.dao.MeasurmentsDAO;
import com.sirma.dto.MeasurmentsDTO;

import java.util.ArrayList;
import java.util.List;

public class MeasurmentsService implements MeasurmentsDAO {
    private ArrayList<MeasurmentsDTO> measurmentsArrayList = new ArrayList<MeasurmentsDTO>();

    public MeasurmentsService() {

    }

   /* public List getAll() {
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
    }*/

    @Override
    public List<MeasurmentsDTO> getAll() {
        return measurmentsArrayList;
    }

    @Override
    public MeasurmentsDTO update(MeasurmentsDTO entity) {
        return null;
    }

    @Override
    public MeasurmentsDTO add(MeasurmentsDTO entity) {
        return null;
    }

    @Override
    public MeasurmentsDTO getByName(MeasurmentsDTO name) {
        return null;
    }
}