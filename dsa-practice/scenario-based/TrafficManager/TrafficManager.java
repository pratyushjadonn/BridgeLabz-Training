package TrafficManager;

import java.util.Scanner;

public class TrafficManager {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Roundabout roundabout = new Roundabout();

		System.out.print("Enter waiting queue capacity: ");
		int capacity = sc.nextInt();
		VehicleQueue waitingQueue = new VehicleQueue(capacity);

		while (true) {
			System.out.println("\n===== Traffic Manager Menu =====");
			System.out.println("1. Add vehicle to waiting queue");
			System.out.println("2. Move vehicle from queue to roundabout");
			System.out.println("3. Remove vehicle from roundabout");
			System.out.println("4. Display roundabout");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter vehicle ID: ");
				int id = sc.nextInt();
				waitingQueue.enqueue(id);
				break;

			case 2:
				Integer vehicle = waitingQueue.dequeue();
				if (vehicle != null) {
					roundabout.addVehicle(vehicle);
				}
				break;

			case 3:
				roundabout.removeVehicle();
				break;

			case 4:
				roundabout.display();
				break;

			case 5:
				System.out.println("Traffic Manager closed.");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}
