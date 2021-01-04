package com.example.backendapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainControl {

    Logger logger = LoggerFactory.getLogger(MainControl.class);


    @Autowired
    private UserRepo userRepo;

    @GetMapping("/users")
    public List<User> allUsers() {

        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");

        return userRepo.findAll();
    }

    @GetMapping("/ops")
    public void error(@RequestParam(required = false) User user) {
        logger.info("An INFO error");
        user.getId();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable(name = "id") User user) {
        logger.info("An INFO Message");

        return user;
    }
}
