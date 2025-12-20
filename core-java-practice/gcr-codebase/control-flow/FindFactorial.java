package control.flow.statement;

import java.util.Scanner;

public class FindFactorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int factorial=1;
		if(num>0) {
			while(num>0){
				factorial*=num;
				num--;
			}
			System.out.println("factorial is "+factorial);
		}
		else {
			System.out.println("Facorial is not exist");
		}

	}
}
