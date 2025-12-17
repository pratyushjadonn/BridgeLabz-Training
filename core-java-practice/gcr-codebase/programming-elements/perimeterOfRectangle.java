package coreJavapractice;
import java.util.Scanner;
public class perimeterOfRectangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length:");
		double l=sc.nextDouble();
		System.out.println("enter the breath:");
		double b=sc.nextDouble();
		double p=2*(l+b);
		System.out.println("Perimeter of rectangle :"+p);
		}

}
