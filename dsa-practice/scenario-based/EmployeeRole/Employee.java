package EmployeeRole;

public abstract class Employee {

	private final String name;
	private final double salary;

	protected Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	protected double getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	// Polymorphic method
	public abstract double getBonus();
}
