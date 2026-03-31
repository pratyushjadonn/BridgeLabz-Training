package MultiLevelUniversityCourseManagementSystem;

import java.util.*;

public class UniversityManagementSystem {

	public static void main(String[] args) {

		Course<ExamCourse> math = new Course<>("Mathematics", "Science", new ExamCourse());

		Course<AssignmentCourse> cs = new Course<>("Data Structures", "Computer Science", new AssignmentCourse());

		Course<ResearchCourse> phd = new Course<>("AI Research", "Engineering", new ResearchCourse());

		System.out.println("Course Details:");
		System.out.println(math.getDetails());
		System.out.println(cs.getDetails());
		System.out.println(phd.getDetails());

		List<CourseType> evaluationList = new ArrayList<>();
		evaluationList.add(new ExamCourse());
		evaluationList.add(new AssignmentCourse());
		evaluationList.add(new ResearchCourse());

		System.out.println("\nEvaluation Types:");
		CourseUtils.displayCourses(evaluationList);
	}
}
