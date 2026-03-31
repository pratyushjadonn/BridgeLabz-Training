package scenario.based;

import java.util.ArrayList;
import java.util.List;

public class CabService {

    private List<Driver> drivers = new ArrayList<>();
    private List<Ride> rideHistory = new ArrayList<>();

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    private int rideCounter = 1;

    public Ride bookRide(User user, double distance, FareCalculator fareCalculator)
            throws NoDriverAvailableException {

        Driver assignedDriver = null;

        for (Driver driver : drivers) {
            if (driver.isAvailable()) {
                assignedDriver = driver;
                break;
            }
        }

        if (assignedDriver == null) {
            throw new NoDriverAvailableException("No drivers available");
        }

        assignedDriver.setAvailable(false);
        double fare = fareCalculator.calculateFare(distance);

        Ride ride = new Ride(rideCounter++, user, assignedDriver, distance, fare);
        rideHistory.add(ride);

        return ride;
    }


    public void showRideHistory() {
        for (Ride ride : rideHistory) {
            ride.showRideDetails();
        }
    }
    public void deleteRide(int rideId) {
        for (Ride ride : rideHistory) {
            if (ride.getRideId() == rideId) {
                ride.getDriver().setAvailable(true); // driver free again
                rideHistory.remove(ride);
                System.out.println("Ride deleted successfully");
                return;
            }
        }
        System.out.println("Ride not found");
    }
    public void updateRide(int rideId, double newDistance, FareCalculator fareCalculator) {
        for (Ride ride : rideHistory) {
            if (ride.getRideId() == rideId) {
                ride.setDistance(newDistance);
                ride.setFare(fareCalculator.calculateFare(newDistance));
                System.out.println("Ride updated successfully");
                return;
            }
        }
        System.out.println("Ride not found");
    }


}

