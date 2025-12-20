package control.flow.statement;

import java.util.Scanner;

public class CheckDivisiblity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number:");
		int n =sc.nextInt();
		if(n%5==0) {
			System.out.println("Number is divisible by 5");
		}
		else {
			System.out.println("Number is not divisible by 5");
		}
	
	}

}
