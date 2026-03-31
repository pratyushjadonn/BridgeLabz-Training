package com.example.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ExceptionHandlingTest {
	ExceptionHandling eh=new ExceptionHandling();
	@Test
	public void testDivideByZero() {
		ArithmeticException exception = assertThrows(ArithmeticException.class, () -> eh.divide(10, 0));
		assertEquals("Cannot divide by zero.", exception.getMessage());
	}
}
