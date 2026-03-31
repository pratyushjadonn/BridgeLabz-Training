package Scenario_Based;

import java.util.Scanner;

public class Main2{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankService bankService = new BankServiceImpl();

        while (true) {
            System.out.println("\n===== ONLINE BANKING SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Check Balance");
            System.out.println("3. Transfer Money");
            System.out.println("4. Transaction History");
            System.out.println("5. Delete Account");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                // CREATE
                case 1:
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Account Holder Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();

                    System.out.println("Select Account Type:");
                    System.out.println("1. Savings Account");
                    System.out.println("2. Current Account");
                    int type = sc.nextInt();

                    Account account = (type == 1)
                            ? new SavingsAccount(accNo, name, balance)
                            : new CurrentAccount(accNo, name, balance);

                    bankService.createAccount(account);
                    break;

                // READ
                case 2:
                    System.out.print("Enter Account Number: ");
                    int checkAcc = sc.nextInt();
                    bankService.checkBalance(checkAcc);
                    break;

                // UPDATE (Transfer)
                case 3:
                    System.out.print("From Account Number: ");
                    int fromAcc = sc.nextInt();

                    System.out.print("To Account Number: ");
                    int toAcc = sc.nextInt();

                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();

                    Thread t = new Thread(() -> {
                        try {
                            bankService.transferMoney(fromAcc, toAcc, amount);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    });
                    t.start();
                    break;

                // READ
                case 4:
                    bankService.showTransactionHistory();
                    break;

                // DELETE
                case 5:
                    System.out.print("Enter Account Number to Delete: ");
                    int deleteAcc = sc.nextInt();
                    bankService.deleteAccount(deleteAcc);
                    break;

                case 6:
                    System.out.println("Thank you for using Online Banking System!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
