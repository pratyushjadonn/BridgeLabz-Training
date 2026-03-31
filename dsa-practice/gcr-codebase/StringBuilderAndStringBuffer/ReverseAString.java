package stringbuilder_stringbuffer;
import java.util.*;
public class ReverseAString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//user input
		System.out.print("Enter a string: ");
		String string=sc.next();
		System.out.println("Reversed String : "+reverseString(string)); 
	}
	//method to reverse string
	public static String reverseString(String string) {
		StringBuilder sb=new StringBuilder(string);
		sb.reverse();
		return sb.toString();
	}

}
