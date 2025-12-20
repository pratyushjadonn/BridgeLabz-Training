package control.flow.statement;

import java.util.Scanner;

public class FindBonus {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yearsOfService = sc.nextInt(); 
        double salary = sc.nextDouble(); 
        double bonus = 0;
        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        }
        System.out.println("The bonus amount is: " + bonus);
    }
}
