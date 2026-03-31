package CinemaTime;

import java.util.*;

public class CinemaTimeManager {

	private List<String> titles = new ArrayList<>();
	private List<String> times = new ArrayList<>();

	// Add movie
	public void addMovie(String title, String time) throws InvalidTimeFormatException {
		validateTime(time);
		titles.add(title);
		times.add(time);
	}

	// Search movie by keyword
	public void searchMovie(String keyword) {
		boolean found = false;

		try {
			for (int i = 0; i < titles.size(); i++) {
				if (titles.get(i).contains(keyword)) {
					System.out.println(formatMovie(i));
					found = true;
				}
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Error accessing movie data.");
		}

		if (!found) {
			System.out.println("No movie found with keyword: " + keyword);
		}
	}

	// Display all movies
	public void displayAllMovies() {
		if (titles.isEmpty()) {
			System.out.println("No movies scheduled.");
			return;
		}

		for (int i = 0; i < titles.size(); i++) {
			System.out.println(formatMovie(i));
		}
	}

	// Generate printable report (List → Array)
	public void generateReport() {
		String[] report = new String[titles.size()];

		for (int i = 0; i < titles.size(); i++) {
			report[i] = formatMovie(i);
		}

		System.out.println("\n Movie Schedule Report:");
		for (String entry : report) {
			System.out.println(entry);
		}
	}

	// Helper: format movie info
	private String formatMovie(int index) {
		return String.format("Movie: %s | Showtime: %s", titles.get(index), times.get(index));
	}

	// Helper: validate time HH:MM
	private void validateTime(String time) throws InvalidTimeFormatException {
		if (!time.matches("\\d{2}:\\d{2}")) {
			throw new InvalidTimeFormatException("Invalid time format: " + time);
		}

		String[] parts = time.split(":");
		int hour = Integer.parseInt(parts[0]);
		int minute = Integer.parseInt(parts[1]);

		if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
			throw new InvalidTimeFormatException("Invalid time value: " + time);
		}
	}
}
