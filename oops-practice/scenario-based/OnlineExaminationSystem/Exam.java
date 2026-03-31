package OnlineExaminationSystem;

import java.util.ArrayList;

public class Exam {
	private String examName;
	private ArrayList<Question> questions;
	private EvaluationStrategy evaluationStrategy;

	public Exam(String examName, EvaluationStrategy strategy) {
		this.examName = examName;
		this.evaluationStrategy = strategy;
		this.questions = new ArrayList<>();
	}

	// CREATE
	public void addQuestion(Question q) {
		questions.add(q);
	}

	// READ
	public void displayExam() {
		System.out.println("Exam: " + examName);
		for (Question q : questions) {
			q.displayQuestion();
		}
	}

	// RESULT
	public int generateResult(Student student) throws ExamTimeExpiredException {

		if (student.getAnswers().isEmpty()) {
			throw new ExamTimeExpiredException("Exam time expired. No answers submitted.");
		}

		return evaluationStrategy.evaluate(questions, student.getAnswers());
	}
}
