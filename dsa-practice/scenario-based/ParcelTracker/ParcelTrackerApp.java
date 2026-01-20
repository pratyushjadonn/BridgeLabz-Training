package ParcelTracker;

import java.util.Scanner;

public class ParcelTrackerApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ParcelTracker tracker = new ParcelTracker();

		while (true) {
			System.out.println("\n===== Parcel Tracker Menu =====");
			System.out.println("1. Add Stage");
			System.out.println("2. Add Checkpoint");
			System.out.println("3. Track Parcel");
			System.out.println("4. Mark Parcel Lost");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");

			int choice = sc.nextInt();
			sc.nextLine(); // consume newline

			switch (choice) {

			case 1:
				System.out.print("Enter stage name: ");
				String stage = sc.nextLine();
				tracker.addStage(stage);
				break;

			case 2:
				System.out.print("Enter stage after which to add checkpoint: ");
				String after = sc.nextLine();

				System.out.print("Enter checkpoint name: ");
				String checkpoint = sc.nextLine();

				tracker.addCheckpoint(after, checkpoint);
				break;

			case 3:
				tracker.trackParcel();
				break;

			case 4:
				System.out.print("Enter stage after which parcel is lost: ");
				String lostStage = sc.nextLine();
				tracker.markLostAfter(lostStage);
				break;

			case 5:
				System.out.println("Parcel Tracker closed.");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}
