package level1;
public class CarRentalService {
    public static void main(String[] args) {
        CarRental rental1 = new CarRental(); 
        CarRental rental2 = new CarRental("Alice Smith", "Toyota Camry", 5);    
    }
}
class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double DAILY_RATE = 40.0; // Assume 
    // Default constructor
    public CarRental() {
        this.customerName = "Default Customer";
        this.carModel = "Standard Model";
        this.rentalDays = 1;
        displayRentalInfo();
    }
    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        displayRentalInfo();
    }
    public void displayRentalInfo() {
        double totalCost = rentalDays * DAILY_RATE;
        System.out.printf("Customer Name: %s, Car Model: %s, Rental Days: %d, Total Cost: $%.2f%n",
                customerName, carModel, rentalDays, totalCost);
    }
}
