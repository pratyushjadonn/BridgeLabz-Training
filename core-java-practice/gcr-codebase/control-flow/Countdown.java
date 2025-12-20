package control.flow.statement;

import java.util.Scanner;

public class Countdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Countdown number");
		int n=sc.nextInt();
		while(n>=1){
			System.out.println(n);
			n--;
		}

	}

}
