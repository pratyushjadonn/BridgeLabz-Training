package SmartWarehouseSystem;

public class SmartWarehouse {
	public static void main(String[] args) {
		System.out.println("Welcome to Smart Management System");
		System.out.println("-------------------------------------");

		Storage<Electronics> electronicsStorage = new Storage<>();
		electronicsStorage.addItem(new Electronics(1, "Laptop", 75000));
		electronicsStorage.addItem(new Electronics(2, "Mobile", 30000));

		Storage<Groceries> groceryStorage = new Storage<>();
		groceryStorage.addItem(new Groceries(1, "Rice", 1200));
		groceryStorage.addItem(new Groceries(2, "Oil", 800));

		Storage<Furniture> furnitureStorage = new Storage<>();
		furnitureStorage.addItem(new Furniture(1, "Chair", 2500));

		System.out.println("Electronics Storage:");
		WarehouseUtils.displayItems(electronicsStorage.getItems());

		System.out.println("\nGrocery Storage:");
		WarehouseUtils.displayItems(groceryStorage.getItems());

		System.out.println("\nFurniture Storage:");
		WarehouseUtils.displayItems(furnitureStorage.getItems());
	}
}
