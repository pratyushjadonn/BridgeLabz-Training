package string;
import java.util.*;;
public class CheckCharacter{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inputStr = sc.next();
        char[] charsMethod = getCharacters(inputStr);
        char[] charsBuiltIn = inputStr.toCharArray();
        System.out.println("Characters using user-defined method: ");
        for (char c : charsMethod) {
            System.out.print(c + " ");
        }
        System.out.println("\nCharacters using built-in toCharArray() method: ");
        for (char c : charsBuiltIn) {
            System.out.print(c + " ");
        }
        boolean areEqualMethod = compareCharArrays(charsMethod, charsBuiltIn);
        boolean areEqualBuiltIn = Arrays.equals(charsMethod, charsBuiltIn);
        System.out.println("\nAre the character arrays equal using my method? " + areEqualMethod);
        System.out.println("Are the character arrays equal using built-in method? " + areEqualBuiltIn);
    }
    public static char[] getCharacters(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
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