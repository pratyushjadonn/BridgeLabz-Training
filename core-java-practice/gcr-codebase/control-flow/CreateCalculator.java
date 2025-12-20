package control.flow.statement;

import java.util.Scanner;

public class CreateCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
        double first = sc.nextDouble();
        System.out.println("Enter the second number:");
        double second = sc.nextDouble();
        System.out.println("Enter the operation to be performed");
        String op = sc.next();
        double result;
        switch (op) {
            case "+":
                result = first + second;
                System.out.println(result);
                break;
            case "-":
                result = first - second;
                System.out.println(result);
                break;
            case "*":
                result = first * second;
                System.out.println(result);
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println(result);
                } else {
                    System.out.println("Error");
                }
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }

	}

}
