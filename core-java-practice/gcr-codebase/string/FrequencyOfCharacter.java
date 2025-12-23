package string;
import java.util.Scanner;
public class FrequencyOfCharacter {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputStr = sc.nextLine();
        int[][] frequencyUsingCharAt = findCharacterFrequency(inputStr);
        int[] charFrequencyUsingBuiltIn = new int[256];
        for (char ch : inputStr.toCharArray()) {
            charFrequencyUsingBuiltIn[ch]++;
        }
        System.out.println("Character frequencies using charAt(): ");
        for (int i = 0; i < frequencyUsingCharAt.length; i++) {
            System.out.println("Character: " + (char)frequencyUsingCharAt[i][0] + " Frequency: " + frequencyUsingCharAt[i][1]);
        }
        System.out.println("Character frequencies using built-in method: ");
        for (int i = 0; i < charFrequencyUsingBuiltIn.length; i++) {
            if (charFrequencyUsingBuiltIn[i] > 0) {
                System.out.println("Character: " + (char)i + " Frequency: " + charFrequencyUsingBuiltIn[i]);
            }
        }
    }
    public static int[][] findCharacterFrequency(String str) {
        int[] charFrequency = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charFrequency[ch]++;
        }
        int uniqueCharCount = 0;
        for (int freq : charFrequency) {
            if (freq > 0) {
                uniqueCharCount++;
            }
        }
        int[][] frequencyArray = new int[uniqueCharCount][2];
        int index = 0;
        for (int i = 0; i < charFrequency.length; i++) {
            if (charFrequency[i] > 0) {
                frequencyArray[index][0] = i; 
                frequencyArray[index][1] = charFrequency[i]; 
                index++;
            }
        }
        return frequencyArray;
    }
}