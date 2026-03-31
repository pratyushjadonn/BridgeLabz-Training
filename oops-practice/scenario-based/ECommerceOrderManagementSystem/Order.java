package ECommerceOrderManagementSystem;
import java.util.*;
public class Order {
	//attributes
	private int orderId;
	private Customer customer;
	private List<OrderItem> orderList;
	private String status;
	private String deliveryStatus;
	
	//constructor
	public Order(int orderId,Customer customer) {
		this.orderId=orderId;
		this.customer=customer;
		this.orderList=new ArrayList<>();
		this.status="PLACED";
		this.deliveryStatus="packed";
	}
	
	//getter methods
	public int getOrderId() {
		return orderId;
	}
	public Customer customer() {
		return customer;
	}
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	//adding ordered items to a list
	public void addItem(OrderItem item) {
		orderList.add(item);
	}
	
	//traversing list to calculate total price
	public double calculateTotalPrice() {
		double price=0;
		for(OrderItem item:orderList) {
			price+=(item.totalPrice());
		}
		return price;
	}
	public void cancelOrder() {
		status="CANCELLED";
		deliveryStatus="CANCELLED";
	}
	public void updateDeliveryStatus(String status) {
		status=status;
		deliveryStatus="DELIVERED";
	}
	public void displayOrderInfo() {
		System.out.println("--------- Order Deatils ----------");
		System.out.println("Order Id: "+orderId);
		System.out.println("Customer Name: "+customer.getCustomerName());
		System.out.println("Items Ordered: ");
		for(OrderItem item: orderList) {
			System.out.println(" "+item);
		}
		System.out.println("Total Amount: "+calculateTotalPrice());
		System.out.println("Order Status: "+status);
		System.out.println("Delivery Status: "+deliveryStatus);
	}
}