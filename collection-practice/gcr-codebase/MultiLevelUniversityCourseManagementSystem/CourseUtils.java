package MultiLevelUniversityCourseManagementSystem;

import java.util.List;

class CourseUtils {

	public static void displayCourses(List<? extends CourseType> courses) {
		for (CourseType course : courses) {
			System.out.println("--------------------------------------------------------------------");
			System.out.println(course.getType() + " | Evaluation: " + course.getEvaluationMethod());
		}
	}
}
