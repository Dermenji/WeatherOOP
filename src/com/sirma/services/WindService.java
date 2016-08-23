package com.sirma.services;


import com.sirma.dao.AbstractController;
import com.sirma.dto.WindDTO;
import com.sirma.objectmodel.Wind;

import java.util.ArrayList;
import java.util.List;

public class WindService extends AbstractController {

    private ArrayList<Wind> windArrayList = new ArrayList<Wind>();


    @Override
    public List getAll() {
        return windArrayList;
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
