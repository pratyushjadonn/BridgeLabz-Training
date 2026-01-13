package InventoryManagementSystem;

public interface AlertService{
	void alert (Product product) throws OutOfStockException;
}
