package scenario.based;
import java.util.Scanner;

class CafeUtil {

    public static void show(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " " + arr[i]);
        }
    }

    public static String get(String[] arr, int i) {
        if (i >= 0 && i < arr.length) {
            return arr[i];
        }
        return "Invalid Choice";
    }
}

public class CafeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] m = {
            "Tea", "Coffee", "Sandwich", "Burger", "Pizza",
            "Pasta", "Samosa", "Momos", "Juice", "Cake"
        };

        CafeUtil.show(m);

        int i = sc.nextInt();
        System.out.println(CafeUtil.get(m, i));
    }
}