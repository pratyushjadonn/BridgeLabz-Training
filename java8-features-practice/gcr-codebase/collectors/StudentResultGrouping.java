package collectors;

import java.util.*;
import java.util.stream.Collectors;

public class StudentResultGrouping {

	// Student class
	static class Student {
		private String name;
		private String grade;

		Student(String name, String grade) {
			this.name = name;
			this.grade = grade;
		}

		public String getName() {
			return name;
		}

		public String getGrade() {
			return grade;
		}
	}

	public static void main(String[] args) {

		// Creating student list
		List<Student> students = Arrays.asList(new Student("Ravi", "A"), new Student("Sneha", "A"),
				new Student("Amit", "B"), new Student("Neha", "B"), new Student("Karan", "C"));

		// Group students by grade and collect names
		Map<String, List<String>> studentsByGrade = students.stream().collect(
				Collectors.groupingBy(Student::getGrade, Collectors.mapping(Student::getName, Collectors.toList())));

		// Printing result
		studentsByGrade.forEach((grade, names) -> System.out.println("Grade " + grade + " : " + names));
	}
}
