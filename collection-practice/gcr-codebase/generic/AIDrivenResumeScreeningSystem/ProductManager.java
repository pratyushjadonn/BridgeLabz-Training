package AIDrivenResumeScreeningSystem;

class ProductManager extends JobRole {

	public ProductManager() {
		super("Product Manager");
	}

	@Override
	public boolean isEligible(int experience, int score) {
		return experience >= 5 && score >= 80;
	}
}
