package com.example.demo.service;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repo;

    public User saveUser(User user) {
        log.info("Saving user in DB: {}", user.getName());
        return repo.save(user);
    }

    public List<User> getAllUsers() {
        log.info("Fetching all users from DB");
        return repo.findAll();
    }
}
