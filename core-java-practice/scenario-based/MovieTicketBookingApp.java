package scenario.based;

import java.util.Scanner;

public class MovieTicketBookingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean remainingSeat = true;

        while (remainingSeat) {

            System.out.println(" Welcome to Movie Ticket Booking App!");
            System.out.println("Select Movie Type:");
            System.out.println("1️.  Action");
            System.out.println("2️.  Comedy");
            System.out.println("3️.  Horror");
            System.out.print("Enter your choice (1-3): ");
            int movieChoice = sc.nextInt();

            int moviePrice = 0;
            String movieType = "";

            switch (movieChoice) {
                case 1:
                    movieType = "Action";
                    moviePrice = 200;
                    break;
                case 2:
                    movieType = "Comedy";
                    moviePrice = 180;
                    break;
                case 3:
                    movieType = "Horror";
                    moviePrice = 220;
                    break;
                default:
                    System.out.println("Invalid movie choice! Try again.");
                    continue;
            }

            System.out.print("Choose Seat Type (gold/silver): ");
            String seatType = sc.next().toLowerCase();
            int seatPrice = 0;

            if (seatType.equals("gold")) {
                seatPrice = 150;
            } else if (seatType.equals("silver")) {
                seatPrice = 100;
            } else {
                System.out.println("Invalid seat type! Try again.");
                continue;
            }

            System.out.print("Do you want snacks? (yes/no): ");
            String snackChoice = sc.next().toLowerCase();
            int snackPrice = 0;

            if (snackChoice.equals("yes")) {
                snackPrice = 120;
            }

            int totalCost = moviePrice + seatPrice + snackPrice;

            System.out.println("\n Booking Summary:");
            System.out.println("Movie Type: " + movieType);
            System.out.println("Seat Type: " + seatType.toUpperCase());
            System.out.println("Snacks: " + (snackChoice.equals("yes") ? "Included" : "Not Included"));
            System.out.println("Total Cost: ₹" + totalCost);

            System.out.print("Book for next customer? (yes/no): ");
            String next = sc.next().toLowerCase();
            remainingSeat = next.equals("yes");
        }

        System.out.println("Thank you for using Movie Ticket Booking App!");
    }
}
