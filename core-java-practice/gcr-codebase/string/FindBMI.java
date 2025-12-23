package string;
import java.util.Scanner;
public class FindBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10; 
        double[][] heightWeight = new double[n][2];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (in kg) of person " + (i + 1) + ": ");
            heightWeight[i][0] = sc.nextDouble();
            System.out.print("Enter height (in cm) of person " + (i + 1) + ": ");
            heightWeight[i][1] = sc.nextDouble();
        }
        String[][] bmiData = calculateBMI(heightWeight);
        displayBMIData(bmiData);
    }
    public static String[][] calculateBMI(double[][] hw) {
        String[][] bmiData = new String[hw.length][4];
        for (int i = 0; i < hw.length; i++) {
            double weight = hw[i][0];
            double heightCm = hw[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi < 39.9) {
                status = "Overweight";
            } else {
                status = "Obesity";
            }
            bmiData[i][0] = String.format("%.2f", heightCm);
            bmiData[i][1] = String.format("%.2f", weight);
            bmiData[i][2] = String.format("%.2f", bmi);
            bmiData[i][3] = status;
        }
        return bmiData;
    }
    public static void displayBMIData(String[][] bmiData) {
        System.out.printf("%-15s %-15s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        for (String[] data : bmiData) {
            System.out.printf("%-15s %-15s %-10s %-15s%n", data[0], data[1], data[2], data[3]);
        }
    }
}