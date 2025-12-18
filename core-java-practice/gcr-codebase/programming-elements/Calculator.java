package coreJava;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		float a=sc.nextFloat();
		System.out.println("Enter the second number:");
		float b =sc.nextFloat();
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+a+" and "+b+" is "+(a+b)+ ","+(a-b)+","+(a*b)+",and"+(a/b));
	}

}
