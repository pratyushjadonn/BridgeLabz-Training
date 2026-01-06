
public class CountCharacter {
    public static void main(String[] args) {
        String s = "banana";
        char ch = 'a';
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch)
                cnt++;
        }
        System.out.println(cnt);
    }
}
