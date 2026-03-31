package Scenario_Based;

public abstract class Account {

    protected int accountNumber;
    protected String holderName;
    protected double balance;

    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
    }

    public synchronized void withdraw(double amount)
            throws InsufficientBalanceException {
        if (balance < amount) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        balance -= amount;
    }


    public double getBalance() {
        return balance;
    }

    public abstract double calculateInterest();
}
