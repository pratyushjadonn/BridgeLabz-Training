package com.example.maven;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import bankAccountManager.*;

public class BankServiceTest {
	
	@Test
	public void Test_Deposit_ValidAmount() throws InsufficientAmount{
		  BankService service=new BankService();
		  Account acc=new Account("Akash", 2000);
		  service.deposit(acc,500);
		  
		  assertEquals(2500, acc.balance);
		  
		  }
	@Test
	void testDepositInvalidAmount() {
	    // Arrange
	    BankService service = new BankService();
	    Account acc = new Account("Akash",100);

	    // Act + Assert
	    InsufficientAmount ex = assertThrows(InsufficientAmount.class, () -> {
	        service.deposit(acc, -10);
	    });

	    assertEquals("Amount is invalid", ex.getMessage());
	}
	@Test
	void testWithdrawValidAmount() throws InsufficientAmount {
	    // Arrange
	    BankService service = new BankService();
	    Account acc=new Account("Akash", 200);

	    // Act
	    service.withdraw(acc, 50);

	    // Assert
	    assertEquals(150, acc.balance);
	}
	@Test
	void testWithdrawInsufficientBalance() {
	    // Arrange
	    BankService service = new BankService();
	    Account acc = new Account("Akash",100);

	    // Act + Assert
	    InsufficientAmount ex = assertThrows(InsufficientAmount.class, () -> {
	        service.withdraw(acc, 200);
	    });

	    assertEquals("Balance is Insufficient", ex.getMessage());
	}

	

}
