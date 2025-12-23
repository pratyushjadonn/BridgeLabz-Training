package string;
import java.util.Scanner;
public class Calender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        displayCalendar(month, year);
    }
    public static void displayCalendar(int month, int year) {
        String[] months = {
            "", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        int[] daysInMonth = {
            0, 31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };
        if (isLeapYear(year)) {
            daysInMonth[2] = 29;
        }
        int firstDay = getFirstDayOfMonth(month, year);
        System.out.println("     " + months[month] + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }
        for (int day = 1; day <= daysInMonth[month]; day++) {
            System.out.printf("%3d", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static int getFirstDayOfMonth(int month, int year) {
        if (month < 3) {
            month += 12;
            year--;
        }
        int k = year % 100;
        int j = year / 100;
        int firstDay = (1 + (13 * (month + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        return (firstDay + 5) % 7;
    }
}