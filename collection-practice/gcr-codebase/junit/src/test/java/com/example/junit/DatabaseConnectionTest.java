package com.example.junit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionTest {
	private DatabaseConnection db;
	@BeforeEach
	public void setup() {
		db=new DatabaseConnection();
		db.connect();
	}
	@AfterEach
	void tearDown() {
		db.disconnect();
	}
	@Test
	void testConnectionIsEstablished() {
		assertTrue(db.isConnected());
	}
	@Test
	void testConnectionIsClosed() {
		db.disconnect();
		assertFalse(db.isConnected());
	}
}
