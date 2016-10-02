package com.travelplanner.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService service;

    public void createUser(@RequestParam String username,
                           @RequestParam String email,
                           @RequestParam String password) {
        service.createUser(username, email, password);
    }

}
