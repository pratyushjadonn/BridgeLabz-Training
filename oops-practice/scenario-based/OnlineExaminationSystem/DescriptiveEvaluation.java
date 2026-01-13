package OnlineExaminationSystem;

import java.util.ArrayList;

public class DescriptiveEvaluation implements EvaluationStrategy {

	@Override
	public int evaluate(ArrayList<Question> questions, ArrayList<String> answers) {
		// Fixed marks logic (demo purpose)
		return questions.size() * 5;
	}
}
