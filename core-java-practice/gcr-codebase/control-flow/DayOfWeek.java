package control.flow.statement;
import java.util.Scanner;
public class DayOfWeek {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month:");
        int month= sc.nextInt();
        System.out.println("Enter tha day:");
        int day= sc.nextInt();
        System.out.println("Enter the year:");
        int year= sc.nextInt();
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31 * m0) / 12) % 7;
        System.out.print("day is: "+d0);
	}
}
