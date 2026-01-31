package regex;
import java.util.*;
public class ReplaceMultipleSpacesWithASingleSpace {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		String sentence=sc.nextLine();
		System.out.println("Sentence before removing multiple spaces : ");
		System.out.println(sentence);
		String result=sentence.replaceAll("\\s+"," ");
		System.out.println("Sentence after removing multiple spaces : ");
		System.out.println(result);
	}
}
