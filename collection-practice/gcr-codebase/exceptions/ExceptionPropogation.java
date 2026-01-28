package Exceptions;
import java.util.*;
public class ExceptionPropogation {
   public static void main(String[]args) {
	   Scanner sc=new Scanner(System.in);
	  try {
		  int amount=sc.nextInt();
		   int rate=sc.nextInt();
		   int years=sc.nextInt();
		  double ci=calculateInterest( amount,  rate,  years);
		  
		  System.out.println("CI is"+ci);
	  }catch(IllegalArgumentException e) {
		  System.out.println("error is"+e);
	  }
	   
   }
   public static double calculateInterest(double amount, double rate, int years)throws IllegalArgumentException  {
	   if(amount<0 || rate<0) {
		   throw new IllegalArgumentException ("invalid input ");
	   }
	   return amount*rate*years;
   }
}
