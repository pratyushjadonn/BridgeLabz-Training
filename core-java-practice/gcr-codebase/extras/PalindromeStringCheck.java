package extras;
import java.util.Scanner;
public class PalindromeStringCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check for palindrome:");
        String input = sc.next();
        String convert = input.toLowerCase();
        String reversed = "";
        for (int i = convert.length() - 1; i >= 0; i--) {
            reversed += convert.charAt(i);
        }
        if (convert.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}