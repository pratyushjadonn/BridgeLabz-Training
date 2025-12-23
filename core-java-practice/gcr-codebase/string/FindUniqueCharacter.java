package string;
import java.util.Scanner;
public class FindUniqueCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputStr = sc.nextLine();
        char[] uniqueCharsUsingCharAt = findUniqueCharacters(inputStr);
        StringBuilder uniqueCharsUsingBuiltIn = new StringBuilder();
        for (char ch : inputStr.toCharArray()) {
            if (uniqueCharsUsingBuiltIn.indexOf(String.valueOf(ch)) == -1) {
                uniqueCharsUsingBuiltIn.append(ch);
            }
        }
        System.out.println("Unique characters using charAt(): ");
        for (char ch : uniqueCharsUsingCharAt) {
            System.out.print(ch + " ");
        }
        System.out.println("\nUnique characters using built-in method: ");
        for (int i = 0; i < uniqueCharsUsingBuiltIn.length(); i++) {
            System.out.print(uniqueCharsUsingBuiltIn.charAt(i) + " ");
        }
        boolean areEqual = compareCharArrays(uniqueCharsUsingCharAt, uniqueCharsUsingBuiltIn.toString().toCharArray());
        System.out.println("\nAre the unique character arrays equal? " + areEqual); 
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
    public static char[] findUniqueCharacters(String str) {
        int length = getStringLength(str);
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
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}