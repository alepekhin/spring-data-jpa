package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class ApplicationRunner implements CommandLineRunner {

    private UserRepository userRepository;

    public ApplicationRunner(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String[] args) {
        Iterable<UserEntity> users = userRepository.findAll();
        for (UserEntity user : users) {
            System.out.println(user);
        }
    }

}
