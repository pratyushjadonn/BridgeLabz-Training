package methods;
import java.util.Scanner;

public class CalculateSimpleInterest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the pricipal:");
		double p=scanner.nextDouble();
		System.out.println("enter the rate:");
	    double r=scanner.nextDouble();
	    System.out.println("enter the time:");
	    double t=scanner.nextDouble();
	    double si=calculateSI(p, r, t);
	    System.out.println("Simple interst: "+si);
	    }
	 static double calculateSI(double p,double r,double t) {
		 return (p*r*t)/100;	 
	 }

}
