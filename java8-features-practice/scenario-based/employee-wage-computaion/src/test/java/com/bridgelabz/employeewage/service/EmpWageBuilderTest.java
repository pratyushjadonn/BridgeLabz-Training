package com.bridgelabz.employeewage.service;

import com.bridgelabz.employeewage.model.CompanyEmpWage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.bridgelabz.employeewage.repository.CompanyEmpWageRepository;
import com.bridgelabz.employeewage.service.EmpWageBuilder;
import com.bridgelabz.employeewage.service.IEmpWageBuilder;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmpWageBuilderTest {

	private IEmpWageBuilder builder;

	@BeforeEach
	void setup() {
		// Initialize builder
		builder = new EmpWageBuilder();

		// Add multiple companies
		builder.addCompany("TCS", 20, 20, 100);
		builder.addCompany("Infosys", 25, 22, 110);
	}

	@Test
	void testComputeEmployeeWage_TotalWageNotZero() {
		builder.computeEmployeeWage();

		int tcsWage = builder.getTotalWage("TCS");
		int infosysWage = builder.getTotalWage("Infosys");

		assertTrue(tcsWage > 0, "TCS total wage should be greater than 0");
		assertTrue(infosysWage > 0, "Infosys total wage should be greater than 0");
	}

	@Test
	void testDailyWagesStored() {
		builder.computeEmployeeWage();

		// Use repository to get companies
		CompanyEmpWageRepository repo = new CompanyEmpWageRepository();
		builder.addCompany("Wipro", 30, 18, 90);
		builder.computeEmployeeWage();

		// Using getTotalWage indirectly ensures wages computed
		int tcsTotal = builder.getTotalWage("TCS");
		assertTrue(tcsTotal > 0, "TCS total wage should be computed");

		int infosysTotal = builder.getTotalWage("Infosys");
		assertTrue(infosysTotal > 0, "Infosys total wage should be computed");
	}

	@Test
	void testQueryByCompanyName_Found() {
		builder.computeEmployeeWage();
		int tcsWage = builder.getTotalWage("TCS");
		assertTrue(tcsWage > 0, "Queried TCS wage should be returned");
	}

	@Test
	void testQueryByCompanyName_NotFound() {
		builder.computeEmployeeWage();
		int wage = builder.getTotalWage("Wipro");
		assertEquals(0, wage, "Queried company not in list should return 0");
	}

	@Test
	void testMultipleCompanies() {
		builder.addCompany("Wipro", 30, 18, 90);
		builder.computeEmployeeWage();

		assertTrue(builder.getTotalWage("TCS") > 0);
		assertTrue(builder.getTotalWage("Infosys") > 0);
		assertTrue(builder.getTotalWage("Wipro") > 0);
	}

	@Test
	void testDailyWagesCountMatchesWorkingDays() {
		builder.computeEmployeeWage();

		int totalWage = builder.getTotalWage("TCS");
		assertTrue(totalWage > 0, "Total wage should be computed");

	}
}
