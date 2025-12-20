package control.flow.statement;

import java.util.Scanner;

public class YoungestFriend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int amarAge = sc.nextInt();
	        int akbarAge = sc.nextInt();
	        int anthonyAge = sc.nextInt();
	        int amarHeight = sc.nextInt();
	        int akbarHeight = sc.nextInt();
	        int anthonyHeight = sc.nextInt();
	        //find the youngest friend
	        if (amarAge < akbarAge && amarAge < anthonyAge) {
	            System.out.println("Amar is the youngest");
	        } 
	        else if (akbarAge < amarAge && akbarAge < anthonyAge) {
	            System.out.println("Akbar is the youngest");
	        } 
	        else {
	            System.out.println("Anthony is the youngest");
	        }
	        // Finding the tallest friend
	        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
	            System.out.println("Amar is the tallest");
	        } 
	        else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
	            System.out.println("Akbar is the tallest");
	        } 
	        else {
	            System.out.println("Anthony is the tallest");
	        }

	}

}
