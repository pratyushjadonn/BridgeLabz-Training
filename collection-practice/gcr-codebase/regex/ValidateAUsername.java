package regex;
import java.util.*;
public class ValidateAUsername {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter username : ");
		String name=sc.next();
		String regex="^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
		boolean ans=name.matches(regex);
		if(ans) {
		    System.out.println("Valid username");
		}
		else {
			System.out.println("Invalid username");
		}
	}
}
