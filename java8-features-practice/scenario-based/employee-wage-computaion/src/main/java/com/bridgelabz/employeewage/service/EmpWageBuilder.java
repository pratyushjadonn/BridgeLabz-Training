package com.bridgelabz.employeewage.service;

import com.bridgelabz.employeewage.model.CompanyEmpWage;
import com.bridgelabz.employeewage.repository.CompanyEmpWageRepository;
import com.bridgelabz.employeewage.repository.ICompanyEmpWageRepository;

import java.util.Random;

public class EmpWageBuilder implements IEmpWageBuilder {

	private static final int FULL_TIME = 1;
	private static final int PART_TIME = 2;

	private static final int FULL_TIME_HOURS = 8;
	private static final int PART_TIME_HOURS = 4;

	private ICompanyEmpWageRepository repository;
	public EmpWageBuilder() {
		repository = new CompanyEmpWageRepository();
	}

	@Override
	public void addCompany(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {

		CompanyEmpWage company = new CompanyEmpWage(companyName, wagePerHour, maxWorkingDays, maxWorkingHours);

		repository.save(company);
	}

	@Override
	public void computeEmployeeWage() {

		for (CompanyEmpWage company : repository.findAll()) {

			int totalHours = 0;
			int totalDays = 0;
			int totalWage = 0;

			Random random = new Random();

			System.out.println("Computing wage for " + company.getCompanyName());

			while (totalHours < company.getMaxWorkingHours() && totalDays < company.getMaxWorkingDays()) {

				totalDays++;

				int empCheck = random.nextInt(3);
				int workingHours = 0;

				switch (empCheck) {
				case FULL_TIME:
					workingHours = FULL_TIME_HOURS;
					break;
				case PART_TIME:
					workingHours = PART_TIME_HOURS;
					break;
				default:
					workingHours = 0;
				}

				totalHours += workingHours;

				int dailyWage = workingHours * company.getWagePerHour();

				company.addDailyWage(dailyWage);

				totalWage += dailyWage;
			}

			company.setTotalWage(totalWage);

		}
	}

	@Override
	public int getTotalWage(String companyName) {

		CompanyEmpWage company = repository.findByCompanyName(companyName);

		if (company != null) {
			return company.getTotalWage();
		}

		return 0;
	}
}
