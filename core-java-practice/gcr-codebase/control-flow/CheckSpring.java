package control.flow.statement;

import java.util.Scanner;

public class CheckSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month:");
		int month=sc.nextInt();
		System.out.println("Enter the day:");
		int day=sc.nextInt();
	    if(day>=20 && 3<=month && month<=6) {
	    	System.out.println("Its a Spring Season");
	    }
	    else{
	    	System.out.println("Not a Spring Season");
	    }
	}

}
