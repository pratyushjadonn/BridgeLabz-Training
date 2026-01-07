package scenario.based;

public class Ride {
    private int rideId;
    private User user;
    private Driver driver;
    private double distance;
    private double fare;

    public Ride(int rideId, User user, Driver driver, double distance, double fare) {
        this.rideId = rideId;
        this.user = user;
        this.driver = driver;
        this.distance = distance;
        this.fare = fare;
    }

    public int getRideId() {
        return rideId;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public Driver getDriver() {
        return driver;
    }

    public void showRideDetails() {
        System.out.println("Ride ID: " + rideId);
        System.out.println("User: " + user.getName());
        System.out.println("Driver: " + driver.getName());
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: ₹" + fare);
        System.out.println("---------------------");
    }
}

