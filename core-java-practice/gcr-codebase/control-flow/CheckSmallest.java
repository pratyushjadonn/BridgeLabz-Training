package control.flow.statement;

import java.util.Scanner;

public class CheckSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b =sc.nextInt();
		System.out.println("Enter third number");
		int c=sc.nextInt();
		if(a>b) {
			System.out.println("first number is not smmallest of the three number");
		}
		else if(a>c) {
			System.out.println("first number is not smmallest of the three number");
		}
		else {
			System.out.println("first number is  smmallest of the three number");
		}

	}

}
