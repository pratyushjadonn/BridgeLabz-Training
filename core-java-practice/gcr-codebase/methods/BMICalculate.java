package methods;
import java.util.Scanner;
public class BMICalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        String[] status = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble() / 100; // convert cm to meters
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
            status[i] = determineStatus(data[i][2]);
        }
        System.out.printf("%-10s %-10s %-10s %-10s%n", "Weight(kg)", "Height(m)", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-10s%n", data[i][0], data[i][1], data[i][2], status[i]);
        }
    }
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
    public static String determineStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 39.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}