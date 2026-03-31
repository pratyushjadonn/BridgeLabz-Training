package OnlineExaminationSystem;

import java.util.ArrayList;

public class ObjectiveEvaluation implements EvaluationStrategy {

	@Override
	public int evaluate(ArrayList<Question> questions, ArrayList<String> answers) {

		int score = 0;

		for (int i = 0; i < questions.size(); i++) {
			if (questions.get(i).getCorrectAnswer().equalsIgnoreCase(answers.get(i))) {
				score += questions.get(i).getMarks();
			}
		}
		return score;
	}
}
