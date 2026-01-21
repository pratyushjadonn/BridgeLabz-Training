package MultiLevelUniversityCourseManagementSystem;

abstract class CourseType {

	private String evaluationMethod;

	public CourseType(String evaluationMethod) {
		this.evaluationMethod = evaluationMethod;
	}

	public String getEvaluationMethod() {
		return evaluationMethod;
	}

	public abstract String getType();
}
