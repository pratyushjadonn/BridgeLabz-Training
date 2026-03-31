package practice;

import java.util.*;
    
  
public class SupermarketStoreInventory {
	static double sum=0;

	static void added(String str) {
		String input[]=str.split(",");
		System.out.println("Product added to inventory:"+input[1]);
		
		
	}
	static void inventory(String str) {
		String input[]=str.split(",");
		String key =input[0].trim();
		String price=input[2].trim();
		String quantity=input[3].trim();
		String last=input[4].trim();
		sum+=(Double.parseDouble(price)*Integer.parseInt(quantity));
		
		if(key.equals("Electronics")) {
			System.out.println(""+input[1]+" - Price: "+Double.parseDouble(price)+" ,Quantity: "+Integer.parseInt(quantity)+" ,Warranty: "+Integer.parseInt(last)+" months");
		}
		else {
			System.out.println(""+input[1]+" - Price: "+Double.parseDouble(price)+" ,Quantity: "+Integer.parseInt(quantity)+" ,Size: "+last);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int n =scanner.nextInt();
		scanner.nextLine();
		String arr[]=new String[n];
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextLine();
		}
		
		for(int i=0;i<n;i++) {
			added(arr[i]);
		}
		
		for(int i=0;i<n;i++) {
			inventory(arr[i]);
		}
		System.out.println("Total value of the inventory: "+sum);
		
		
	}

}
