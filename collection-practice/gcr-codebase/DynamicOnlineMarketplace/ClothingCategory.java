package DynamicOnlineMarketplace;

public class ClothingCategory implements Category{
	public String getCategoryName() {
		return "Clothing";
	}
	public double getMinPrice() {
		return 30;
	}
	public double getMaxPrice() {
		return 50000;
	}

}

