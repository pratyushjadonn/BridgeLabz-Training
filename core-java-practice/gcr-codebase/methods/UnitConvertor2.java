package methods;
import java.util.Scanner;
public class UnitConvertor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in yards: ");
        double yards = sc.nextDouble();
        double feet = convertYardsToFeet(yards);
        System.out.println(yards + " yards is equal to " + feet + " feet.");
        System.out.print("Enter distance in feet: ");
        double feetInput = sc.nextDouble();
        double yardsConverted = convertFeetToYards(feetInput);
        System.out.println(feetInput + " feet is equal to " + yardsConverted + " yards.");
        System.out.print("Enter distance in meters: ");
        double meters = sc.nextDouble();
        double inches = convertMetersToInches(meters);
        System.out.println(meters + " meters is equal to " + inches + " inches.");
        System.out.print("Enter distance in inches: ");
        double inchesInput = sc.nextDouble();
        double metersConverted = convertInchesToMeters(inchesInput);
        System.out.println(inchesInput + " inches is equal to " + metersConverted + " meters.");
        System.out.print("Enter distance in inches: ");
        double inchesForCm = sc.nextDouble();
        double centimeters = convertInchesToCentimeters(inchesForCm);
        System.out.println(inchesForCm + " inches is equal to " + centimeters + " centimeters.");
    }
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }
    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }
    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }
    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }
    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }
}