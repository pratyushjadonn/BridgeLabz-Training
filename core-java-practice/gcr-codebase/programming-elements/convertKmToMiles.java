
package coreJavapractice;
import java.util.*;
public class convertKmToMiles {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Km:");
		int km=sc.nextInt();
		double miles=km*0.621371;
		System.out.println("in miles:"+miles);	
	}
}
