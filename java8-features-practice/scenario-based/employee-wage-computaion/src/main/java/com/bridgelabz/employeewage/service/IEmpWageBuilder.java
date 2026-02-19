package com.bridgelabz.employeewage.service;

public interface IEmpWageBuilder {

	void addCompany(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours);

	void computeEmployeeWage();

	int getTotalWage(String companyName);
}
