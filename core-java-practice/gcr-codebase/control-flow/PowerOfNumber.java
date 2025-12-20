package control.flow.statement;

import java.util.Scanner;

public class PowerOfNumber {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter the number:");
	        int number = sc.nextInt();
	        System.out.println("Enter the power:");
	        int power = sc.nextInt();
	        if (power >= 0) {
	            int result = 1;
	            for (int i = 1; i <= power; i++) {
	                result *= number;
	            }
	            System.out.println(result);
	        } 
	        else {
	            System.out.println("enter a non-negative integer for power");
	        }
	    }

}
