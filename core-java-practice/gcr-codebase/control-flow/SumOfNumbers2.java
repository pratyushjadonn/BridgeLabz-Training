package control.flow.statement;

import java.util.Scanner;

public class SumOfNumbers2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,sum=0;
		while(true) {
			System.out.println("enter the number:");
			num=sc.nextInt();
			if(num<=0) {
				break;
			}
			sum+=num;
		}
		System.out.println("Sum : "+sum);
	}
	
}
