package ExamProctor;
import java.util.*;

public class ExamEvaluator {

    // Function to calculate score
    public static int calculateScore(
            List<Question> questions,
            HashMap<Integer, String> studentAnswers) {

        int score = 0;

        for (Question q : questions) {
            String submitted = studentAnswers.get(q.getId());

            if (submitted != null && submitted.equalsIgnoreCase(q.getCorrectAnswer())) {
                score++;
            }
        }
        return score;
    }
}
