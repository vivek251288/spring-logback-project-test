package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
@Slf4j
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping
    public User create(@RequestBody User user) {
        log.info("API called: Create User {}", user.getName());
        return service.saveUser(user);
    }

    @GetMapping
    public List<User> getAll() {
        log.info("API called: Get All Users");
        return service.getAllUsers();
    }
}
