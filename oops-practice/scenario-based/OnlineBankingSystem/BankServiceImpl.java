package Scenario_Based;

import java.util.ArrayList;
import java.util.List;

public class BankServiceImpl implements BankService {

    private List<Account> accounts = new ArrayList<>();
    private List<Transaction> transactions = new ArrayList<>();

    @Override
    public void createAccount(Account account) {
        accounts.add(account);
        System.out.println("Account created: " + account.getAccountNumber());
    }

    @Override
    public void checkBalance(int accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accountNumber) {
                System.out.println("Balance: ₹" + acc.getBalance());
                return;
            }
        }
        System.out.println("Account not found");
    }

    @Override
    public synchronized void transferMoney(int fromAcc, int toAcc, double amount)
            throws InsufficientBalanceException {

        Account sender = null;
        Account receiver = null;

        for (Account acc : accounts) {
            if (acc.getAccountNumber() == fromAcc)
                sender = acc;
            if (acc.getAccountNumber() == toAcc)
                receiver = acc;
        }

        if (sender == null || receiver == null) {
            System.out.println("Invalid account number");
            return;
        }

        sender.withdraw(amount);
        receiver.deposit(amount);

        transactions.add(new Transaction(fromAcc, toAcc, amount));
        System.out.println("Transfer successful");
    }

    @Override
    public void showTransactionHistory() {
        for (Transaction t : transactions) {
            t.show();
        }
    }
    @Override
    public void deleteAccount(int accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accountNumber) {
                accounts.remove(acc);
                System.out.println("Account deleted successfully");
                return;
            }
        }
        System.out.println("Account not found");
    }

}
