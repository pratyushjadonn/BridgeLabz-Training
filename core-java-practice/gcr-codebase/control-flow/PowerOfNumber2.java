package control.flow.statement;

import java.util.Scanner;

public class PowerOfNumber2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        System.out.println("Enter the power");
        int power = sc.nextInt();
        if (power >= 0) {
            int result = 1;
            int counter = 0;
            while (counter < power) {
                result *= number;
                counter++;
            }
            System.out.println(result);
        } else {
            System.out.println("Enter a non-negative integer for power.");
        }
    }

}
