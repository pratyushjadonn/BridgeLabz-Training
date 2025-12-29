package extras;

public class DateArithmetic {
	public static void main(String[] args) {
        java.time.LocalDate inputDate = java.time.LocalDate.of(2022, 1, 15); // Example input date
        java.time.LocalDate modifiedDate = inputDate.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Input date: " + inputDate);
        System.out.println("Modified date after adding 7 days, 1 month, 2 years and subtracting 3 weeks: " + modifiedDate);
        
    }

}
