package coreJava;

import java.util.Scanner;

public class NumberOfHandshake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of student:");
		int n=sc.nextInt();
		int ans=(n * (n - 1)) / 2;
		System.out.println("The Number of possible handshakes:"+ans);		
	}
}
