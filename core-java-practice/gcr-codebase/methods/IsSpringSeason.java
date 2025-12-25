package methods;
import java.util.Scanner;
public class IsSpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = sc.nextInt();
        boolean isSpring = checkSpringSeason(month, day);
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
    public static boolean checkSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20)) {
            return true;
        } else {
            return false;
        }
    }
}