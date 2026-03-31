package Scenario_Based;

public interface BankService {

    void createAccount(Account account);

    void checkBalance(int accountNumber);

    void transferMoney(int fromAcc, int toAcc, double amount)
            throws InsufficientBalanceException;

    void showTransactionHistory();
    void deleteAccount(int accountNumber);

}
