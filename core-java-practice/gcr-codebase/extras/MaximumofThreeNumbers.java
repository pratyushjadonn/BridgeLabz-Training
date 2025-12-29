package extras;
import java.util.Scanner;
public class MaximumofThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = takeInput(scanner);
        int maxNumber = findMaximum(numbers);
        System.out.println("The maximum of the three numbers is: " + maxNumber);
    }
    public static int[] takeInput(Scanner scanner) {
        int[] numbers = new int[3];
        System.out.println("Enter three integers:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }
    public static int findMaximum(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}
