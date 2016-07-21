package com.sirma.dao;


import java.util.List;

public interface MeasurmentsDAO<E, K> {
    List<E> getAll();

    E update(E entity);

    E add(E entity);

    E getByName(K name);

    boolean create(E entity);
}

