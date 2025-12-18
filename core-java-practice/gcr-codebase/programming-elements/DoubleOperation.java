package coreJava;

import java.util.Scanner;

public class DoubleOperation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		double a=sc.nextDouble();
		System.out.println("Enter the value of b:");
		double b=sc.nextDouble();
		System.out.println("Enter the value of c:");
		double c=sc.nextDouble();
		System.out.println("The results of DoubleOperations are "+(a + (b *c))+","+((a * b) + c)+","+(c + (a / b))+",and "+((a % b) + c));
	}

}
