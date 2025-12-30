package scenario.based;
import java.util.Random;
 public class EmployeeWageComputation {
	 static final int wagePerHour=20;
	 static final int fullDayHour=8;
	 static final int partTimeHour=4;
	 static final int maxWorkingDays=20;
	 static final int maxWorkingHours=100;
	 public static void main(String[] args) {
		 System.out.println("Welcome to Employee Wage Computation Program \n");
	     int totalWorkDays=0;
	     int totalWorkHours=0;
	     int totalWage=0;
	     Random random = new Random();
	     // UC5: Calculate wages till total working hours or days reached
	     while (totalWorkDays < maxWorkingDays && totalWorkHours < maxWorkingHours) {   
	    	 totalWorkDays++;
	         // UC1: Check if employee is present or absent
	         int isPresent = random.nextInt(2);
	         if (isPresent == 0) {
	                System.out.println("Day " + totalWorkDays + ": Employee Absent");
	                continue;
	                }

	          // UC2: Get employee type (1 = Part Time, 2 = Full Time)
	          int employeeType = random.nextInt(2) + 1;
	          int workingHours = 0;

	          // UC3 & UC4: Get working hours using switch case
	          switch (employeeType) {
	                
	          case 1:
	                 
	        	  workingHours = partTimeHour;
	              break;
	          case 2:
	              workingHours = fullDayHour;
	              break;
	          default:
	              workingHours = 0;  
	          }
	          if (totalWorkHours + workingHours > maxWorkingHours) {	                
	        	  workingHours = maxWorkingHours - totalWorkHours;
	           }
	          totalWorkHours += workingHours;
	          int dailyWage = workingHours * wagePerHour;
	          totalWage += dailyWage;
	          System.out.println("Day " +totalWorkDays+ " | Working Hours: " + workingHours+" | Daily Wage: ₹" +dailyWage);
	          }
	        System.out.println("\n----- Monthly Summary -----");
	        System.out.println("Total Working Days: " + totalWorkDays);
	        System.out.println("Total Working Hours: " + totalWorkHours);
	        System.out.println("Total Monthly Wage: ₹" + totalWage);
	 }
}
