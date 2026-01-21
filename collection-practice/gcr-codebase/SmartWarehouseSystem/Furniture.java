package SmartWarehouseSystem;

public class Furniture extends WarehouseItem{
	public Furniture(int id,String name,int price) {
		super(id,name,price);
	}
	public String getCategory() {
		return "Furniture";
	}
	
}
