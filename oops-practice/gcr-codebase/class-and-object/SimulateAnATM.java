package ClassAndObject;
public class SimulateAnATM {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", "123456789", 500.0);
        System.out.println("State of Chennai\n");
        account.displayBalance();
        account.deposit(200.0);
        account.displayBalance();
        account.withdraw(100.0);
        account.displayBalance();
        account.withdraw(700.0);
    }
}
class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw amount is : " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}
