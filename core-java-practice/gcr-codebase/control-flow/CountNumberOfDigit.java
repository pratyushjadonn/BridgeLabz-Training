package control.flow.statement;

import java.util.Scanner;

public class CountNumberOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
        int number = sc.nextInt();
        int count = 0;
        while (number != 0) {
            number /= 10;  
            count++;        
        }
        System.out.println("Number of digits:" + count);
	}

}
