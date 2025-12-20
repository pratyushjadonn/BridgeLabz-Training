package control.flow.statement;

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int total=0;
		int a=1;
		while(a!=0) {
			System.out.println("enter the number:");
			int b=sc.nextInt();   //enter the number by user
			a=b;
			total+=b;	
		}
		System.out.println("total:"+total);
	}

}
