package MultiLevelUniversityCourseManagementSystem;

class Course<T extends CourseType> {

	private String courseName;
	private String department;
	private T courseType;

	public Course(String courseName, String department, T courseType) {
		this.courseName = courseName;
		this.department = department;
		this.courseType = courseType;
	}

	public T getCourseType() {
		return courseType;
	}

	public String getDetails() {
		return "Course: " + courseName + ", Department: " + department + ", Type: " + courseType.getType()
				+ ", Evaluation: " + courseType.getEvaluationMethod();
	}
}
