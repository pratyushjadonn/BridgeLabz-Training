package level1;

public class ProductInventory {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Smartphone", 499.49);
        product1.displayProductDetails();
        product2.displayProductDetails();
        Product.displayTotalProducts();
    }
}
class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0;
    // Parameterized constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }
    // Instance method to display product details
    public void displayProductDetails() {
        System.out.printf("Product Name: %s, Price: $%.2f%n", productName, price);
    }
    // Class method to display total products
    public static void displayTotalProducts() {
        System.out.printf("Total Products: %d%n", totalProducts);
    }
}

