package keywords;
public class Student {
    // Static variable for university name
    private static String universityName = "Global University";
    // Static variable to count total students
    private static int totalStudents = 0;
    // Final variable for roll number
    private final int rollNumber;
    // Instance variables
    private String name;
    private String grade;
    // Constructor using 'this'
    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }
    // Static method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
    // Method to display student details using instanceof
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University Name: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid Student Object");
        }
    }
    // Method to update grade using instanceof
    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated to: " + newGrade);
        } else {
            System.out.println("Invalid Student Object");
        }
    }
    // Main method
    public static void main(String[] args) {
        // Display total students
        Student.displayTotalStudents();
        // Create student instances
        Student student1 = new Student(101, "Hemashree", "A");
        Student student2 = new Student(102, "Sharmila", "B");
        // Display student details
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        // Update grade for student2
        student2.updateGrade("A");
        // Display updated student2 details
        student2.displayStudentDetails();
    }
}