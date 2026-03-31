package regex;
import java.util.*;
public class ValidateACreditCardNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter credit card number : ");
		String cardNumber=sc.nextLine();
		String visa="^4[0-9]{15}$";
		String master="^5[0-9]{15}$";
		if(cardNumber.matches(visa)) {
			System.out.println("Visa Card");
		}
		else if(cardNumber.matches(master)) {
			System.out.println("Master Card");
		}
		else {
			System.out.println("Invalid credit card number");
		}
	}
}
