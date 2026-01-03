package Inheritance;

public class FixedDepositAccount extends BankAccount {
	int lockInPeriod; 

    FixedDepositAccount(int accountNumber, double balance, int lockInPeriod) {
        super(accountNumber, balance);
        this.lockInPeriod = lockInPeriod;
    }
	
	void displayAccountType(){
		 System.out.println("Account Type: Fixed Deposit Account");
	  }

}
