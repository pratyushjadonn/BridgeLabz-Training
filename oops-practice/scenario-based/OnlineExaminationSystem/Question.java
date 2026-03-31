package OnlineExaminationSystem;

public class Question {
	// attributes
	private int id;
	private String text;
	private String correctAnswer;
	private int marks;

	// constructor
	public Question(int id, String text, String correctAnswer, int marks) {
		this.id = id;
		this.text = text;
		this.correctAnswer = correctAnswer;
		this.marks = marks;
	}

	// getter methods
	public int getId() {
		return id;
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}

	public int getMarks() {
		return marks;
	}

	public void displayQuestion() {
		System.out.println(id + ". " + text);
	}
}
