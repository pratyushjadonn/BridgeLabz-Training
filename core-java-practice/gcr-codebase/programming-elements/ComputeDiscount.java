package coreJava;

public class computeDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fee=125000;
		int discountPercent=10;
		int discount=(fee*discountPercent)/100;
		System.out.println("The discount amount is "+discount);
		int discountPrice=fee-discount;
		System.out.println("the discount price is "+discountPrice);
	}

}
