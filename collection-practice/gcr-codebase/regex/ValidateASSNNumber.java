package regex;
import java.util.regex.*;
import java.util.Scanner;
public class ValidateASSNNumber {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a sentence : ");
        String text = sc.nextLine();
        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        if(matcher.find()) {
            System.out.println(matcher.group() +  " is valid");
        } 
        else {
            System.out.println("No valid SSN found");
        }
    }
}
