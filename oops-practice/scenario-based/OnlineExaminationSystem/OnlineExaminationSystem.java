package OnlineExaminationSystem;

import java.util.Scanner;

public class OnlineExaminationSystem {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Evaluation strategy
		EvaluationStrategy strategy = new ObjectiveEvaluation();

		// Exam creation
		Exam exam = new Exam("Java Online Exam", strategy);

		// Add questions (examiner side)
		exam.addQuestion(new Question(1, "Java is platform independent? (Yes/No)", "Yes", 5));
		exam.addQuestion(new Question(2, "OOP stands for?", "Object Oriented Programming", 5));

		// Student input
		System.out.print("Enter Student ID: ");
		int id = sc.nextInt();
		sc.nextLine(); // consume newline

		System.out.print("Enter Student Name: ");
		String name = sc.nextLine();

		Student student = new Student(id, name);

		System.out.println("\n--- Start Exam ---");

		// Taking answers from user
		System.out.print("Answer 1: ");
		student.submitAnswer(sc.nextLine());

		System.out.print("Answer 2: ");
		student.submitAnswer(sc.nextLine());

		// Result generation
		try {
			int score = exam.generateResult(student);
			System.out.println("\n" + student.getName() + " scored: " + score);
		} catch (ExamTimeExpiredException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}
}
