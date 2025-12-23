package string;
import java.util.Scanner;
public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputStr = sc.nextLine();
        int[] counts = findVowelsAndConsonants(inputStr);
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);

    }
    public static String checkVowelOrConsonant(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        } else if (ch >= 'b' && ch <= 'z') {
            return "Consonant";
        } else {
            return "Not a Letter";
        }
    }
    public static int[] findVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String result = checkVowelOrConsonant(ch);
            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }
        return new int[]{vowelCount, consonantCount};
    }

}