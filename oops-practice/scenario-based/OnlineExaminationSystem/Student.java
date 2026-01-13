package OnlineExaminationSystem;

import java.util.ArrayList;

public class Student {
	private int studentId;
	private String name;
	private ArrayList<String> answers;

	public Student(int studentId, String name) {
		this.studentId = studentId;
		this.name = name;
		this.answers = new ArrayList<>();
	}

	// answers are stored in same order as questions
	public void submitAnswer(String answer) {
		answers.add(answer);
	}

	public ArrayList<String> getAnswers() {
		return answers;
	}

	public String getName() {
		return name;
	}
}
