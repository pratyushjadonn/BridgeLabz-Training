package scenario.based;
import java.util.*;
public class CabBookingApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
        CabService cabService = new CabService();

        // Pre-added drivers
        cabService.addDriver(new Driver(1, "Rohit"));
        cabService.addDriver(new Driver(2, "Amit"));

        while (true) {
            System.out.println("\n===== CAB BOOKING SYSTEM =====");
            System.out.println("1. Book Ride");
            System.out.println("2. View Ride History");
            System.out.println("3. Update Ride");
            System.out.println("4. Delete Ride");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                // CREATE (Ask user EVERY time)
                case 1:
                    System.out.print("Enter User ID: ");
                    int userId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter User Name: ");
                    String userName = sc.nextLine();

                    User user = new User(userId, userName);

                    System.out.print("Enter distance (km): ");
                    double distance = sc.nextDouble();

                    System.out.println("Choose Fare Type:");
                    System.out.println("1. Normal");
                    System.out.println("2. Peak");
                    int fareChoice = sc.nextInt();

                    FareCalculator fareCalculator =
                            (fareChoice == 2)
                                    ? new PeakFareCalculator()
                                    : new NormalFareCalculator();

                    try {
                        Ride ride = cabService.bookRide(user, distance, fareCalculator);
                        System.out.println("Ride booked successfully!");
                        ride.showRideDetails();
                    } catch (NoDriverAvailableException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                // READ
                case 2:
                    cabService.showRideHistory();
                    break;

                // UPDATE
                case 3:
                    System.out.print("Enter Ride ID to update: ");
                    int updateRideId = sc.nextInt();

                    System.out.print("Enter new distance (km): ");
                    double newDistance = sc.nextDouble();

                    System.out.println("Fare Type: 1.Normal  2.Peak");
                    int newFareChoice = sc.nextInt();

                    FareCalculator newFareCalculator =
                            (newFareChoice == 2)
                                    ? new PeakFareCalculator()
                                    : new NormalFareCalculator();

                    cabService.updateRide(updateRideId, newDistance, newFareCalculator);
                    break;

                // DELETE
                case 4:
                    System.out.print("Enter Ride ID to delete: ");
                    int deleteRideId = sc.nextInt();

                    cabService.deleteRide(deleteRideId);
                    break;

                case 5:
                    System.out.println("Thank you for using Cab Booking System!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
