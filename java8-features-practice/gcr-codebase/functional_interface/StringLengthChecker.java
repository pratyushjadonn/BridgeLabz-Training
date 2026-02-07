package functional_interface;
import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {

        int maxLimit = 10;

        Function<String, Integer> lengthFinder =
                str -> str.length();

        String message = "Hello Java World";

        int length = lengthFinder.apply(message);

        if (length > maxLimit) {
            System.out.println("Message exceeds character limit");
        } else {
            System.out.println("Message within limit");
        }
    }
}
