package methods;
import java.util.Scanner;
public class NumberChecker5 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            boolean isPerfect = isPerfectNumber(number);
            boolean isAbundant = isAbundantNumber(number);
            boolean isDeficient = isDeficientNumber(number);
            boolean isStrong = isStrongNumber(number);
            System.out.println("Is Perfect Number: " + isPerfect);
            System.out.println("Is Abundant Number: " + isAbundant);
            System.out.println("Is Deficient Number: " + isDeficient);
            System.out.println("Is Strong Number: " + isStrong);
    }
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
    public static boolean isAbundantNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum > number;
    }
    public static boolean isDeficientNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum < number;
    }
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}