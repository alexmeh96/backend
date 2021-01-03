package com.example.backendapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class BackendAppApplication implements CommandLineRunner {

    @Autowired
    private UserRepo userRepo;

    public static void main(String[] args) {
        SpringApplication.run(BackendAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(1L, "user1", "password1");
        User user2 = new User(2L, "user2", "password2");
        User user3 = new User(3L, "user3", "password3");

        List<User> userList = Arrays.asList(user1, user2, user3);
        userRepo.saveAll(userList);
    }
}
