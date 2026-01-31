package com.example.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StringUtilsTest {
	StringUtils su=new StringUtils();
	
	@Test
	public void testReverse() {
		assertEquals("olleh",su.reverse("hello"));
	}
	
	@Test
	public void testISPalindrome() {
		assertEquals(true,su.isPalindrome("bhuhb"));
	}
	
	@Test
	public void testToUpperCase() {
		assertEquals("BHUMI",su.toUpperCase("Bhumi"));
	}

}
