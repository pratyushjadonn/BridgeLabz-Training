package coreJava;
import java.util.*;
public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("base:");
		int base=sc.nextInt();
		System.out.println("height:");
		int height=sc.nextInt();
		double areaCenti=0.5*base*height;
		double areaInch=areaCenti/6.4516;
		System.out.println(" Area of Triangle  is "+areaCenti+" square centimetre or "+areaInch+" square inches");	
	}
}
