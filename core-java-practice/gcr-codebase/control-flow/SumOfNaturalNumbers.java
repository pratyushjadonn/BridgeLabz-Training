package control.flow.statement;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc=new Scanner(System.in);
		int n;
        int sumWhile = 0;
        int sumFormula;

        System.out.print("Enter a number:");
        n = sc.nextInt();
        if (n <= 0) {                     // Check whether the number is  Natural number
            System.out.println("Entered number is not a natural number.");
        } 
        else {
            // Sum using while loop
            int i = 1;
            while (i <= n) {
                sumWhile = sumWhile + i;
                i++;
                }
            // Sum using formula
            sumFormula = n * (n + 1) / 2;
            System.out.println("Sum using while loop = " + sumWhile);
            System.out.println("Sum using formula = " + sumFormula);
            // Compare both results
            if (sumWhile == sumFormula) {
                System.out.println("Result is correct");
            } 
            else {
                System.out.println("Result is incorrect");
            }
        }
	}
}
