package OnlineExaminationSystem;

import java.util.ArrayList;

public interface EvaluationStrategy {
	int evaluate(ArrayList<Question> questions, ArrayList<String> answers);
}