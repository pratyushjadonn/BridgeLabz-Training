package coreJavapractice;
import java.util.*;

class convertCelsiusToFahreheit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a temperature(in celcius):");
		double celcius=sc.nextDouble();   //take celcius as input
	    double fahrenheit=(celcius*1.8)+32;
	    System.out.println("Temperature(in fahrenheit)"+fahrenheit+'F');
		
	}

}
