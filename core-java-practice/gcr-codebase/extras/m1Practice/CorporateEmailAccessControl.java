package practice;

import java.util.Scanner;

public class CorporateEmailAccessControl {
	static boolean ansy(String str) {
		return str.matches("^[a-z]{3,}\\.[a-z]{3,}\\d{4,}@(sales|marketing|IT|product)\\.company\\.com$");
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str =sc.nextLine();
		if(ansy(str)) {
			System.out.println("Access Granted");
		}
		else {
			System.out.println("Access Denied");
		}
		
		
	}

}
