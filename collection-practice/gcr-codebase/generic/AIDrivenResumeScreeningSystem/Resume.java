package AIDrivenResumeScreeningSystem;

class Resume<T extends JobRole> {

	private String candidateName;
	private int experience;
	private int aiScore;
	private T jobRole;

	public Resume(String candidateName, int experience, int aiScore, T jobRole) {
		this.candidateName = candidateName;
		this.experience = experience;
		this.aiScore = aiScore;
		this.jobRole = jobRole;
	}

	public T getJobRole() {
		return jobRole;
	}

	public boolean screen() {
		return jobRole.isEligible(experience, aiScore);
	}

	public String getDetails() {
		return "Candidate: " + candidateName + ", Role: " + jobRole.getRoleName() + ", Experience: " + experience
				+ ", AI Score: " + aiScore;
	}
}
