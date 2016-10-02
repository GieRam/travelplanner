package com.travelplanner.user.repository;

import com.travelplanner.user.entity.User;
import com.travelplanner.utilities.Password;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
public class UserRepository {

    @Autowired
    private EntityManager entityManager;

    @Transactional
    public User create(String username, String email, String password) {
        User user = new User(username, email, Password.hashPassword(password));
        entityManager.persist(user);
        return user;
    }

}
