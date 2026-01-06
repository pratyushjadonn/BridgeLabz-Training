
public class SumOfArray {

    static int sum(int[] a) {
        int s = 0;
        for (int x : a)
            s += x;
        return s;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        System.out.println(sum(a));
    }
}
