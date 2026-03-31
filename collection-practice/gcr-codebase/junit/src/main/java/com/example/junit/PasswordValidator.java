package com.example.junit;

public class PasswordValidator {

    public boolean isValid(String password) {

        if (password == null) return false;

        // At least 8 characters, one uppercase letter, one digit
        boolean hasMinLength = password.length() >= 8;
        boolean hasUppercase = password.matches(".*[A-Z].*");
        boolean hasDigit = password.matches(".*\\d.*");

        return hasMinLength && hasUppercase && hasDigit;
    }
}
