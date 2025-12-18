package coreJava;

import java.util.Scanner;

public class IntOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		System.out.println("Enter the value of c:");
		int c=sc.nextInt();
		System.out.println("The results of Int Operations are "+(a + (b *c))+","+((a * b) + c)+","+(c + (a / b))+",and "+((a % b) + c));
	}

}
