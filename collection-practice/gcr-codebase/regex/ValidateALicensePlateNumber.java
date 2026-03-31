package regex;
import java.util.*;
public class ValidateALicensePlateNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter license plate number : ");
		String licensePlateNumber=sc.next();
		String regex="^[A-Z]{2}[0-9]{4}$";
		boolean ans=licensePlateNumber.matches(regex);
		if(ans) {
		    System.out.println("Valid license plate number");
		}
		else {
			System.out.println("Invalid license plate number");
		}
	}
}
