package control.flow.statement;

import java.security.Identity;
import java.util.Scanner;

public class SumOfNatural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int a=sc.nextInt();
		if(a>0){
			int sum=0;
			for(int i=1;i<=a;i++) {
				sum+=i;
			}
			System.out.println("The sum of first "+a+" numbers is "+sum);
		}
		else {
			System.out.println("The number "+a+" is not a natural number");
		}

	}

}
