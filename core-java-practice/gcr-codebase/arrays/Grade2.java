package arrays;
import java.util.Scanner;
public class Grade2 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of students: ");
            int n = sc.nextInt();
            int[][] marks = new int[n][3]; // 0: physics, 1
            double[] percentages = new double[n];
            String[] grades = new String[n];    
            for (int i = 0; i < n; i++) {
                int totalMarks = 0;
                for (int j = 0; j < 3; j++) {
                    int mark;
                    do {
                        System.out.print("Enter marks for student " + (i + 1) + " in subject " + (j + 1) + ": ");
                        mark = sc.nextInt();
                        if (mark < 0) {
                            System.out.println("Please enter a positive value for marks.");
                        }
                    } while (mark < 0);
                    marks[i][j] = mark;
                    totalMarks += mark;
                }
                percentages[i] = (totalMarks / 300.0) * 100;
                if (percentages[i] >= 80) {
                    grades[i] = "A";
                } else if (percentages[i] >= 70) {
                    grades[i] = "B";
                } else if (percentages[i] >= 60) {
                    grades[i] = "C";
                } else if (percentages[i] >= 50) {
                    grades[i] = "D";
                } else if (percentages[i] >= 40) {
                    grades[i] = "E";
                } else {
                    grades[i] = "R";
                }
            }
            System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
            for (int i = 0; i < n; i++) {
                System.out.printf("%d\t%d\t%d\t\t%d\t%.2f%%\t\t%s\n", (i + 1), marks[i][0], marks[i][1], marks[i][2],
                        percentages[i], grades[i]);
            }

    }
}
