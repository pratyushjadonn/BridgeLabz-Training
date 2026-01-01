package keywords;
public class Vehicle {
    // Static variable for registration fee
    private static double registrationFee = 100.0;
    // Final variable for registration number
    private final String registrationNumber;
    // Instance variables
    private String ownerName;
    private String vehicleType;
    // Constructor using 'this'
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    // Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
    // Method to display vehicle details using instanceof
    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
            System.out.println();
        } else {
            System.out.println("Invalid Vehicle Object");
        }
    }
    // Main method
    public static void main(String[] args) {
        // Update registration fee for all vehicles
        Vehicle.updateRegistrationFee(150.0);
        // Create vehicle instances
        Vehicle vehicle1 = new Vehicle("Honest raj", "Sedan", "ABC123");
        Vehicle vehicle2 = new Vehicle("Price danish", "SUV", "XYZ789");
        // Display vehicle details
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
    
}