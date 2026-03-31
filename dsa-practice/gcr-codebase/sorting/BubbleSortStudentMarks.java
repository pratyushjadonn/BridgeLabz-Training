
public class BubbleSortStudentMarks {
    public static void main(String[] args) {
        int[] marks = {78, 45, 90, 62, 88};
        for (int i = 0; i < marks.length - 1; i++) {
            for (int j = 0; j < marks.length - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }
        for (int m : marks) {
            System.out.print(m + " ");
        }
    }
}
