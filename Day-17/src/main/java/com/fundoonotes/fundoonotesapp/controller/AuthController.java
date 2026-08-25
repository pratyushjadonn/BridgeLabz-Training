package com.fundoonotes.fundoonotesapp.controller;

import com.fundoonotes.fundoonotesapp.dto.AuthResponse;
import com.fundoonotes.fundoonotesapp.dto.LoginRequest;
import com.fundoonotes.fundoonotesapp.dto.RegisterRequest;
import com.fundoonotes.fundoonotesapp.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    // Endpoint naming matches the source doc's actual API shape.
    @PostMapping("/userSignUp")
    public ResponseEntity<AuthResponse> register(@Valid @RequestBody RegisterRequest request) {
        AuthResponse response = userService.register(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@Valid @RequestBody LoginRequest request) {
        AuthResponse response = userService.login(request);
        return ResponseEntity.ok(response);
    }
}
