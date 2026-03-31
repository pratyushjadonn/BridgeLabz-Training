package regex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExtractAllEmail {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		String text=sc.nextLine();
		String regex="[A-Za-z0-9._+%-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(text);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
