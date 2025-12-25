package methods;
import java.util.Scanner;
public class EuclideanDistance {
    public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
                System.out.print("Enter x1: ");
                int x1 = sc.nextInt();
                System.out.print("Enter y1: ");
                int y1 = sc.nextInt();
                System.out.print("Enter x2: ");
                int x2 = sc.nextInt();
                System.out.print("Enter y2: ");
                int y2 = sc.nextInt();
                double distance = calculateEuclideanDistance(x1, y1, x2, y2);
                double[] lineEquation = findLineEquation(x1, y1, x2, y2);
                System.out.println("Euclidean Distance: " + distance);
                System.out.println("Line Equation: y = " + lineEquation[0] + "x + " + lineEquation[1]);
    }
    public static double calculateEuclideanDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static double[] findLineEquation(int x1, int y1, int x2, int y2) {
        double m = (double) (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }
}