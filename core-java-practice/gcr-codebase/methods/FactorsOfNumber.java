package methods;
import java.util.Scanner;
public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] factorsArray = findFactors(number);
        int greatestFactor = factorsArray[factorsArray.length - 1];
        int sumOfFactors = 0;
        long productOfFactors = 1;
        long productOfCubes = 1;
        for (int factor : factorsArray) {
            sumOfFactors += factor;
            productOfFactors *= factor;
            productOfCubes *= Math.pow(factor, 3);
        }
        System.out.println("Factors array: ");
        for (int factor : factorsArray) {
            System.out.print(factor + " ");
        }
        System.out.println("\nGreatest Factor: " + greatestFactor);
        System.out.println("Sum of Factors: " + sumOfFactors);
        System.out.println("Product of Factors: " + productOfFactors);
    }
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
}