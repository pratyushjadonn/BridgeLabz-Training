package string;
import java.util.Scanner;
public class SplitText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputStr = sc.nextLine();
        String[] wordsUsingCharAt = splitTextIntoWords(inputStr);
        String[] wordsUsingBuiltIn = inputStr.split(" ");
        System.out.println("Words using charAt(): ");
        for (String word : wordsUsingCharAt) {
            System.out.println(word);
        }
        System.out.println("Words using built-in split() method: ");
        for (String word : wordsUsingBuiltIn) {
            System.out.println(word);
        }
        boolean areEqual = compareStringArrays(wordsUsingCharAt, wordsUsingBuiltIn);
        System.out.println("Are the word arrays equal? " + areEqual);
    }
    public static String[] splitTextIntoWords(String str) {
        int wordCount = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }
        String[] words = new String[wordCount];
        int wordIndex = 0;
        StringBuilder currentWord = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                currentWord.append(ch);
            } else {
                words[wordIndex] = currentWord.toString();
                wordIndex++;
                currentWord.setLength(0);
            }
        }
        words[wordIndex] = currentWord.toString();
        return words;
    }
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
}