
public class MaxInArray {
    public static void main(String[] args) {
        int[] a = {3, 7, 1, 9, 2};
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        System.out.println(max);
    }
}
