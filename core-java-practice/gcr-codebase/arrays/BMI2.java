package arrays;
import java.util.Scanner;
public class BMI2 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of persons: ");
            int n = sc.nextInt();
            double[][] personData = new double[n][3]; // 0: weight, 1: height, 2: BMI
            String[] weightStatus = new String[n];
            for (int i = 0; i < n; i++) {
                double weight, height;
                do {
                    System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
                    weight = sc.nextDouble();
                    if (weight <= 0) {
                        System.out.println("Please enter a positive value for weight.");
                    }
                } while (weight <= 0);
                personData[i][0] = weight;
                do {
                    System.out.print("Enter height (m) of person " + (i + 1) + ": ");
                    height = sc.nextDouble();
                    if (height <= 0) {
                        System.out.println("Please enter a positive value for height.");
                    }
                } while (height <= 0);
                personData[i][1] = height;
                personData[i][2] = weight / (height * height); // Calculate BMI formula 
                if (personData[i][2] < 18.5) {
                    weightStatus[i] = "Underweight";
                } else if (personData[i][2] < 24.9) {
                    weightStatus[i] = "Normal weight";
                } else if (personData[i][2] < 39.9) {
                    weightStatus[i] = "Overweight";
                } else {
                    weightStatus[i] = "Obesity";
                }
            }
            System.out.println("Person\tHeight(m)\tWeight(kg)\tBMI\t\tStatus");
            for (int i = 0; i < n; i++) {
                System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n", (i + 1), personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
            }
    }
}
