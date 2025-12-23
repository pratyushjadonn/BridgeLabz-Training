package string;
import java.util.Scanner;
public class FrequencyOfCharacters2 {
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String inputStr = sc.nextLine();
            char[] uniqueChars = findUniqueCharacters(inputStr);
            int[][] frequencyArray = findCharacterFrequency(inputStr, uniqueChars);
            System.out.println("Character frequencies: ");
            for (int i = 0; i < frequencyArray.length; i++) {
                System.out.println("Character: " + (char)frequencyArray[i][0] + " Frequency: " + frequencyArray[i][1]);
            }
    }
    public static char[] findUniqueCharacters(String str) {
        int length = str.length();
        char[] tempUniqueChars = new char[length];
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                tempUniqueChars[uniqueCount] = ch;
                uniqueCount++;
            }
        }
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = tempUniqueChars[i];
        }
        return uniqueChars;
    }
    public static int[][] findCharacterFrequency(String str, char[] uniqueChars) {
        int[] charFrequency = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charFrequency[ch]++;
        }
        int[][] frequencyArray = new int[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            frequencyArray[i][0] = ch; 
            frequencyArray[i][1] = charFrequency[ch]; 
        }
        return frequencyArray;
    }
}