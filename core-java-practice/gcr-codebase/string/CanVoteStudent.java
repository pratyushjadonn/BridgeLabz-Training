package string;
import java.util.Scanner;
public class CanVoteStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10; // Number of students
        int[] ages = generateRandomAges(n);
        String[][] votingEligibility = checkVotingEligibility(ages);
        displayVotingEligibility(votingEligibility);
    }
    public static int[] generateRandomAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int)(Math.random() * 82);
        }
        return ages;
    }
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] eligibility = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            eligibility[i][0] = Integer.toString(ages[i]);
            if (ages[i] < 0) {
                eligibility[i][1] = "false"; // Negative age cannot vote
            } else if (ages[i] >= 18) {
                eligibility[i][1] = "true"; // Can vote
            } else {
                eligibility[i][1] = "false"; // Cannot vote
            }
        }
        return eligibility;
    }
    public static void displayVotingEligibility(String[][] eligibility) {
        System.out.printf("%s %s%n", "Age", "Can Vote");
        for (String[] entry : eligibility) {
            System.out.printf("%s %s%n", entry[0], entry[1]);
        }
    }
}