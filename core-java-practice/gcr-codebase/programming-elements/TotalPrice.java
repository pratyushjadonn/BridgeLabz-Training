
package coreJava;
import java.util.*;
public class TotalPrice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the unitPrice:");
		int unitPrice=sc.nextInt();
		System.out.println("Enter the Quantity:");
		int quantity=sc.nextInt();
		System.out.println("The price is "+(unitPrice*quantity));		
	}
}
