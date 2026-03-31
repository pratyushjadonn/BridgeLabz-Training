package lambda_expression;
import java.util.*;
import java.util.stream.Collectors;

public class UppercaseNames {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("ram", "sita", "arjun");

        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperNames);
    }
}
