package collectors;

import java.util.*;
import java.util.stream.*;

public class LibraryBookStatistics {

	static class Book {
		private String genre;
		private int pages;

		Book(String genre, int pages) {
			this.genre = genre;
			this.pages = pages;
		}

		public String getGenre() {
			return genre;
		}

		public int getPages() {
			return pages;
		}
	}

	public static void main(String[] args) {

		List<Book> books = Arrays.asList(new Book("Fiction", 300), new Book("Fiction", 450), new Book("Fiction", 500),
				new Book("Science", 600), new Book("Science", 550));

		Map<String, IntSummaryStatistics> statsByGenre = books.stream()
				.collect(Collectors.groupingBy(Book::getGenre, Collectors.summarizingInt(Book::getPages)));

		statsByGenre.forEach((genre, stats) -> {
			System.out.println("Genre: " + genre);
			System.out.println("Total Pages: " + stats.getSum());
			System.out.println("Average Pages: " + stats.getAverage());
			System.out.println("Max Pages: " + stats.getMax());
			System.out.println();
		});
	}
}
