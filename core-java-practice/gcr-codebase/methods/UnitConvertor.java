package methods;
import java.util.Scanner;
public class UnitConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();
        double miles = convertKmToMiles(km);
        System.out.println(km + " kilometers is equal to " + miles + " miles.");

        System.out.print("Enter distance in miles: ");
        double milesInput = sc.nextDouble();
        double kmConverted = convertMilesToKm(milesInput);
        System.out.println(milesInput + " miles is equal to " + kmConverted + " kilometers.");

        System.out.print("Enter distance in meters: ");
        double meters = sc.nextDouble();
        double feet = convertMetersToFeet(meters);
        System.out.println(meters + " meters is equal to " + feet + " feet.");

        System.out.print("Enter distance in feet: ");
        double feetInput = sc.nextDouble();
        double metersConverted = convertFeetToMeters(feetInput);
        System.out.println(feetInput + " feet is equal to " + metersConverted + " meters.");
    }
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }
    public static double convertMilesToKm(double miles) {
        return miles / 0.621371;
    }
    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }
    public static double convertFeetToMeters(double feet) {
        return feet / 3.28084;
    }
}