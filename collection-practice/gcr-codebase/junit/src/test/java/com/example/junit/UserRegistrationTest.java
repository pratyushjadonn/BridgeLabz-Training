package com.example.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserRegistrationTest {

    UserRegistration registration = new UserRegistration();

    @Test
    void testValidUserRegistration() {
        assertTrue(registration.registerUser(
                "bhumi",
                "bhumi@example.com",
                "Secure123"
        ));
    }

    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("", "user@example.com", "Secure123");
        });
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("user", "invalid-email", "Secure123");
        });
    }

    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("user", "user@example.com", "123");
        });
    }

    @Test
    void testNullInputs() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser(null, null, null);
        });
    }
}
