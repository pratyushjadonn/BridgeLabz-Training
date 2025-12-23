package string;
public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        // generateArrayIndexOutOfBoundsException();
        handleArrayIndexOutOfBoundsException();
    }
    public static void generateArrayIndexOutOfBoundsException() {
        String[] names = {"Alice", "Bob", "Charlie"};
        // This will throw ArrayIndexOutOfBoundsException
        System.out.println(names[5]);
    }
    public static void handleArrayIndexOutOfBoundsException() {
        String[] names = {"Alice", "Bob", "Charlie"};
        try {
            // This will throw ArrayIndexOutOfBoundsException
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException");
        }
    }
}