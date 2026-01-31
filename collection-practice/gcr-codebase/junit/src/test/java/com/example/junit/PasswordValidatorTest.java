package com.example.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Secure123"));
    }

    @Test
    void testShortPassword() {
        assertFalse(validator.isValid("Abc12"));
    }

    @Test
    void testNoUppercase() {
        assertFalse(validator.isValid("password1"));
    }

    @Test
    void testNoDigit() {
        assertFalse(validator.isValid("Password"));
    }

    @Test
    void testNullPassword() {
        assertFalse(validator.isValid(null));
    }
}
