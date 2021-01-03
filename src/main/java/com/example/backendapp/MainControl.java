package com.example.backendapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainControl {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/users")
    public List<User> allUsers() {

        return userRepo.findAll();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable(name = "id") User user) {
        return user;
    }
}
