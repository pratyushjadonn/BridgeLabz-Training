package bankAccountManager;

public class UserInterface {
	public static void main(String[] args) {
		BankService bank=new BankService();
		Account acc1=new Account("Pratyush",2500);
		Account acc2=new Account("Shivam", 1000);
		try {
		bank.deposit(acc2, 500);
		System.out.println(bank.checkBalance(acc2));
		bank.withdraw(acc1, 1000);
		System.out.println(bank.checkBalance(acc1));
		}
		catch(InsufficientAmount e) {
			System.out.println("Error : " +e.getMessage());
		}
		
	}

}
