package Exceptions;
import java.util.*;
public class MultipleException {
   public static void main(String[]args) {
	   Scanner sc=new Scanner(System.in);
	   int arr[]= {1,2,3};
	   try {
		   int idx=sc.nextInt();
		   int r=arr[idx];
		   System.out.println("value is "+r);
		   
		   String s=null;
		   System.out.println(s.length());
	   }catch(ArrayIndexOutOfBoundsException e){
		   System.out.print("array out of bound");
	   }catch(NullPointerException e) {
		   System.out.print("null pointer exception");
	   } 
   }
}
