package com.bridgelabz.employeewage.controller;

import com.bridgelabz.employeewage.service.IEmpWageBuilder;
import com.bridgelabz.employeewage.service.EmpWageBuilder;

public class EmpWageController {
	private IEmpWageBuilder builder;

	public EmpWageController() {
		builder = new EmpWageBuilder();
	}

	public void computeEmployeeWage() {

		builder.addCompany("TCS", 20, 20, 100);
		builder.addCompany("Infosys", 25, 22, 110);

		builder.computeEmployeeWage();
		int tcsWage = builder.getTotalWage("TCS");
		System.out.println("Queried Total Wage for TCS = " + tcsWage);

	}

}
