package collectors;

import java.util.*;
import java.util.stream.*;

public class EmployeeSalaryAverage {

	static class Employee {
		private String department;
		private double salary;

		Employee(String department, double salary) {
			this.department = department;
			this.salary = salary;
		}

		public String getDepartment() {
			return department;
		}

		public double getSalary() {
			return salary;
		}
	}

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee("IT", 60000), new Employee("IT", 70000),
				new Employee("HR", 40000), new Employee("HR", 45000));

		Map<String, Double> avgSalaryByDept = employees.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

		avgSalaryByDept.forEach((dept, avgSalary) -> System.out.println(dept + " : " + avgSalary));
	}
}
