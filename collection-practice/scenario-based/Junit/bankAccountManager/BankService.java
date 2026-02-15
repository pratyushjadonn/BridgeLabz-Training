package bankAccountManager;


public class BankService {
	public void deposit(Account account,double amount) throws InsufficientAmount{
		if(amount>0) {
			account.balance+=amount;
			System.out.println("Deposit Successfully");
		}
		else {
			throw new InsufficientAmount("Amount is invalid");
		}
		
	}
	public void withdraw(Account account,double amount) throws InsufficientAmount {
		if(account.balance>=amount) {
			account.balance-=amount;
			System.out.println("Withdraw Successfully");
		}
		else {
			throw new InsufficientAmount("Balance is Insufficient");
			
		}
	}
	double checkBalance(Account account) {
		return account.balance;
	}
	
}
