package control.flow.statement;

import java.util.Scanner;

public class CheckLargest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		System.out.println("Enter second number:");
		int b=sc.nextInt();
		System.out.println("Enter third number:");
		int c=sc.nextInt();
		if(a>b && a>c) {
			System.out.println("First number is Largest");
		}
		else if(b>a && b>c) {
			System.out.println("Second number is Largest");
		}
		else {
			System.out.println("Third number is Largest");
		}
		
	}
    
}
