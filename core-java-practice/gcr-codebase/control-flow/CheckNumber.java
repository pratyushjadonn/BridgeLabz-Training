package control.flow.statement;

import java.util.Scanner;

public class CheckNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
	    if(n>0) {
	    	System.out.println("Positve");
	    }
	    else if(n<0) {
	    	System.out.println("Negative");
	    }
	    else{
	    	System.out.println("Zero");
	    }
	}

}
