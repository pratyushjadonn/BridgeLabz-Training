package stream_api;

import java.util.*;

public class EventWelcome {
	public static void main(String[] args) {

		List<String> attendees = Arrays.asList("Amit", "Riya", "John");

		attendees.forEach(name -> System.out.println("Welcome to the event, " + name + "!"));
	}
}
