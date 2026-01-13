package ECommerceOrderManagementSystem;
import java.util.ArrayList;
import java.util.Scanner;

public class ECommerceOrderManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //product Catalog
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 6000, 10));
        products.add(new Product(2, "Smartphone", 25000, 15));
        products.add(new Product(3, "Headphones", 2000, 30));

        Customer customer = new Customer(101, "James", "9999999999");
        System.out.println("Welcome to E-Commerce Order Management System");

        //show Catalog
        System.out.println("\n----- Product Catalog -----");
        for (Product p : products) System.out.println(p);
        System.out.println("\n");
        System.out.println(customer.toString());
        //create Order
        Order order = new Order(5001, customer);
        //user selects products + quantity
        while (true) {
            System.out.print("\nEnter Product ID to buy (0 to stop): ");
            int pid = sc.nextInt();
            if (pid == 0) break;
            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();
            Product selected = null;
            for (Product p : products) {
                if (p.getProductId() == pid) {
                    selected = p;
                    break;
                }
            }

            if (selected == null) {
                System.out.println("Invalid Product ID!");
            } else if (qty <= 0) {
                System.out.println("Quantity must be greater than 0!");
            } else if (qty > selected.getStock()) {
                System.out.println("Not enough stock available!");
            } else {
                order.addItem(new OrderItem(selected,qty));
                System.out.println("Added to order: " + selected.getProductName() + " x " + qty);
            }
        }
        double total = order.calculateTotalPrice();
        System.out.println("\nTotal Payable: " + total);
        if(total==0) {
        	System.out.println("No items ordered");
        	return;
        }
        System.out.println();
        order.displayOrderInfo();
        //choose Payment Method
        System.out.println("\nSelect Payment Method:");
        System.out.println("1. Card");
        System.out.println("2. UPI");
        System.out.println("3. Wallet");
        int choice = sc.nextInt();

        Payment payment = null;

        if (choice == 1) payment = new CardPayment();
        else if (choice == 2) payment = new UPIPayment();
        else if (choice == 3) payment = new WalletPayment();
        else System.out.println("Invalid choice");
        
        boolean paySuccess=true;
        try {
            if (payment != null) {
                payment.pay(total); // Polymorphism
                order.displayOrderInfo();
            }
        } catch (PaymentFailedException e) {
        	paySuccess=false;
            System.out.println (e.getMessage());
        }

        //tracking Delivery
        System.out.println("\n Updating Delivery Status...");
        if(paySuccess) {
        	order.updateDeliveryStatus("SHIPPED");
            System.out.println("Delivery Status: " + order.getDeliveryStatus());

            //cancel Order Example
            System.out.println("\nDo you want to cancel the order? (yes/no): ");
            String cancel = sc.next();

            if (cancel.equalsIgnoreCase("yes")) {
                order.cancelOrder();
                System.out.println("Order Cancelled Successfully!");
            }
        
        }
        else {
        	order.cancelOrder();
        }

        order.displayOrderInfo();
        sc.close();
    }
}