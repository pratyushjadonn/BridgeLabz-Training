package regex;
import java.util.*;
public class ValidateAnIPAddress {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter IP Address : ");
		String ip=sc.next();
		String regex="^(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$";
		boolean ans=ip.matches(regex);
		if(ans) {
			System.out.println("Valid IP Address");
		}
		else {
			System.out.println("InValid IP address");
		}
	}
}
