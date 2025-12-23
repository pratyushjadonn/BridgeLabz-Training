package string;
public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        // generateNumberFormatException();
        handleNumberFormatException();
    }
    public static void generateNumberFormatException() {
        String text = "Hello123";
        // This will throw NumberFormatException
        System.out.println(Integer.parseInt(text));
    }
    public static void handleNumberFormatException() {
        String text = "Hello123";
        try {
            // This will throw NumberFormatException
            System.out.println(Integer.parseInt(text));
        } catch (NumberFormatException e) {
            System.out.println("Caught a NumberFormatException");
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException");
        }
    }
}