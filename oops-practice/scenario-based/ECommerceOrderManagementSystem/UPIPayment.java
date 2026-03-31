package ECommerceOrderManagementSystem;

public class UPIPayment implements Payment{
	public void pay(double amount) throws PaymentFailedException{
		if(amount>20000) {
			throw new PaymentFailedException("UPI transaction limit exceeded! Payment failed.");
		}
		System.out.println("UPI transaction successfully done "+amount);
	}
}
