package keywords;
public class Employee {
    private static int totalEmployees = 0;
    // Final variable for employee ID
    private final int id;
    // Instance variables
    private String name;
    private String designation;
    // Constructor using 'this'
    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;   

    }
    // Static method to display total employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    // Method to display employee details using instanceof
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Invalid Employee Object");
        }
    }
    // Main method
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Thamarai", "Software Engineer");
        Employee emp2 = new Employee(102, "Rohan", "Project Manager");
        // Display total employees
        Employee.displayTotalEmployees();
        // Display employee details
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
    }
    // Static variable for company name
    private static String companyName = "Tech Solutions Ltd.";
}