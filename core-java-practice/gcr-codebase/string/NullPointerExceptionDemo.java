package string;
import java.util.*;
public class NullPointerExceptionDemo {
    public static void main(String[] args) {
//        generateNullPointerException(); 
        handleNullPointerException();   
    }
    public static void generateNullPointerException() {
        String str = null;
        //throw NullPointerException
        System.out.println(str.length());
    }
    public static void handleNullPointerException() {
        String str = null;
        try {
            // throw NullPointerException
            System.out.println(str.length());
        }  catch (NullPointerException e) {
        System.out.println("Caught a NullPointerException");
        }
    }
}






















