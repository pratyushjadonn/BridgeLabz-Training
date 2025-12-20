package arrays;
import java.util.Scanner;
public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its multiplication table from 6 to 9: ");
        int number = sc.nextInt();
        int[] Result = new int[4]; 
        for (int i = 0; i < Result.length; i++) {
            Result[i] = number * (i + 6);
        }
        System.out.println("Multiplication Table of " + number + " from 6 to 9:");
        for (int i = 0; i < Result.length; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + Result[i]);
        }
    }
}