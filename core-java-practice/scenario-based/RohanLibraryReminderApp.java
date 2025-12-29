package scenario.based;

import java.util.Scanner;

public class RohanLibraryReminderApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        final int fineperday= 5;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter due date for book " + i + " (in days):");
            int dueDate = sc.nextInt();
            System.out.println("Enter return date for book " + i + " (in days):");
            int returnDate = sc.nextInt();
            if (returnDate > dueDate) {
                int lateDays = returnDate - dueDate;
                int fine = lateDays * fineperday;
                System.out.println("Book " + i + " is returned late by " + lateDays + " days. Fine: ₹" + fine);
            } else {
                System.out.println("Book " + i + " is returned on time. No fine.");
            }
        }
		

	}

}
