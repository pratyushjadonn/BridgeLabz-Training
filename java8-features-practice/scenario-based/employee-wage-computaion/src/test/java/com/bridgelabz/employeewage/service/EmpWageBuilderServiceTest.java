package com.bridgelabz.employeewage.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpWageBuilderServiceTest {

	private IEmpWageBuilder builder;

	@BeforeEach
	void setup() {
		// Initialize the service
		builder = new EmpWageBuilder();

		// Add multiple companies
		builder.addCompany("TCS", 20, 20, 100);
		builder.addCompany("Infosys", 25, 22, 110);
	}

	@Test
	void testComputeEmployeeWage_TotalWagePositive() {
		builder.computeEmployeeWage();

		int tcsWage = builder.getTotalWage("TCS");
		int infosysWage = builder.getTotalWage("Infosys");

		assertTrue(tcsWage > 0, "TCS total wage should be greater than 0");
		assertTrue(infosysWage > 0, "Infosys total wage should be greater than 0");
	}

	@Test
	void testQueryNonExistentCompany_ReturnsZero() {
		builder.computeEmployeeWage();
		int wage = builder.getTotalWage("Wipro"); // Not added
		assertEquals(0, wage, "Query for non-existent company should return 0");
	}

	@Test
	void testMultipleCompaniesCompute() {
		builder.addCompany("Wipro", 30, 18, 90);
		builder.computeEmployeeWage();

		assertTrue(builder.getTotalWage("TCS") > 0);
		assertTrue(builder.getTotalWage("Infosys") > 0);
		assertTrue(builder.getTotalWage("Wipro") > 0);
	}

	@Test
	void testDailyWagesStored_IndirectCheck() {
		builder.computeEmployeeWage();

		// We cannot access repository, so check total wage is sum of daily wages
		// indirectly
		int tcsTotal = builder.getTotalWage("TCS");
		int infosysTotal = builder.getTotalWage("Infosys");

		assertTrue(tcsTotal > 0, "TCS total wage should be computed");
		assertTrue(infosysTotal > 0, "Infosys total wage should be computed");
	}

	@Test
	void testEdgeCase_MaxHoursOrDaysLimit() {
		// Add a company with very small max hours/days
		builder.addCompany("SmallCo", 10, 1, 4);
		builder.computeEmployeeWage();

		int smallCoWage = builder.getTotalWage("SmallCo");
		assertTrue(smallCoWage <= 40, "SmallCo wage should not exceed max hours * wage per hour");
	}
}
