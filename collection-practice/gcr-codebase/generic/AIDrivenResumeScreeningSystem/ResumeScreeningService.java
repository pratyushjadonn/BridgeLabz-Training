package AIDrivenResumeScreeningSystem;

class ResumeScreeningService {

	public static <T extends JobRole> void screenResume(Resume<T> resume) {

		System.out.println(resume.getDetails());

		if (resume.screen()) {
			System.out.println("Status: Shortlisted\n");
		} else {
			System.out.println("Status: Rejected\n");
		}
	}
}
