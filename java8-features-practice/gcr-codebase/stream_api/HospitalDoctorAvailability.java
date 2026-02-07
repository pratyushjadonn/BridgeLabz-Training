package stream_api;

import java.util.*;
import java.util.stream.Collectors;

class Doctor {
	private String name;
	private String speciality;
	private boolean isAvailableOnWeekend;

	public Doctor(String name, String speciality, boolean isAvailableOnWeekend) {
		this.name = name;
		this.isAvailableOnWeekend = isAvailableOnWeekend;
		this.speciality = speciality;
	}
	public String getName() {
		return name;
	}
	public boolean getAvailability() {
		return isAvailableOnWeekend;
	}

	public String getSpeciality() {
		return speciality;
	}
	public String toString(){
		return "Doctor : "+name+" ,speciality : "+speciality;
	}
}

public class HospitalDoctorAvailability {
	public static void main(String[] args) {
		List<Doctor> doctorList = Arrays.asList(new Doctor("Dr. Sharma", "Cardiology", true),
				new Doctor("Dr. Mehta", "Neurology", false), new Doctor("Dr. Singh", "Orthopedics", true),
				new Doctor("Dr. Rao", "Cardiology", true), new Doctor("Dr. Gupta", "Pediatrics", false));
		List<Doctor> updatedDoctorList=doctorList.stream().filter(doctor->doctor.getAvailability()).
				sorted(Comparator.comparing(doctor->doctor.getSpeciality())).collect(Collectors.toList());
		System.out.println("Doctors available on weekends : ");
		for(Doctor doctor:updatedDoctorList) {
			System.out.println(doctor);
		}
	}
}