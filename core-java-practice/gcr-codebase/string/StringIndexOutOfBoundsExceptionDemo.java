package string;

public class StringIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        // generateStringIndexOutOfBoundsException();
        handleStringIndexOutOfBoundsException();
    }
    public static void generateStringIndexOutOfBoundsException() {
        String text = "Hello, World!";
        // This will throw StringIndexOutOfBoundsException
        System.out.println(text.charAt(20));   
    }
    public static void handleStringIndexOutOfBoundsException() {
        String text = "Hello, World!";
        try {
            // This will throw StringIndexOutOfBoundsException
            System.out.println(text.charAt(20));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught a StringIndexOutOfBoundsException");
        }
    }
}