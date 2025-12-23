package string;
import java.util.Scanner;
public class FindShortestLongest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputStr = sc.nextLine();
        String[] words = splitTextIntoWords(inputStr);
        String[][] wordsWithLengths = getWordsWithLengths(words);
        String[] shortestAndLongest = findShortestAndLongest(wordsWithLengths);
        System.out.println("Shortest string: " + shortestAndLongest[0]);
        System.out.println("Longest string: " + shortestAndLongest[1]);
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
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return count;
    }
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] wordsWithLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordsWithLengths[i][0] = words[i];
            wordsWithLengths[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return wordsWithLengths;
    }
    public static String[] findShortestAndLongest(String[][] wordsWithLengths) {
        String shortest = wordsWithLengths[0][0];
        String longest = wordsWithLengths[0][0];
        int minLength = Integer.parseInt(wordsWithLengths[0][1]);
        int maxLength = Integer.parseInt(wordsWithLengths[0][1]);
        for (int i = 0; i < wordsWithLengths.length; i++) {
            int length = Integer.parseInt(wordsWithLengths[i][1]);
            if (length < minLength) {
                minLength = length;
                shortest = wordsWithLengths[i][0];
            }
            if (length > maxLength) {
                maxLength = length;
                longest = wordsWithLengths[i][0];
            }
        }
        return new String[]{shortest, longest};
    }

}