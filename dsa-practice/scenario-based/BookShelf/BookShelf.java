package BookShelf;

import java.util.*;

public class BookShelf {

	private Map<String, LinkedList<Book>> genreCatalog;
	private Set<Book> uniqueBooks;

	public BookShelf() {
		genreCatalog = new HashMap<>();
		uniqueBooks = new HashSet<>();
	}

	// Add book
	public void addBook(String genre, Book book) {

		if (uniqueBooks.contains(book)) {
			System.out.println("Duplicate book! Not added.");
			return;
		}

		genreCatalog.putIfAbsent(genre, new LinkedList<>());
		genreCatalog.get(genre).add(book);
		uniqueBooks.add(book);

		System.out.println("Book added successfully.");
	}

	// Remove book (borrow)
	public void removeBook(String genre, Book book) {
		LinkedList<Book> books = genreCatalog.get(genre);

		if (books == null || !books.remove(book)) {
			System.out.println("Book not found.");
			return;
		}

		uniqueBooks.remove(book);
		System.out.println("Book borrowed successfully.");
	}

	// Display all books
	public void displayBooks() {
		if (genreCatalog.isEmpty()) {
			System.out.println("Library is empty.");
			return;
		}

		for (String genre : genreCatalog.keySet()) {
			System.out.println("\nGenre: " + genre);
			for (Book book : genreCatalog.get(genre)) {
				System.out.println(" - " + book);
			}
		}
	}
}
