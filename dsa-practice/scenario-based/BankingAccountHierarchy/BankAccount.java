package BankingAccountHierarchy;

public abstract class BankAccount {

	private final String accountNumber;
	private final double balance;

	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	protected double getBalance() {
		return balance;
	}

	// Polymorphic method
	public abstract double calculateFee();
}
