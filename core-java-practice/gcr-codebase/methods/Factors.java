package methods;
import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factors: ");
        int number = sc.nextInt();
        int[] factors = findFactors(number);
        System.out.print("Factors of " + number + " are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        int sum = calculateSum(factors);
        int product = calculateProduct(factors);
        int sumOfSquares = calculateSumOfSquares(factors);
        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);

    }
    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    public static int calculateSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    public static int calculateProduct(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    public static int calculateSumOfSquares(int[] factors) {
        int sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += factor * factor;
        }
        return sumOfSquares;
    }
}