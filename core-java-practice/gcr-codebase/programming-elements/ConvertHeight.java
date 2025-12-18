package coreJava;
import java.util.*;

public class ConvertHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Height (in cm):");
		double h =sc.nextInt();
		System.out.println("Height in cm is "+h+ " in feet is "+ h/30.48+ " and inches is " +(h/2.54));

	}

}
