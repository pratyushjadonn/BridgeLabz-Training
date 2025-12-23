package string;
import java.util.Scanner;
public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputStr = sc.nextLine();
        boolean isPalindromeUsingCharAt = checkPalindromeUsingCharAt(inputStr);
        boolean isPalindromeUsingRecursion = checkPalindromeUsingRecursion(inputStr, 0, inputStr.length() - 1);
        boolean isPalindromeUsingCharArray = checkPalindromeUsingCharArray(inputStr);
        System.out.println("Is palindrome using charAt(): " + isPalindromeUsingCharAt);
        System.out.println("Is palindrome using recursion: " + isPalindromeUsingRecursion);
        System.out.println("Is palindrome using char array: " + isPalindromeUsingCharArray);
    }
    public static boolean checkPalindromeUsingCharAt(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean checkPalindromeUsingRecursion(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return checkPalindromeUsingRecursion(str, start + 1, end - 1);
    }
    public static boolean checkPalindromeUsingCharArray(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        char[] reverseArray = new char[length];
        for (int i = 0; i < length; i++) {
            reverseArray[i] = charArray[length - 1 - i];
        }
        for (int i = 0; i < length; i++) {
            if (charArray[i] != reverseArray[i]) {
                return false;
            }
        }
        return true;
    }
}