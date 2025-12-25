package methods;
import java.lang.reflect.Method;
import java.util.Scanner;

public class FindBonus {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int[][] empData = generateEmployeeData(10);
         double[][] updatedEmpData = calculateBonuses(empData);
         displaySalaryDetails(empData, updatedEmpData);
         System.out.println("Methods used in this class:");
         Method[] methods = FindBonus.class.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(method.getName());
            }
    }
    public static int[][] generateEmployeeData(int numEmployees) {
        int[][] empData = new int[numEmployees][2];
        for (int i = 0; i < numEmployees; i++) {
            empData[i][0] = (int) (Math.random() * 90000) + 10000; 
            empData[i][1] = (int) (Math.random() * 10) + 1; 
        }
        return empData;
    }
    public static double[][] calculateBonuses(int[][] empData) {
        double[][] updatedEmpData = new double[empData.length][3];
        for (int i = 0; i < empData.length; i++) {
            int salary = empData[i][0];
            int yearsOfService = empData[i][1];
            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02;
            double bonusAmount = salary * bonusPercentage;
            double newSalary = salary + bonusAmount;
            updatedEmpData[i][0] = salary;
            updatedEmpData[i][1] = bonusAmount;
            updatedEmpData[i][2] = newSalary;
        }
        return updatedEmpData;
    }
    public static void displaySalaryDetails(int[][] empData, double[][] updatedEmpData) {
        System.out.printf("%-15s %-15s %-15s %-15s%n", "Original Salary", "Bonus Amount", "New Salary", "Years of Service");
        for (int i = 0; i < empData.length; i++) {
            System.out.printf("%-15d %-15.2f %-15.2f %-15d%n", empData[i][0], updatedEmpData[i][1], updatedEmpData[i][2], empData[i][1]);
        }
    }
}