package com.example.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator calc = new Calculator();

	@Test
	public void testAdd() {
		assertEquals(5, calc.add(2, 3));
	}

	@Test
	public void testSubtract() {
		assertEquals(3, calc.subtract(5, 2));
	}

	@Test
	public void testMultiply() {
		assertEquals(30, calc.multiply(5, 6));
	}

	@Test
	public void testDivide() {
		assertEquals(2, calc.divide(4, 2));
	}

	@Test
	public void testDivideByZero() {
		ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
		assertEquals("Cannot divide by zer", exception.getMessage());
	}
}
