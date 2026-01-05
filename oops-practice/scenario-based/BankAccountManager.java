package scenario.based;

class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful. Amount deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance = balance - amount;
                System.out.println("Withdrawal successful. Amount withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance. Withdrawal denied.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
public class BankAccountManager {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC12345", 5000.0);
        account.checkBalance();
        account.deposit(2000.0);
        account.withdraw(3000.0);
        account.withdraw(5000.0);
        account.checkBalance();
    }
}