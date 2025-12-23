package string;
import java.util.Scanner;
public class ConvertLowerCase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputStr = sc.nextLine();
        String lowerStrUsingCharAt = convertToLowercase(inputStr);
        String lowerStrUsingBuiltIn = inputStr.toLowerCase();
        System.out.println("Lowercase using charAt(): " + lowerStrUsingCharAt);
        System.out.println("Lowercase using built-in toLowerCase() method: " + lowerStrUsingBuiltIn);
        boolean areEqualUsingCharAt = compareStrings(lowerStrUsingCharAt, lowerStrUsingBuiltIn);
        System.out.println("Are the lowercase strings equal using charAt()? " + areEqualUsingCharAt);
    }
    public static String convertToLowercase(String str) {
        StringBuilder lowerStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                lowerStr.append((char)(ch + 32));
            } else {
                lowerStr.append(ch);
            }
        }
        return lowerStr.toString();
    }
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}