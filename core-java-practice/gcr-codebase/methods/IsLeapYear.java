package methods;
import java.util.Scanner;
public class IsLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        boolean isLeap = checkLeapYear(year);
        if (isLeap) {
            System.out.println(year + " is a Leap Year.");
        } else {    
            System.out.println(year + " is not a Leap Year.");
        }
    }
    public static boolean checkLeapYear(int year) {
        if (year < 1582) {
            System.out.println("Year must be 1582 or later.");
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}