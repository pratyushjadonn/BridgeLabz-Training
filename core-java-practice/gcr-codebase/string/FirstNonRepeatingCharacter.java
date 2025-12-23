package string;
import java.util.Scanner;
public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputStr = sc.nextLine();
        char firstNonRepeatingCharUsingCharAt = findFirstNonRepeatingCharacter(inputStr);
        char firstNonRepeatingCharUsingBuiltIn = findFirstNonRepeatingCharacterBuiltIn(inputStr);
        System.out.println("First non-repeating character using charAt(): " + firstNonRepeatingCharUsingCharAt);
        System.out.println("First non-repeating character using built-in method: " + firstNonRepeatingCharUsingBuiltIn);
        boolean areEqual = (firstNonRepeatingCharUsingCharAt == firstNonRepeatingCharUsingBuiltIn);
        System.out.println("Are the first non-repeating characters equal? " + areEqual);
    }
    public static char findFirstNonRepeatingCharacter(String str) {
        int[] charFrequency = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charFrequency[ch]++;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (charFrequency[ch] == 1) {
                return ch;
            }
        }
        return '\0'; 
    }
    public static char findFirstNonRepeatingCharacterBuiltIn(String str) {
        int[] charFrequency = new int[256];
        for (char ch : str.toCharArray()) {
            charFrequency[ch]++;
        }
        for (char ch : str.toCharArray()) {
            if (charFrequency[ch] == 1) {
                return ch;
            }
        }
        return '\0';
    }

}