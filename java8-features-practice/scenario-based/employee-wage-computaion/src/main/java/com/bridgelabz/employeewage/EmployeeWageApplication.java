package com.bridgelabz.employeewage;
import com.bridgelabz.employeewage.controller.*;
public class EmployeeWageApplication {
	public static void main(String[] args) {
		System.out.println("----------Welcome to Employee Wage Computation--------");
		EmpWageController controller = new EmpWageController();
        controller.computeEmployeeWage();
	}
}
