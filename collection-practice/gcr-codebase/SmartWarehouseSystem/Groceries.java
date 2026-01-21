package SmartWarehouseSystem;

public class Groceries extends WarehouseItem{
	public Groceries(int id,String name,int price) {
		super(id,name,price);
	}
	public String getCategory() {
		return "Groceries";
	}
}
