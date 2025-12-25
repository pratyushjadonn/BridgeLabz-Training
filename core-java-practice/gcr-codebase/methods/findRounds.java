package methods;
import java.util.Scanner;
public class findRounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//Enter the side of triangular park side 
		System.out.println("ENTER THE LENGTH OF SIDE OF PARK (in meter)");
		System.out.println("First side:");
		double a=sc.nextDouble();
		System.out.println("Second side:");
		double b =sc.nextDouble();
		System.out.println("Third side:");
		double c=sc.nextDouble();
		System.out.println("Enter the distance (in km) to run:");
		double distance=sc.nextInt();
		System.out.println("There are "+ansy(distance,a, b, c)+" rounds to complete " +distance+" km distance" );
		

	}
	static double ansy(double distance,double a, double b, double c) {
		return (distance*1000)/(a+b+c);
		
	}

}
