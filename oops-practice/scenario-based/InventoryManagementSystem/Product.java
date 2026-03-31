package InventoryManagementSystem;
//product class
public class Product {
	//attributes
	private int productId;
	private String productName;
	private double price;
	private int stock;
	//constructor
	public Product(int productId,String productName,double price,int stock){
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
	public void addStock(int quantity) {
		stock+=quantity;
	}
	public void removeStock(int quantity)  throws OutOfStockException{
		if(stock<quantity) {
			throw new OutOfStockException("Insufficient Stock");
		}
		stock-=quantity;
	}
	public String toString() {
		return "Product { "+"Id : "+productId+", Name : "+productName+", Price : "+price+", Stock : "+stock+" }"; 
	}
	
}
