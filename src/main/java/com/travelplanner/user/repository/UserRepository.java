package com.travelplanner.user.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
public class UserRepository {

    @Autowired
    private EntityManager entityManager;

    @Transactional
    public void create() {
        
    }


}
