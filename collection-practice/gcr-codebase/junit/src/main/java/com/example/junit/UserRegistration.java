package com.example.junit;

public class UserRegistration {

    public boolean registerUser(String username, String email, String password) {

        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid username");
        }

        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new IllegalArgumentException("Invalid email");
        }

        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Invalid password");
        }

        // Assume user is registered successfully
        return true;
    }
}
