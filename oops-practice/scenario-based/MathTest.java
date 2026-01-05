package scenario.based;
import java.util.Scanner;

class MathUtil {
    public static long fact(int n) {
        if (n < 0) return -1;
        long r = 1;
        for (int i = 1; i <= n; i++) r = r * i;
        return r;
    }

    public static boolean prime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) return false;
        return true;
    }

    public static int gcd(int a, int b) {
        if (a < 0) a = -a;
        if (b < 0) b = -b;
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static int fib(int n) {
        if (n < 0) return -1;
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
public class MathTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(MathUtil.fact(n));
        n = sc.nextInt();
        System.out.println(MathUtil.prime(n));
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(MathUtil.gcd(a, b));
        n = sc.nextInt();
        System.out.println(MathUtil.fib(n));
    }
}