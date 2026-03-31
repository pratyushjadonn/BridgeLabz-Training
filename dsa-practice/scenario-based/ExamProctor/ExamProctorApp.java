package ExamProctor;

import java.util.*;

public class ExamProctorApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Predefined questions
		List<Question> questions = new ArrayList<>();
		questions.add(new Question(1, "A"));
		questions.add(new Question(2, "B"));
		questions.add(new Question(3, "C"));

		ExamSession session = new ExamSession();

		while (true) {
			System.out.println("\n===== Exam Proctor Menu =====");
			System.out.println("1. Visit Question");
			System.out.println("2. Submit Answer");
			System.out.println("3. Go Back");
			System.out.println("4. Submit Exam");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");

			int choice = sc.nextInt();
			sc.nextLine(); // consume newline

			switch (choice) {

			case 1:
				System.out.print("Enter Question ID: ");
				int qid = sc.nextInt();
				session.visitQuestion(qid);
				break;

			case 2:
				System.out.print("Enter Question ID: ");
				qid = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter Answer: ");
				String ans = sc.nextLine();
				session.submitAnswer(qid, ans);
				break;

			case 3:
				session.goBack();
				break;

			case 4:
				int score = ExamEvaluator.calculateScore(questions, session.getAnswers());
				System.out.println("Final Score: " + score + "/" + questions.size());
				sc.close();
				return;

			case 5:
				System.out.println("Exam exited.");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}
