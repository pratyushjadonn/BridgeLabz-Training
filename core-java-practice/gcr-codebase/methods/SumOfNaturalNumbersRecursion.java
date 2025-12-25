package methods;
import java.util.Scanner;
public class SumOfNaturalNumbersRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a natural number greater than zero.");
            return;
        }
        int sumRecursion = sumNaturalNumbersRecursion(n);
        int sumFormula = sumNaturalNumbersFormula(n);
        System.out.println("Sum using recursion: " + sumRecursion);
        System.out.println("Sum using formula: " + sumFormula);
        if (sumRecursion == sumFormula) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("The results differ.");
        }

    }
    public static int sumNaturalNumbersRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumNaturalNumbersRecursion(n - 1);
    }
    public static int sumNaturalNumbersFormula(int n) {
        return n * (n + 1) / 2;
    }

}