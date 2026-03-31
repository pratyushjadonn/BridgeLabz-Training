package stringbuilder_stringbuffer;
import java.util.*;
public class ConcatenateString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//user input
		System.out.print("Enter length of the string array: ");
		int n=sc.nextInt();
		String[] stringArray=new String[n];
		System.out.println("Enter strings for a string array");
		for(int i=0;i<n;i++) {
			stringArray[i]=sc.next();
		}
		//method call
		String concatenatedString=concatenateString(stringArray);
		System.out.println("Concatenated String : "+concatenateString(stringArray));	
	}
	//method to concatenate strings of a string array
	public static String concatenateString(String[] stringArray) {
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<stringArray.length;i++) {
			sb.append(stringArray[i]);
			sb.append(" ");
		}
		return sb.toString();
	}

}
