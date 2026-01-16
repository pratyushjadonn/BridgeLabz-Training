
public class SelectionSortExamScores {
    public static void main(String[] args) {
        int[] scores = {67, 85, 42, 90, 76};
        for (int i = 0; i < scores.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[min]) min = j;
            }
            int temp = scores[min];
            scores[min] = scores[i];
            scores[i] = temp;
        }
        for (int s : scores) {
            System.out.print(s + " ");
        }
    }
}
