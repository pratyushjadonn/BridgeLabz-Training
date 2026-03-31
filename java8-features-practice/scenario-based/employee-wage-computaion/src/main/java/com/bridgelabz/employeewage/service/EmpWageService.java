package com.bridgelabz.employeewage.service;

import com.bridgelabz.employeewage.model.Employee;
import java.util.Random;

public class EmpWageService {
	private static final int FULL_TIME_HOURS = 8;
    private static final int PART_TIME_HOURS = 4;

    public Employee computeEmployeeWage(
            String companyName,
            int wagePerHour,
            int maxWorkingDays,
            int maxWorkingHours) {

        Random random = new Random();

        int totalWage = 0;
        int totalHours = 0;
        int totalDays = 0;

        System.out.println("---- Computing Wage for " + companyName + " ----");

        while (totalHours < maxWorkingHours
                && totalDays < maxWorkingDays) {

            totalDays++;

            int empCheck = random.nextInt(3);
            int workingHours;

            switch (empCheck) {

                case 1:
                    workingHours = FULL_TIME_HOURS;
                    break;

                case 2:
                    workingHours = PART_TIME_HOURS;
                    break;

                default:
                    workingHours = 0;
            }

            totalHours += workingHours;

            int dailyWage = workingHours * wagePerHour;
            totalWage += dailyWage;

            System.out.println("Day " + totalDays +
                    " | Hours: " + workingHours +
                    " | Daily Wage: " + dailyWage);
        }

        Employee employee = new Employee();
        employee.setTotalWage(totalWage);

        System.out.println("Total Wage for " + companyName + ": "
                + totalWage);
        System.out.println("----------------------------------");

        return employee;
    }
}
