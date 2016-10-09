package com.travelplanner.common.repository;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class BaseRepository<T> {

    @Autowired
    protected EntityManager entityManager;

    private final Class<T> entityClass;

    public BaseRepository(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

}
