package coreJava;
import java.util.*;
public class DiscountFee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("fee:");
		int fee=sc.nextInt();
		System.out.println("discont percent:");
		int discountPercent=sc.nextInt();
		int discount=(fee*discountPercent)/100;
		System.out.println("The discount amount is "+discount);
		int discountPrice=fee-discount;
		System.out.println("the final discount fee is "+discountPrice);

	}

}
