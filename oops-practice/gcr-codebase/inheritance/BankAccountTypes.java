package Inheritance;

public class BankAccountTypes {
	public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(101, 50000, 4.5);
        CheckingAccount ca = new CheckingAccount(102, 20000, 10000);
        FixedDepositAccount fd = new FixedDepositAccount(103, 100000, 24);

        sa.displayAccountType();
        ca.displayAccountType();
        fd.displayAccountType();
    }
}
