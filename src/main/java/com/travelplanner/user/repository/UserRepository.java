package com.travelplanner.user.repository;

import com.travelplanner.common.repository.BaseRepository;
import com.travelplanner.user.entity.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserRepository extends BaseRepository<User> {

    public UserRepository() {
        super(User.class);
    }

    @Transactional
    public User create(String username, String email, String password) {
        User user = new User(username, email, new BCryptPasswordEncoder().encode(password));
        entityManager.persist(user);
        return user;
    }

}
