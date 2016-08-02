package com.sirma.dao;

import com.sirma.dto.MeasurmentsDTO;

import java.util.List;

public interface MeasurmentsDAO {
   /* List<E> getAll();

    E update(E entity);

    E add(E entity);

    E getByName(K name);

    boolean create(E entity);*/

    List<MeasurmentsDTO> getAll();

    MeasurmentsDTO update(MeasurmentsDTO entity);

    MeasurmentsDTO add(MeasurmentsDTO entity);

    MeasurmentsDTO getByName(MeasurmentsDTO name);

}

