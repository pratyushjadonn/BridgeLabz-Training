
public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";
        char[] a = s.toCharArray();
        int i = 0, j = a.length - 1;

        while (i < j) {
            char t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }
        System.out.println(new String(a));
    }
}
