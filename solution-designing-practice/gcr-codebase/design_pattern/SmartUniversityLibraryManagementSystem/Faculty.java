package SmartUniversityLibraryManagementSystem;

class Faculty extends User {
	public Faculty(String name) {
		super(name);
	}

	@Override
	public void showRole() {
		System.out.println(name + " → Faculty (max 30 days borrow)");
	}
}