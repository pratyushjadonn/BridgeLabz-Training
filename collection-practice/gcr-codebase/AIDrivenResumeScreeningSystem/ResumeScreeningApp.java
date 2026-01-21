package AIDrivenResumeScreeningSystem;

import java.util.*;

public class ResumeScreeningApp {

	public static void main(String[] args) {
		System.out.println("Welcome to AI-Driven Resume Screening System");
		System.out.println("------------------------------------------------");
		Resume<SoftwareEngineer> r1 = new Resume<>("Amit", 3, 78, new SoftwareEngineer());

		Resume<DataScientist> r2 = new Resume<>("Sneha", 2, 80, new DataScientist());

		Resume<ProductManager> r3 = new Resume<>("Rohit", 6, 85, new ProductManager());

		ResumeScreeningService.screenResume(r1);
		ResumeScreeningService.screenResume(r2);
		ResumeScreeningService.screenResume(r3);

		List<JobRole> roles = new ArrayList<>();
		roles.add(new SoftwareEngineer());
		roles.add(new DataScientist());
		roles.add(new ProductManager());

		ScreeningPipeline.processAll(roles);
	}
}
