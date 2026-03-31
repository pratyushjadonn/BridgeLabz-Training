package ECommerceOrderManagementSystem;

public class WalletPayment implements Payment{
	double walletBalance=2000;
	public void pay(double amount) throws PaymentFailedException {
		if(amount>walletBalance) {
			throw new PaymentFailedException("Amount Exceeds wallet balance");
		}
		walletBalance-=amount;
		System.out.println("Payment successfully done! "+amount);
		System.out.println("Remaining balance in wallet : "+walletBalance);
	}
}
