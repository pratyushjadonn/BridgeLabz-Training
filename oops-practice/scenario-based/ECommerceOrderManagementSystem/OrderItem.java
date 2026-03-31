package ECommerceOrderManagementSystem;

public class OrderItem {
	//attributes
	private Product product;
	private int quantity;
	
	//constructor
	public OrderItem(Product product,int quantity) {
		this.product=product;
		this.quantity=quantity;
	}
	
	//getter methods
	public Product getProduct() {
		return product;
	}
	public int quantity() {
		return quantity;
	}
	
	//method to calculate total price
	public double totalPrice() {
		return quantity*product.getPrice();
	}
	
	@Override
	public String toString() {
		return "OrderItem{"+ "Name : " + product.getProductName() + ", quantity : " + quantity + ", Total Price : " +totalPrice()+"}";

	}
}
