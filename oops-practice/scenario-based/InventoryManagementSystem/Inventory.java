package InventoryManagementSystem;

import java.util.*;

public class Inventory {
	// attributes
	private ArrayList<Product> productList;
	private AlertService alertService;

	// constructor
	public Inventory(AlertService alertService) {
		this.productList = new ArrayList<>();
		this.alertService = alertService;
	}

	// add new product to inventory
	public void addProduct(Product p) {
		productList.add(p);
	}

	public void removeProduct(int id) {
		if(searchProduct(id)==null) {
			System.out.println("Product does not exist");
			return;
		}
		//this can cause runtime crash
//		for(Product p : productList) {
//			if(p.getProductId()==id) {
//				productList.remove(p);
//				System.out.println("Product removed");
//				return;
//			}
//		}
		 for (int i = 0; i < productList.size(); i++) {
		        if (productList.get(i).getProductId() == id) {
		            productList.remove(i);   // ✅ SAFE
		            System.out.println("Product removed");
		            return;
		        }
		    }
		System.out.println("Product does not exist");
	}

	public Product searchProduct(int id) {
		for (Product p : productList) {
			if (p.getProductId() == id) {
				System.out.println("Product found");
				return p;
			}
		}
		System.out.println("Product does not exist");
		return null;
	}

	public void updateStock(int productId, int quantity) throws OutOfStockException {

		Product p = searchProduct(productId);
		if (p == null) {
			System.out.println("Product not found");
			return;
		}

		p.removeStock(quantity);
		alertService.alert(p);
	}

	public void displayInventory() {
		for (Product p : productList) {
			System.out.println(p.toString());
		}
	}
}
