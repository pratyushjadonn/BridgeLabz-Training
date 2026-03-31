package functional_interface;
interface Payment{
	void pay();
}
class UPI implements Payment{
	public void pay() {
		System.out.println("Payment done by UPI");
	}
}
class CreditCard implements Payment{
	public void pay() {
		System.out.println("Payment done by credit card.");
	}
}
class Wallet implements Payment{
	public void pay() {
		System.out.println("Payment done by wallet");
	}
}
public class DigitalPaymentInterface {
	public static void main(String[] args) {
		Payment upi=new UPI();
		Payment creditCard=new CreditCard();
		Payment wallet=new Wallet();
		upi.pay();
		creditCard.pay();
		wallet.pay();
	}
}
