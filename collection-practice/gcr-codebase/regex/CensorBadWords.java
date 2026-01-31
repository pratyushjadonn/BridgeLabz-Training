package regex;
import java.util.*;
public class CensorBadWords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		String sentence=sc.nextLine();
		System.out.println("Sentence before removing bad words : ");
		System.out.println(sentence);
		String regex="\\b(damn|stupid)\\b";
		String censored=sentence.replaceAll(regex,"****");
		System.out.println("Sentence before removing bad words : ");
		System.out.println(censored);
		
	}
}
