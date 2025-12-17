package coreJavapractice;
import java.util.*;
public class powerCalculation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base number:");
		double a=sc.nextDouble();
		System.out.println("Enter the exponent number:");
		int e=sc.nextInt();
		double ans=Math.pow(a,e);
		System.out.println("The result:"+ans);	
	}
}
