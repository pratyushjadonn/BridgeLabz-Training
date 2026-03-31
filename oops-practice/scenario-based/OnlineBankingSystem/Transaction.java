package Scenario_Based;

public class Transaction {

    private int fromAccount;
    private int toAccount;
    private double amount;

    public Transaction(int fromAccount, int toAccount, double amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    public void show() {
        System.out.println("From: " + fromAccount +
                " To: " + toAccount +
                " Amount: ₹" + amount);
    }
}
