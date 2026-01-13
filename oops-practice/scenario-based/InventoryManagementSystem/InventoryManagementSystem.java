package InventoryManagementSystem;

//main class
public class InventoryManagementSystem {
	public static void main(String[] args) {
		// products
		Product p1 = new Product(1, "Bags", 400, 10000);
		Product p2 = new Product(2, "Chairs", 600, 1000);
		Product p3 = new Product(3, "Mikes", 400, 122);
		// invetory
		AlertService alertService=new Alerts();
		Inventory inventory = new Inventory(alertService);
		inventory.addProduct(p1);
		inventory.addProduct(p2);
		inventory.addProduct(p3);
		inventory.displayInventory();
		inventory.displayInventory();
		Product p4 = inventory.searchProduct(3);
		System.out.println(p4.toString());
		Product p5 = inventory.searchProduct(4);
		System.out.println(p1.getStock());
		p1.addStock(10);
		System.out.println(p1.getStock());
		try {
			p1.removeStock(89);
			inventory.updateStock(3, 5);
		} catch (OutOfStockException e) {
			System.out.println(e.getMessage());
		}

	}
}
