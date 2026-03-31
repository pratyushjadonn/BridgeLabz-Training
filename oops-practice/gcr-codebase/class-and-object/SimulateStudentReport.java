package ClassAndObject;
public class SimulateStudentReport {
    public static void main(String[] args) {
        Student student1 = new Student("Thamarai", "ECE001", new double[]{80.0, 70.0, 75.0});
        Student student2 = new Student("Kannan", "CSC002", new double[]{60.0, 65.0, 50.0}); 
        student1.displayDetails();
        System.out.println("----------------------------");
        student2.displayDetails();
    }
}
class Student {
    private String name;
    private String rollNumber;
    private double[] marks;
    public Student(String name, String rollNumber, double[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public String calculateGrade() {
        double totalMarks = 0;
        for (double mark : marks) {
            totalMarks += mark;
        }
        double averageMarks = totalMarks / marks.length;
        if (averageMarks >= 75) {
            return "A";
        } else if (averageMarks >= 60) {
            return "B";
        } else if (averageMarks >= 50) {
            return "C";
        } else {
            return "D";
        }
    }
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student RollNumber: " + rollNumber);
        System.out.println("Student Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Mark" + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Grade " + calculateGrade());
    }
}
