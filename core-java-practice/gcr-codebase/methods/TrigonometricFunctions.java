package methods;
import java.util.Scanner;
public class TrigonometricFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the angle in degrees: ");
        double angleInDegrees = sc.nextDouble();
        double[] results = calculateTrigonometricFunctions(angleInDegrees);
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
    }
    public static double[] calculateTrigonometricFunctions(double angleInDegrees) {
        double angleInRadians = Math.toRadians(angleInDegrees);
        double sine = Math.sin(angleInRadians);
        double cosine = Math.cos(angleInRadians);
        double tangent = Math.tan(angleInRadians);
        return new double[]{sine, cosine, tangent};
    }
}