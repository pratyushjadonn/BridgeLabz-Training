package regex;
import java.util.*;
public class ValidateAHexColorCode {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a hex color: ");
		String hexColor=sc.next();
		String regex="^#[0-9A-Fa-f]{6}$";
		boolean ans=hexColor.matches(regex);
		if(ans) {
		    System.out.println("Valid hex color");
		}
		else {
			System.out.println("Invalid hex color");
		}
	}
}
