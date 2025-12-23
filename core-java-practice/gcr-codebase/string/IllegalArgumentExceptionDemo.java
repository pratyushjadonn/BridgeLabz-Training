package string;

public class IllegalArgumentExceptionDemo {
    public static void main(String[] args) {
        // generateIllegalArgumentException();
        handleIllegalArgumentException();
    }
    public static void generateIllegalArgumentException() {
        String text = "Hello, World!";
        // This will throw IllegalArgumentException
        System.out.println(text.substring(8, 5));
    }
    public static void handleIllegalArgumentException() {
        String text = "HelloKyaHaalHai";
        try {
            // This will throw IllegalArgumentException
            System.out.println(text.substring(8, 5));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException");
        }
    }
}