package com.sirma.dao;

import com.sirma.dto.MeasurmentsDTO;
import com.sirma.objectmodel.Measurements;

import java.util.ArrayList;

public interface MeasurmentsDAO {
   /* List<E> getAll();

    E update(E entity);

    E add(E entity);

    E getByName(K name);

    boolean create(E entity);*/

    ArrayList<Measurements> detAll();

    MeasurmentsDTO update(MeasurmentsDTO entity);

    MeasurmentsDTO add(MeasurmentsDTO entity);

    MeasurmentsDTO getByName(MeasurmentsDTO name);

}

