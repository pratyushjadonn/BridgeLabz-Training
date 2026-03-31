package DynamicOnlineMarketplace;

public class OnlineMarketplace {

	public static void main(String[] args) {
		System.out.println("Welcome to Dynamic Online MarketPlace");
		System.out.println("--------------------------------------------------------");
		Product<BookCategory> book = new Product<>("Java Programming", 150, new BookCategory());
		Product<ClothingCategory> shirt = new Product<>("T-Shirt", 120, new ClothingCategory());
		ProductCatalog catalog = new ProductCatalog();
		catalog.addProduct(book);
		catalog.addProduct(shirt);
		catalog.displayProducts();
		DiscountService.applyDiscount(book, 10);
		DiscountService.applyDiscount(shirt, 5);
		System.out.println("\n Product Catalog:");
		catalog.displayProducts();
	}
}
