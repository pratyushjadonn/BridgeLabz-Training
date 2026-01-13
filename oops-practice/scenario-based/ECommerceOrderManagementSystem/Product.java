package ECommerceOrderManagementSystem;

public class Product {
	
	//attributes
	private int productId;
	private String productName;
	private double price;
	private int stock;
	
	//constructor
	Product(int productId,String productName,double price,int stock){
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		this.stock=stock;
	}
	
	//getter methods
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getPrice() {
		return price;
	}
	public int getStock() {
		return stock;
	}
	
	//add stock
	public void addStock(int quantity) {
		stock+=quantity;
	}
	
	public void removeStock(int quantity) {
		stock-=quantity;
	}
	
	@Override
	public String toString() {
		return "Product{"+" Id : "+productId+ ", Name : " + productName + ", price : " + price + ", Stock : " +stock +"}";
	}
}
