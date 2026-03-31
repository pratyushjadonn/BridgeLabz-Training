package stringbuilder_stringbuffer;
import java.util.*;
public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//user input
		System.out.print("Enter a string : ");
		String string=sc.next();
		//stringBuilder to modify string
		StringBuilder sb=new StringBuilder();
		//set to store characters
		Set<Character> set=new HashSet<>();
		for(int i=0;i<string.length();i++) {
			//if character is already in the set
			if(set.contains(string.charAt(i))) {
				continue;
			}
			sb.append(string.charAt(i));
			set.add(string.charAt(i));
		}
		System.out.println("String after removing duplicates : "+sb.toString());
	}
}
