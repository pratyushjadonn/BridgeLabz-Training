package scenario.based;
import java.util.Scanner;
class InvoiceUtil {

    public static String[] parse(String s) {
        return s.split(",");
    }

    public static int total(String[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            String part = arr[i].trim();
            String[] w = part.split(" ");
            for (int j = 0; j < w.length; j++) {
                try {
                    int x = Integer.parseInt(w[j]);
                    sum = sum + x;
                } catch (Exception e) {
                }
            }
        }
        return sum;
    }
}

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] arr = InvoiceUtil.parse(s);
        int t = InvoiceUtil.total(arr);

        System.out.println(t);

        sc.close();
    }
}