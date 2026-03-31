package SmartWarehouseSystem;

abstract class WarehouseItem {
	private int id;
	private String name;
	private int price;

	public WarehouseItem(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	abstract public String getCategory();

	public void displayDetails() {
		System.out.println("--------------------------");
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Price : " + price);
	}
}
