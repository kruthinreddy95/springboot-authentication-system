package com.kruthin.authentication_system.controller;

import com.kruthin.authentication_system.dto.RegisterRequest;
import com.kruthin.authentication_system.entity.User;
import com.kruthin.authentication_system.service.UserService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public User registerUser(@RequestBody RegisterRequest request) {
        return userService.registerUser(request);
    }

    @GetMapping("/profile")
    public Map<String, String> profile() {
        String email = SecurityContextHolder.getContext().getAuthentication().getName();
        return Map.of("email", email);
    }
}