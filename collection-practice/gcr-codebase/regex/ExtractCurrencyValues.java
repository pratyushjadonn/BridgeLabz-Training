package regex;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class ExtractCurrencyValues {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		String sentence=sc.nextLine();
		String regex="\\$?\\d+\\.\\d{2}";
		Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
	}
}
