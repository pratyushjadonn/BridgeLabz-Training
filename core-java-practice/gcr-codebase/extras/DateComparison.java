package extras;

public class DateComparison {
	 public static void main(String[] args) {
	        java.time.LocalDate date1 = java.time.LocalDate.of(2023, 5, 15); 
	        java.time.LocalDate date2 = java.time.LocalDate.of(2023, 6, 20); 
	        if (date1.isBefore(date2)) {
	            System.out.println(date1 + " is before " + date2);
	        } else if (date1.isAfter(date2)) {
	            System.out.println(date1 + " is after " + date2);
	        } else if (date1.isEqual(date2)) {
	            System.out.println(date1 + " is the same as " + date2);
	        }
	    }

}
