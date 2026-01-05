package scenario.based;
import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (true) {
            try {
                n = sc.nextInt();
                if (n > 0) break;
            } catch (Exception e) {
                sc.next();
            }
        }
        int[] scores = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    int value = sc.nextInt();
                    if (value >= 0) {
                        scores[i] = value;
                        sum += value;
                        break;
                    }
                } catch (Exception e) {
                    sc.next();
                }
            }
        }
        double avg = (double) sum / n;
        int max = scores[0];
        int min = scores[0];
        for (int i = 1; i < n; i++) {
            if (scores[i] > max) max = scores[i];
            if (scores[i] < min) min = scores[i];
        }
        System.out.println("Average: " + avg);
        System.out.println("Highest: " + max);
        System.out.println("Lowest: " + min);
        System.out.println("Above Average Scores:");
        for (int i = 0; i < n; i++) {
            if (scores[i] > avg) {
                System.out.println(scores[i]);
            }
        }
        
    }
}