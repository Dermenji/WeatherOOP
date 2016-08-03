package com.sirma.dao;


import java.util.List;

public abstract class AbstractController<E, K> {
    public abstract List<E> getAll();

    public abstract E update(E entity);

    public abstract E add(E entity);

    public abstract E getEntityById(K id);

    public abstract E getByName(K name);


    public abstract boolean remove(K id);

    public abstract boolean create(E entity);
}