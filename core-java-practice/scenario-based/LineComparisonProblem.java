package scenario.based;
import java.util.Scanner;
public class LineComparisonProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Welcome to Line Comparison Computation program on Master Branch");
	    //coordinates of end points of Line 1
		System.out.println("Enter the coordinates of Line 1:");
		System.out.println("Enter x1: ");
		double x1=sc.nextDouble();
		System.out.println("Enter y1: ");
		double y1=sc.nextDouble();
		System.out.println("Enter x2: ");
		double x2=sc.nextDouble();
		System.out.println("Enter y2: ");
		double y2=sc.nextDouble();
		//coordinates of end points of line 2 
		System.out.println("Enter the coordinates of Line 2:");
		System.out.println("Enter x3: ");
		double x3=sc.nextDouble();
		System.out.println("Enter y3: ");
		double y3=sc.nextDouble();
		System.out.println("Enter x4: ");
		double x4=sc.nextDouble();
		System.out.println("Enter y4: ");
		double y4=sc.nextDouble();
		//Length of line 1;
		double l1=findLength(x1, x2, y1, y2);
		//Length of line 2
		double l2=findLength(x3, x4, y3, y4);
		//display the length of line
		System.out.println("Length of Line 1:"+l1);
		System.out.println("Length of Line 2"+l2);
		//check equality
	    checkEquality(l1, l2);		
	}
	static double findLength(double a1,double a2,double b1,double b2){
		double length=Math.sqrt(((a2-a1)*(a2-a1))+((b2-b1)*(b2-b1)));
		return length;
		
	}
	static void checkEquality(double l1 , double l2 ) {
		if(l1==l2) {
			System.out.println("Both Lines are equals");
		}
		else if(l1>l2) {
			System.out.println("Line 1 is greater than line 2");
		}
		else {
			System.out.println("Line 1 is smaller than line 2");
		}
	}

}
