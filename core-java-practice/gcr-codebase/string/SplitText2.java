package string;
import java.util.Scanner;
public class SplitText2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String[] words = splitTextIntoWords(str);
        String[][] wordsWithLengths = getWordsWithLengths(words);
        System.out.printf("%-20s %-10s%n", "Word", "Length");
        for (String[] wordInfo : wordsWithLengths) {
            System.out.printf("%-20s %-10d%n", wordInfo[0], Integer.parseInt(wordInfo[1]));
        }

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

}