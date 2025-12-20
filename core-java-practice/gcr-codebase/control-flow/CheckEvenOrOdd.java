package control.flow.statement;

import java.util.Scanner;

public class CheckEvenOrOdd {
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Number:");
	        int number = sc.nextInt();
	        for (int i = 1; i <= number; i++) {
	            if (i % 2 == 0) {
	                System.out.println(i + " is an Even number");
	            } else {
	                System.out.println(i + " is an Odd number");
	            }
	        }
	    }

}
