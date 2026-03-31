package ExamProctor;

import java.util.*;

public class ExamSession {

	private Stack<Integer> navigationStack; // Track last visited question
	private HashMap<Integer, String> answers; // questionId → answer

	public ExamSession() {
		navigationStack = new Stack<>();
		answers = new HashMap<>();
	}

	// Navigate to question
	public void visitQuestion(int questionId) {
		navigationStack.push(questionId);
		System.out.println("Visited Question: " + questionId);
	}

	// Save / Update answer
	public void submitAnswer(int questionId, String answer) {
		answers.put(questionId, answer);
		System.out.println("Answer saved for Question " + questionId);
	}

	// Go back to previous question
	public Integer goBack() {
		if (navigationStack.isEmpty()) {
			System.out.println("No previous question");
			return null;
		}
		return navigationStack.pop();
	}

	public HashMap<Integer, String> getAnswers() {
		return answers;
	}
}
