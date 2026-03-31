package AIDrivenResumeScreeningSystem;

class DataScientist extends JobRole {

	public DataScientist() {
		super("Data Scientist");
	}

	@Override
	public boolean isEligible(int experience, int score) {
		return experience >= 3 && score >= 75;
	}
}
