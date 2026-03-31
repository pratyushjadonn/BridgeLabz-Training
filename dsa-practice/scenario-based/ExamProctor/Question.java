package ExamProctor;
public class Question {
    private int id;
    private String correctAnswer;

    public Question(int id, String correctAnswer) {
        this.id = id;
        this.correctAnswer = correctAnswer;
    }

    public int getId() {
        return id;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
