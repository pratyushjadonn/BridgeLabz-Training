package methods;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("\nStudent " + i);
            System.out.print("Enter Physics marks: ");
            int p = sc.nextInt();
            System.out.print("Enter Chemistry marks: ");
            int c = sc.nextInt();
            System.out.print("Enter Maths marks: ");
            int m = sc.nextInt();
            int total = p + c + m;
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            char grade = calculateGrade(percentage);
            System.out.println("Total: " + total);
            System.out.println("Average: " + average);
            System.out.println("Percentage: " + percentage);
            System.out.println("Grade: " + grade);
        }
    }
    public static char calculateGrade(double percentage) {
        if (percentage >= 80)
            return 'A';
        else if (percentage >= 70)
            return 'B';
        else if (percentage >= 60)
            return 'C';
        else if (percentage >= 50)
            return 'D';
        else if (percentage >= 40)
            return 'E';
        else
            return 'R';
    }
}