package extras;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
public class TimeZonesAndZonedDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZonedDateTime gmtTime = ZonedDateTime.now(java.time.ZoneId.of("GMT"));
        ZonedDateTime istTime = ZonedDateTime.now(java.time.ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pstTime = ZonedDateTime.now(java.time.ZoneId.of("America/Los_Angeles"));
        System.out.println("Current time in GMT: " + gmtTime);
        System.out.println("Current time in IST: " + istTime);
        System.out.println("Current time in PST: " + pstTime);
       

	}

}
