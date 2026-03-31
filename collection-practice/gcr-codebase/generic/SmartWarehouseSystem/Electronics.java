package SmartWarehouseSystem;

public class Electronics extends WarehouseItem{
	public Electronics(int id,String name,int price) {
		super(id,name,price);
	}
	public String getCategory() {
		return "Electronics";
	}
}
