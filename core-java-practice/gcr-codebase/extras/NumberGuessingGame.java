package extras;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
	        int low = 1;
	        int high = 100;
	        String feedback = "";
	        System.out.println("Think of a number between 1 and 100 (inclusive).");
	        while (!feedback.equals("correct")) {
	            int guess = low + (int)(Math.random() * (high - low + 1));
	            System.out.println("Is your number " + guess + "? (respond with 'high', 'low', or 'correct')");
	            feedback = sc.nextLine().toLowerCase();
	            if (feedback.equals("high")) {
	                high = guess - 1;
	            } else if (feedback.equals("low")) {
	                low = guess + 1;
	            } else if (feedback.equals("correct")) {
	                System.out.println("Yay! I guessed your number: " + guess);
	            } else {
	                System.out.println("Invalid input.");
	            }
	        }

	}

}
