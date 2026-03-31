package scenario_based;
import java.util.*;
public class FlipKeyLogicalProblem{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String string=sc.nextLine();
		//method call
		String generatedKey=cleanseAndInvert(string);
		//output
		if(generatedKey.isEmpty()) {
			System.out.println("Invlaid Input");
		}
		else {
			System.out.println("The generated key is - "+generatedKey);
		}
		
	}
	//method to perform ascii logics and string manipulations
	public static String cleanseAndInvert(String input) {
		//some conditions
		if(input==null || input.length()<6) {
			return "";
		}
		if(input.contains(" ")) {
			return "";
		}
		for(int i=0;i<input.length();i++) {
			if(!((input.charAt(i)>=65 && input.charAt(i)<=90) || (input.charAt(i)>=97 && input.charAt(i)<=122))) {
				return "";
			}
		}
		//using string builder for string manipualtion
		input=input.toLowerCase();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)%2!=0) {
				sb.append(input.charAt(i));
			}
		}
		//reverse method
		sb=sb.reverse();
		int i=0;
		while(i<sb.length()) {
			sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
			i+=2;
		}
		return sb.toString();
	}
}
