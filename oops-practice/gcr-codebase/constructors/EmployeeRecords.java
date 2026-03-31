package level1;

public class EmployeeRecords {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1001, "IT", 75000.0);
        emp1.displayEmployeeInfo();
        // Modify salary
        emp1.setSalary(80000.0);
        System.out.println("Updated Salary: " + emp1.getSalary());
        // Create a Manager
        Manager mgr = new Manager(2002, "HR", 90000.0, "Team Lead");
        mgr.displayManagerInfo();
    }
}
class Employee {
    public int employeeID;
    protected String department;
    private double salary;
    // Parameterized constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    // Public method to access salary
    public double getSalary() {
        return salary;
    }
    // Public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void displayEmployeeInfo() {
        System.out.printf("Employee ID: %d, Department: %s, Salary: $%.2f%n", 
                          employeeID, department, salary);
    }
}
class Manager extends Employee {
    private String teamName;
    // Parameterized constructor
    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }
    public void displayManagerInfo() {
        displayEmployeeInfo();
        System.out.printf("Team Name: %s%n", teamName);
    }
}
