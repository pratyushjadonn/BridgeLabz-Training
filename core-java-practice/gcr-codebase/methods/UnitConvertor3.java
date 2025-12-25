package methods;
import java.util.Scanner;
public class UnitConvertor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius.");  
        System.out.print("Enter temperature in Celsius: ");
        double celsiusInput = sc.nextDouble();
        double fahrenheitConverted = convertCelsiusToFahrenheit(celsiusInput);
        System.out.println(celsiusInput + " Celsius is equal to " + fahrenheitConverted + " Fahrenheit.");
        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();
        double kilograms = convertPoundsToKilograms(pounds);
        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.");
        System.out.print("Enter weight in kilograms: ");
        double kilogramsInput = sc.nextDouble();
        double poundsConverted = convertKilogramsToPounds(kilogramsInput);
        System.out.println(kilogramsInput + " kilograms is equal to " + poundsConverted + " pounds.");
        System.out.print("Enter volume in gallons: ");
        double gallons = sc.nextDouble();
        double liters = convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons is equal to " + liters + " liters.");
        System.out.print("Enter volume in liters: ");
        double litersInput = sc.nextDouble();
        double gallonsConverted = convertLitersToGallons(litersInput);
        System.out.println(litersInput + " liters is equal to " + gallonsConverted + " gallons.");
    }
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }
}