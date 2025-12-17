package coreJavapractice;
import java.util.*;

public class volumeOfCylinder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Radius of cylinder:");
		double r=sc.nextDouble();
		System.out.println("Height of a Cylinder:");
		double h =sc.nextDouble();
		double v= 3.14*r*r*h;
		System.out.println("Volume of Cylinder is :"+v);
	}
}
