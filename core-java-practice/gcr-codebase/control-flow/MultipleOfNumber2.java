package control.flow.statement;

import java.util.Scanner;

public class MultipleOfNumber2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int number = sc.nextInt();
        if (number > 0 && number < 100) {  
           int i = 100;
           while (i >= 1) {
               if (i % number == 0) {
                   System.out.println(i);
               }
               i--;
           }
        } else {
           System.out.println("Please enter a positive integer less than 100.");
        }

    }
}
