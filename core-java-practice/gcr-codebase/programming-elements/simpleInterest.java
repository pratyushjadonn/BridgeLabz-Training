package coreJavapractice;
import java.util.*;
public class simpleInterest {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the principal:");
	double principal=sc.nextDouble();
	System.out.println("enter the rate:");
	double rate=sc.nextDouble();
	System.out.println("enter the time:");
	double time=sc.nextDouble();
	double si=(principal*rate*time)/100;
	System.out.println("Simple Interest :"+si);
	}
}
