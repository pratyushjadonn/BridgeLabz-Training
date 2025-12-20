package control.flow.statement;

import java.util.Scanner;

public class ComputePercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Physics marks:");
        int p = sc.nextInt();
        System.out.println("Enter the Chemistry marks:");
        int c = sc.nextInt();
        System.out.println("Enter the math marks:");
        int m = sc.nextInt();
        double avg = (p + c + m) / 3.0;      //calculate average
        String g;
        String r;
        if (avg >= 80) {
            g = "A";
            r = "Level 4, above agency-normalized standards";
        } else if (avg >= 70) {
            g = "B";
            r = "Level 3, at agency-normalized standards";
        } else if (avg >= 60) {
            g = "C";
            r = "Level 2, below but approaching agency-normalized standards";
        } else if (avg >= 50) {
            g = "D";
            r = "Level 1, well below agency-normalized standards";
        } else if (avg >= 40) {
            g = "E";
            r = "Level 1, too below agency-normalized standards";
        } else {
            g = "R";
            r = "Remedial standards";
        }
        System.out.println("Average: "+avg);
        System.out.println("Grade: "+g);
        System.out.println("Remarks: "+r);

	}

}
