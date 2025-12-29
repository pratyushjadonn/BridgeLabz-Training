package extras;
import java.util.Scanner;
public class FibonacciSequenceGenerator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci sequence: ");
        int terms=sc.nextInt();
        generateFibonacci(terms);
    }
    public static void generateFibonacci(int terms) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
