package methods;

import java.util.Scanner;
public class Collinear {
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
            System.out.print("Enter x3: ");
            int x3 = sc.nextInt();
            System.out.print("Enter y3: ");
            int y3 = sc.nextInt();
            boolean collinearBySlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
            boolean collinearByArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);
            System.out.println("Are the points collinear (by slope)? " + collinearBySlope);
            System.out.println("Are the points collinear (by area)? " + collinearByArea);  
    }
    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        int slopeAB_num = y2 - y1;
        int slopeAB_den = x2 - x1;
        int slopeBC_num = y3 - y2;
        int slopeBC_den = x3 - x2;
        return slopeAB_num * slopeBC_den == slopeBC_num * slopeAB_den;
    }
    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }
}