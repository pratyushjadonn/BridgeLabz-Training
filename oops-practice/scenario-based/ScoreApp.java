package scenario.based;
import java.util.Scanner;

class InvalidScoreException extends Exception {
    public InvalidScoreException(String m) {
        super(m);
    }
}

class ScoreUtil {

    public static double avg(int[] a) {
        int s = 0;
        for (int i = 0; i < a.length; i++) s = s + a[i];
        return (double) s / a.length;
    }

    public static int max(int[] a) {
        int m = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > m) m = a[i];
        return m;
    }

    public static int min(int[] a) {
        int m = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] < m) m = a[i];
        return m;
    }
    public static void check(int[] a) throws InvalidScoreException {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0 || a[i] > 100) {
                throw new InvalidScoreException("Invalid score: " + a[i]);
            }
        }
    }
}
public class ScoreApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        try {
            ScoreUtil.check(a);
            System.out.println(ScoreUtil.avg(a));
            System.out.println(ScoreUtil.max(a));
            System.out.println(ScoreUtil.min(a));
        } catch (InvalidScoreException e) {
            System.out.println(e.getMessage());
        }
        }
}