package string;
import java.util.Scanner;
public class ConvertUpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String upperStrUsingCharAt = convertToUppercase(str);
        String upperStrUsingBuiltIn = str.toUpperCase();
        System.out.println("Uppercase using charAt(): " + upperStrUsingCharAt);
        System.out.println("Uppercase using built-in toUpperCase() method: " + upperStrUsingBuiltIn);
        boolean areEqualUsingCharAt = compareStrings(upperStrUsingCharAt, upperStrUsingBuiltIn);
        System.out.println("Are the uppercase strings equal using charAt()? " + areEqualUsingCharAt);

    }
    public static String convertToUppercase(String str) {
        StringBuilder upperStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                upperStr.append((char)(ch - 32));
            } else {
                upperStr.append(ch);
            }
        }
        return upperStr.toString();
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