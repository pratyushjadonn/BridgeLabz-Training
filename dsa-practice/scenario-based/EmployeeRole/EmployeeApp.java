package EmployeeRole;

import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("===== Employee Role System =====");
		System.out.println("1. Manager");
		System.out.println("2. Developer");
		System.out.print("Select role: ");
		int choice = sc.nextInt();
		sc.nextLine(); // consume newline

		System.out.print("Enter Employee Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Salary: ");
		double salary = sc.nextDouble();

		Employee emp;

		if (choice == 1) {
			emp = new Manager(name, salary);
		} else if (choice == 2) {
			emp = new Developer(name, salary);
		} else {
			System.out.println("Invalid role!");
			sc.close();
			return;
		}

		System.out.println("\n--- Employee Details ---");
		System.out.println("Name: " + emp.getName());
		System.out.printf("Salary: %.2f%n", emp.getSalary());
		System.out.printf("Bonus: %.2f%n", emp.getBonus());

		sc.close();
	}
}
