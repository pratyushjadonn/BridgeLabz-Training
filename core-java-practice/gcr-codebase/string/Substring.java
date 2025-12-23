package string;
import java.util.Scanner;
public class Substring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the String:");
        String str = sc.next();
        System.out.print("Enter the start index for substring:");
        int start = sc.nextInt();
        System.out.print("Enter the end index for substring:");
        int end = sc.nextInt();
        String subStrUsingCharAt = getSubstring(str, start, end);
        String subStrUsingBuiltIn = str.substring(start, end);
        System.out.println("Substring using charAt(): " + subStrUsingCharAt);
        System.out.println("Substring using built-in method: " + subStrUsingBuiltIn);
        boolean areEqualUsingCharAt = compareStrings(subStrUsingCharAt, subStrUsingBuiltIn);
        boolean areEqualUsingEquals = subStrUsingCharAt.equals(subStrUsingBuiltIn);
        System.out.println("Substrings equal using charAt(): " + areEqualUsingCharAt);
        System.out.println("Substrings equal using equals(): " + areEqualUsingEquals);
    }
    public static String getSubstring(String str, int start, int end) {
        String subStr="";
        for (int i = start; i < end; i++) {
            subStr+=(str.charAt(i));
        }
        return subStr;
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