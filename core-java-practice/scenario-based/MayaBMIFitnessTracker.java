package scenario.based;

import java.util.Scanner;

public class MayaBMIFitnessTracker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the weight:");
        double weight = sc.nextDouble();
        System.out.println("Enter the height in cm:");
        double heightCm = sc.nextDouble();
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);  //calculate bmi
        System.out.printf("BMI: %.2f\n", bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Normal weight");    
        } else if (bmi >= 25 && bmi < 39.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }	
	}

}
