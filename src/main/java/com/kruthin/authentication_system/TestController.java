package com.kruthin.authentication_system;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String home() {
        return "Authentication System Running Successfully!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Kruthin!";
    }
}