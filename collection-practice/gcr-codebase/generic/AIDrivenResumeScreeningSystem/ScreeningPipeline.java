package AIDrivenResumeScreeningSystem;

import java.util.List;

class ScreeningPipeline {

	public static void processAll(List<? extends JobRole> roles) {
		System.out.println("Screening Pipeline Active for Roles:");
		for (JobRole role : roles) {
			System.out.println("- " + role.getRoleName());
		}
	}
}
