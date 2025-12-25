package methods;
import java.util.*;
public class NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int digitCount = countDigits(number);
        int[] digitsArray = storeDigitsInArray(number, digitCount);
        boolean isDuck = isDuckNumber(digitsArray);
        boolean isArmstrong = isArmstrongNumber(digitsArray, digitCount);
        int[] largestElements = findLargestAndSecondLargest(digitsArray);
        int[] smallestElements = findSmallestAndSecondSmallest(digitsArray);
        System.out.println("Count of digits: " + digitCount);
        System.out.println("Digits array: " + Arrays.toString(digitsArray));
        System.out.println("Is Duck Number: " + isDuck);
        System.out.println("Is Armstrong Number: " + isArmstrong);
        System.out.println("Largest and Second Largest: " + Arrays.toString(largestElements));
        System.out.println("Smallest and Second Smallest: " + Arrays.toString(smallestElements));
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
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }
    public static boolean isArmstrongNumber(int[] digits, int digitCount) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, digitCount);
        }
        int originalNumber = 0;
        for (int digit : digits) {
            originalNumber = originalNumber * 10 + digit;
        }
        return sum == originalNumber;
    }
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }
}