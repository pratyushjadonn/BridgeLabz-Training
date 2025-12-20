package arrays;
import java.util.Scanner;
public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + " in meters: ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }
        double meanHeight = sum / heights.length;
        System.out.printf("The mean height of the football team is: %.2f meters\n", meanHeight);
    }
}
