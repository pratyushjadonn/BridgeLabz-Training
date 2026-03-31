package keywords;
public class Product {
    // Static variable for discount percentage
    private static double discount = 0.0;
    // Final variable for product ID
    private final String productID;
    // Instance variables
    private String productName;
    private double price;
    private int quantity;
    // Constructor using 'this'
    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    // Static method to update discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
    // Method to display product details using instanceof
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            double priceAfterDiscount = price - (price * discount / 100);
            System.out.println("Price after Discount: $" + priceAfterDiscount);
            System.out.println();
        } else {
            System.out.println("Invalid Product Object");
        }
    }
    // Main method
    public static void main(String[] args) {
        // Update discount for all products
        Product.updateDiscount(10.0);
        // Create product instances
        Product prod1 = new Product("P001", "Laptop", 1200.0, 5);
        Product prod2 = new Product("P002", "Smartphone", 800.0, 10);
        // Display product details
        prod1.displayProductDetails();
        prod2.displayProductDetails();
    }
}