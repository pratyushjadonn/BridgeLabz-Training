package BankingAccountHierarchy;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("===== Bank Account System =====");
		System.out.println("1. Savings Account");
		System.out.println("2. Checking Account");
		System.out.print("Choose account type: ");
		int choice = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Account Number: ");
		String accNo = sc.nextLine();

		System.out.print("Enter Balance: ");
		double balance = sc.nextDouble();

		BankAccount account;

		if (choice == 1) {
			account = new SavingsAccount(accNo, balance);
		} else if (choice == 2) {
			account = new CheckingAccount(accNo, balance);
		} else {
			System.out.println("Invalid account type!");
			sc.close();
			return;
		}

		double fee = account.calculateFee();

		System.out.println("\n--- Account Details ---");
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.printf("Transaction Fee: %.2f%n", fee);

		sc.close();
	}
}
