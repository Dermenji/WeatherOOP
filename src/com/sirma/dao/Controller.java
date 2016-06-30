package com.sirma.dao;


import java.util.List;

public interface Controller<E, K> {
    List<E> getAll();

    E update(E entity);

    E add(E entity);

    E getEntityById(K id);

    E getByName(K name);

    boolean remove(K id);

    boolean create(E entity);
}

