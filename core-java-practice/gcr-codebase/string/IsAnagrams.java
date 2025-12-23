package string;
import java.util.Scanner;
public class IsAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        boolean resultUsingCharAt = areAnagramsUsingCharAt(str1, str2);
        boolean resultUsingBuiltIn = areAnagramsUsingBuiltIn(str1, str2);
        System.out.println("Are the two strings anagrams using charAt()? " + resultUsingCharAt);
        System.out.println("Are the two strings anagrams using built-in method? " + resultUsingBuiltIn);
        boolean areEqual = (resultUsingCharAt == resultUsingBuiltIn);
        System.out.println("Are the results equal? " + areEqual);
    }
    public static boolean areAnagramsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] charCount = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i)]++;
            charCount[str2.charAt(i)]--;
        }
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean areAnagramsUsingBuiltIn(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] charCount = new int[256];
        for (char ch : str1.toCharArray()) {
            charCount[ch]++;
        }
        for (char ch : str2.toCharArray()) {
            charCount[ch]--;
        }
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}