package com.travelplanner.user.controller;

import com.travelplanner.user.entity.User;
import com.travelplanner.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public User createUser(@RequestParam String username,
                           @RequestParam String email,
                           @RequestParam String password) {
        return service.createUser(username, email, password);
    }

}
