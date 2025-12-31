package level1;

public class BankAccountManagement {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1001, "John Doe", 5000.0);
        account1.displayAccountInfo();
        // Modify balance
        account1.setBalance(6000.0);
        System.out.println("Updated Balance: " + account1.getBalance());
        // Create a SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount(2002, "Jane Smith", 8000.0, 2.5);
        savingsAccount.displaySavingsAccountInfo();
    }
}
class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;
    // Parameterized constructor
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    // Public method to access balance
    public double getBalance() {
        return balance;
    }
    // Public method to modify balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void displayAccountInfo() {
        System.out.printf("Account Number: %d, Account Holder: %s, Balance: $%.2f%n", 
                          accountNumber, accountHolder, balance);
    }
}
class SavingsAccount extends BankAccount {
    private double interestRate;
    // Parameterized constructor
    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }
    public void displaySavingsAccountInfo() {
        displayAccountInfo();
        System.out.printf("Interest Rate: %.2f%%%n", interestRate);
    }
}
