package methods;

import java.util.*;

public class NumberChecker2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int digitCount = countDigits(number);
        int[] digitsArray = storeDigitsInArray(number, digitCount);
        int sumOfDigits = calculateSumOfDigits(digitsArray);
        int sumOfSquares = calculateSumOfSquares(digitsArray);
        boolean isHarshad = isHarshadNumber(number, sumOfDigits);
        int[][] frequencyArray = findDigitFrequencies(digitsArray);
        System.out.println("Count of digits: " + digitCount);
        System.out.println("Digits array: " + Arrays.toString(digitsArray));
        System.out.println("Sum of digits: " + sumOfDigits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);
        System.out.println("Is Harshad Number: " + isHarshad);
        System.out.println("Digit Frequencies: ");
        for (int[] freq : frequencyArray) {
            System.out.println("Digit: " + freq[0] + ", Frequency: " + freq[1]);
        }   
    }
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
    public static int[] storeDigitsInArray(int number, int digitCount) {
        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
    public static int calculateSumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    public static int calculateSumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
    public static boolean isHarshadNumber(int number, int sumOfDigits) {
        return number % sumOfDigits == 0;
    }
    public static int[][] findDigitFrequencies(int[] digits) {
        int[][] frequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // digit
            frequency[i][1] = 0; // frequency
        }
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
    }
}