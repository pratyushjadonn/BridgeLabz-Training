package regex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class FindRepeatingWords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		String sentence=sc.nextLine();
		String regex="\\b(\\w+)\\s+\\1\\b";
		Pattern pattern=Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher(sentence);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
