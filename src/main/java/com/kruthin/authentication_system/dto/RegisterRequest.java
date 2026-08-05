package com.kruthin.authentication_system.dto;

import lombok.Data;

@Data
public class RegisterRequest {

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private Long phone;
}
