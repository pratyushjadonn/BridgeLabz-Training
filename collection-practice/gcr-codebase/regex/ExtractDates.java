package regex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExtractDates {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		String sentence=sc.nextLine();
		String regex="\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/[0-9]{4}\\b";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(sentence);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}

}
