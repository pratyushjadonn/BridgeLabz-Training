package Exceptions;

import java.util.Scanner;
import java.lang.ArithmeticException;
import java.util.InputMismatchException;

public class UncheckedException {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            int a=sc.nextInt();
            int b=sc.nextInt();

            double c=a/b;
            System.out.println("answer"+c);
            

        } catch (ArithmeticException e) {
            System.out.println("null exception");
        }catch (InputMismatchException e) {
            System.out.println("invalid input exception");
        }

    }
}

