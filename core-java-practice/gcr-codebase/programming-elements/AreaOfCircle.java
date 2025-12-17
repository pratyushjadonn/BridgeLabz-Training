package coreJavapractice;
import java.util.*;
public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the radius of cirle:");
		 int r=sc.nextInt();     // take radius as input
		 double area=3.14*r*r;	
		 System.out.println("Area of circle:"+area);
	}
}
