package ECommerceOrderManagementSystem;

public class CardPayment implements Payment{
	public void pay(double amount) throws PaymentFailedException{
		if(amount>50000) {
			throw new PaymentFailedException("Card limit Exceeded! Payment Failed.");
		}
		System.out.println("Card Payment successfully done ! "+amount);
		
	}
}
