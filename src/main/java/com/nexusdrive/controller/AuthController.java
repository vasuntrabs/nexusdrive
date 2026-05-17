package com.nexusdrive.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/register")
    public String register() {
        return "User registered (mock for now)";
    }

    @PostMapping("/login")
    public String login() {
        return "JWT_TOKEN_MOCK";
    }
}