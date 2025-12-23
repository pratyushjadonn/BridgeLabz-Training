package string;
import java.util.Scanner;
public class DisplayCharacterType {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String inputStr = sc.nextLine();
            String[][] charTypes = findCharacterTypes(inputStr);
            displayCharacterTypes(charTypes);

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
    public static String[][] findCharacterTypes(String str) {
        String[][] charTypes = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String type = checkVowelOrConsonant(ch);
            charTypes[i][0] = Character.toString(ch);
            charTypes[i][1] = type;
        }
        return charTypes;
    }
    public static void displayCharacterTypes(String[][] charTypes) {
        System.out.printf("%s %s%n", "Character", "Type");
        for (String[] charType : charTypes) {
            System.out.printf("%s %s%n", charType[0], charType[1]);
        }
    }

}