package ECommerceOrderManagementSystem;

public class Customer {
	//attributes
	private int customerId;
	private String customerName;
	private String phoneNumber;
	
	//constructor
	public Customer(int customerId,String customerName,String phoneNumber){
		this.customerId=customerId;
		this.customerName=customerName;
		this.phoneNumber=phoneNumber;
	}
	
	//getter methods
	public int getCustomerId() {
		return customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	@Override
	public String toString() {
		return "Customer{"+" Id : "+customerId+ ", Name : " + customerName + ", PhoneNumber : " + phoneNumber +"}";
	}
	
}
