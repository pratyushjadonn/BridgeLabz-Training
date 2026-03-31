package InventoryManagementSystem;

public class Alerts implements AlertService{
	public void alert(Product product) throws OutOfStockException{
		if(product.getStock()==0) {
			throw new OutOfStockException("Product" +product.getProductName() +" is out of stock");
		}
		if(product.getStock()<1000) {
			System.out.println("ALERT : Low stock for : "+product.getProductName());
		}
	}
}
