package methods;

import java.util.*;

public class NumberChecker3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int digitCount = countDigits(number);
        int[] digitsArray = storeDigitsInArray(number, digitCount);
        int[] reversedArray = reverseArray(digitsArray);
        boolean isPalindrome = compareArrays(digitsArray, reversedArray);
        boolean isDuck = isDuckNumber(digitsArray);
        System.out.println("Count of digits: " + digitCount);
        System.out.println("Digits array: " + Arrays.toString(digitsArray));
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
        System.out.println("Is Palindrome: " + isPalindrome);
        System.out.println("Is Duck Number: " + isDuck);
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
    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }
    public static boolean compareArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }
}