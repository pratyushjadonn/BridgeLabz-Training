package com.example.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;


class ListManagerTest {
	ListManager manager=new ListManager();
	
	@Test
	public void testAddElement() {
		List<Integer> ls=new ArrayList<>();
		manager.addElement(ls,3);
		manager.addElement(ls,2);
		assertEquals(2,manager.getSize(ls));
		assertTrue(ls.contains(3));
		assertFalse(ls.contains(5));
	}
	@Test
	public void testRemoveElement() {
		List<Integer> ls=new ArrayList<>();
		ls.add(2);
		ls.add(3);
		manager.removeElement(ls,2);
		assertEquals(1,manager.getSize(ls));
	}
	@Test
	public void testSize() {
		List<Integer> ls=new ArrayList<>();
		ls.add(3);
		ls.add(2);
		assertEquals(2,manager.getSize(ls));
	}

}
