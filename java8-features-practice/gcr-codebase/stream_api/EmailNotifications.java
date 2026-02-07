package stream_api;

import java.util.*;

public class EmailNotifications {

	public static void sendEmailNotification(String email) {
		// Simulating email sending
		System.out.println("Notification email sent to: " + email);
	}

	public static void main(String[] args) {

		List<String> emails = Arrays.asList("amit@gmail.com", "riya@gmail.com", "john@gmail.com");

		emails.forEach(email -> sendEmailNotification(email));
	}
}
