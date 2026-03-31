package DynamicOnlineMarketplace;

public class BookCategory implements Category{
	public String getCategoryName() {
		return "Book";
	}
	public double getMinPrice() {
		return 100;
	}
	public double getMaxPrice() {
		return 800;
	}
}
