package methods;

import java.util.Scanner;

public class IsPositiveOrNegative {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        for (int num : numbers) {
            if (isPositive(num)) {
                System.out.print(num + " is positive and ");
                if (isEven(num)) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else {
                System.out.println(num + " is negative.");
            }
        }
        int comparisonResult = compare(numbers[0], numbers[4]);
        if (comparisonResult == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult == -1) {
            System.out.println("The first number is less than the last number.");
        } else {
            System.out.println("The first and last numbers are equal.");
        }
     }
        public static boolean isPositive(int num) {
            return num >= 0;
        }
        public static boolean isEven(int num) {
            return num % 2 == 0;
        }
        public static int compare(int a, int b) {
            if (a > b) {
                return 1;
            } else if (a < b) {
                return -1;
            } else {
                return 0;
            }
        }
}