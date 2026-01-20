package CinemaTime;

import java.util.Scanner;

public class CinemaApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		CinemaTimeManager manager = new CinemaTimeManager();

		while (true) {
			System.out.println("\n===== CinemaTime Menu =====");
			System.out.println("1. Add Movie");
			System.out.println("2. Search Movie");
			System.out.println("3. Display All Movies");
			System.out.println("4. Generate Report");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");

			int choice = sc.nextInt();
			sc.nextLine(); // consume newline

			try {
				switch (choice) {

				case 1:
					System.out.print("Enter movie title: ");
					String title = sc.nextLine();

					System.out.print("Enter showtime (HH:MM): ");
					String time = sc.nextLine();

					manager.addMovie(title, time);
					break;

				case 2:
					System.out.print("Enter search keyword: ");
					String keyword = sc.nextLine();
					manager.searchMovie(keyword);
					break;

				case 3:
					manager.displayAllMovies();
					break;

				case 4:
					manager.generateReport();
					break;

				case 5:
					System.out.println("Exiting CinemaTime. Thank you!");
					sc.close();
					return;

				default:
					System.out.println("Invalid choice. Try again.");
				}
			} catch (InvalidTimeFormatException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
