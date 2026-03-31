package functional_interface;
import java.util.function.Predicate;

public class TemperatureAlertSystem {
    public static void main(String[] args) {

        double threshold = 37.5;

        Predicate<Double> isHighTemperature =
                temp -> temp > threshold;

        double currentTemp = 39.0;

        if (isHighTemperature.test(currentTemp)) {
            System.out.println("Temperature Alert! High temperature detected.");
        } else {
            System.out.println("Temperature is normal.");
        }
    }
}
