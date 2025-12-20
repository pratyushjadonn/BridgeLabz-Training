package arrays;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] Table = new int[10];
        for (int i = 0; i < 10; i++) {
            Table[i] = number * (i + 1);
        }
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 0; i < Table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + Table[i]);
        }
    }
}
