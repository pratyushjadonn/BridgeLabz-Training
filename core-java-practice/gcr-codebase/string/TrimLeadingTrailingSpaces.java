package string;
import java.util.Scanner;
public class TrimLeadingTrailingSpaces {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String inputStr = sc.nextLine();
            int[] trimIndices = trimLeadingTrailingSpaces(inputStr);
            String trimmedStrUsingCharAt = createSubstring(inputStr, trimIndices[0], trimIndices[1]);
            String trimmedStrUsingBuiltIn = inputStr.trim();
            System.out.println("Trimmed string using charAt(): '" + trimmedStrUsingCharAt + "'");
            System.out.println("Trimmed string using built-in trim() method: '" + trimmedStrUsingBuiltIn + "'");
            boolean areEqual = compareStrings(trimmedStrUsingCharAt, trimmedStrUsingBuiltIn);
            System.out.println("Are the trimmed strings equal? " + areEqual);
    }
    public static int[] trimLeadingTrailingSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end + 1};
    }
    public static String createSubstring(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
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