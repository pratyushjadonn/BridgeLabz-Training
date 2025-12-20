package control.flow.statement;

import java.util.Scanner;
public class ForCountdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Countdown number");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--){
			System.out.println(i);
		}
	}

}
