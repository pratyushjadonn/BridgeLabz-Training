package com.example.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateFormatterTest {

    DateFormatter formatter = new DateFormatter();

    @Test
    void testValidDate() {
        String result = formatter.formatDate("2026-01-30");
        assertEquals("30-01-2026", result);
    }

    @Test
    void testInvalidFormat() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("30-01-2026");
        });
    }

    @Test
    void testInvalidDate() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("2026-02-30");
        });
    }

    @Test
    void testNullInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate(null);
        });
    }
}
