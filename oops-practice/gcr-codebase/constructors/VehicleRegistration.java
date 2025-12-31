package level1;
public class VehicleRegistration {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("John Doe", "Car");
        Vehicle vehicle2 = new Vehicle("Jane Smith", "Motorcycle");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(150.0);
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        
    }
}
class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 100.0; // Default registration fee
    // Parameterized constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.printf("Owner Name: %s, Vehicle Type: %s, Registration Fee: $%.2f%n", 
                          ownerName, vehicleType, registrationFee);
    }
    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}
