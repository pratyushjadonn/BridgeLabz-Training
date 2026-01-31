package regex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExtractProgrammingLanguageNames {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		String sentence=sc.nextLine();
		String regex="\\b(Java|Python|JavaScript|Go)\\b";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(sentence);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
