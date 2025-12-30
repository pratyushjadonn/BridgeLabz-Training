package ClassAndObject;
public class CheckPalindromeString {
    public static void main(String[] args) {
        PalindromeChecker checker1 = new PalindromeChecker("A man a plan a canal Panama");
        PalindromeChecker checker2 = new PalindromeChecker("Hello");
        checker1.checkAndDisplay();
        checker2.checkAndDisplay();
    }
}
class PalindromeChecker {
    private String text;
    public PalindromeChecker(String text) {
        this.text = text;
    }
    public boolean isPalindrome() {
        String cleanedText = text.replaceAll("[\\W]", "").toLowerCase();
        String reversedText = new StringBuilder(cleanedText).reverse().toString();
        return cleanedText.equals(reversedText);
    }
    public void checkAndDisplay() {
        if (isPalindrome()) {
            System.out.println(text + " is palindrome");
        } else {
            System.out.println(text + " is not Palindrome");
        }
    }
}
