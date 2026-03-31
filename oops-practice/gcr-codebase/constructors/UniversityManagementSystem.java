package level1;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Alice", 3.8);
        student1.displayStudentInfo();
        // Modify CGPA
        student1.setCGPA(3.9);
        System.out.println("Updated CGPA: " + student1.getCGPA());
        // Create a PostgraduateStudent
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob", 3.7, "Computer Science");
        pgStudent.displayPostgraduateInfo();
    }
}
class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;
    // Parameterized constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    // Public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }
    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
    public void displayStudentInfo() {
        System.out.printf("Roll Number: %d, Name: %s, CGPA: %.2f%n", rollNumber, name, CGPA);
    }
}
class PostgraduateStudent extends Student {
    private String specialization;
    // Parameterized constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }
    public void displayPostgraduateInfo() {
        displayStudentInfo();
        System.out.printf("Specialization: %s%n", specialization);
    }
}

