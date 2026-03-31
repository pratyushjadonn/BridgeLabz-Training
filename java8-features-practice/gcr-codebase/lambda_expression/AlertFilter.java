package lambda_expression;
import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String toString() {
        return type + ": " + message;
    }
}

public class AlertFilter {
    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
                new Alert("EMERGENCY", "Heart rate critical"),
                new Alert("INFO", "Appointment reminder"),
                new Alert("WARNING", "High blood pressure")
        );

        Predicate<Alert> emergencyOnly =
                alert -> alert.type.equals("EMERGENCY");

        alerts.stream()
                .filter(emergencyOnly)
                .forEach(System.out::println);
    }
}
