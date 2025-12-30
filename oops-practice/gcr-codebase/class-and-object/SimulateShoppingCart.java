package ClassAndObject;
public class SimulateShoppingCart {
    public static void main(String[] args) {
        CartItem cartItem = new CartItem("Laptop", 999.99, 1);
        cartItem.displayItem();
        cartItem.addItem(2);
        cartItem.removeItem(1);
        System.out.printf("Total cost: $%.2f%n", cartItem.totalCost());
    }
}
class CartItem {
    private String itemName;
    private double price;
    private int quantity;
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public void addItem(int qty) {
        quantity += qty;
        System.out.println("Added " + qty + " of " + itemName + " to the cart.");
    }
    public void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println("Removed " + qty + " of " + itemName + " from the cart.");
        } else {
            System.out.println("Cannot remove " + qty + " of " + itemName + ". Only " + quantity + " in cart.");
        }
    }
    public double totalCost() {
        return price * quantity;
    }
    public void displayItem() {
        System.out.printf("Item: %s, Price: $%.2f, Quantity: %d%n", itemName, price, quantity);
    }
}

