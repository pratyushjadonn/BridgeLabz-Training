package Inheritance;

public class DelieveredOrder extends ShippedOrder{
  boolean shippedOrder;
  String delieveryDate;
  
  DelieveredOrder(int orderId,int orderDate,int trackingNumber,boolean shippedOrder,String delieveryDate){
	  super(orderId,orderDate,trackingNumber);
	  this.delieveryDate=delieveryDate;
	  this.shippedOrder=shippedOrder;
  }
  
  void getOrderStatus() {
	  System.out.println("OrderID: "+orderId);
	  System.out.println("orderDate: "+orderDate);
	  System.out.println("trackingNumber: "+trackingNumber);
	  System.out.println("shippedOrder: "+shippedOrder);
	  System.out.println("delieveryDate: "+delieveryDate);
	  
  }
}
