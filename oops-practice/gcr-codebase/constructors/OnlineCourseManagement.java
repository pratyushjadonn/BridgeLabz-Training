package level1;
public class OnlineCourseManagement {
    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", "3 months", 300.0);
        Course course2 = new Course("Web Development", "4 months", 400.0);
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        Course.updateInstituteName("Tech Academy");
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        
    }
}
class Course {
    private String courseName;
    private String duration;
    private double fee;
    private static String instituteName = "Global Institute";
    // Parameterized constructor
    public Course(String courseName, String duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.printf("Course Name: %s, Duration: %s, Fee: $%.2f, Institute: %s%n", 
                          courseName, duration, fee, instituteName);
    }
    // Class method to update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}

