package BookShelf;

import java.util.Scanner;

public class LibraryManager {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BookShelf shelf = new BookShelf();

		while (true) {
			System.out.println("\n===== Library Menu =====");
			System.out.println("1. Add Book");
			System.out.println("2. Borrow Book");
			System.out.println("3. Display All Books");
			System.out.println("4. Exit");
			System.out.print("Enter choice: ");

			int choice = sc.nextInt();
			sc.nextLine(); // consume newline

			switch (choice) {

			case 1:
				System.out.print("Enter genre: ");
				String genre = sc.nextLine();

				System.out.print("Enter book title: ");
				String title = sc.nextLine();

				System.out.print("Enter author name: ");
				String author = sc.nextLine();

				shelf.addBook(genre, new Book(title, author));
				break;

			case 2:
				System.out.print("Enter genre: ");
				genre = sc.nextLine();

				System.out.print("Enter book title: ");
				title = sc.nextLine();

				System.out.print("Enter author name: ");
				author = sc.nextLine();

				shelf.removeBook(genre, new Book(title, author));
				break;

			case 3:
				shelf.displayBooks();
				break;

			case 4:
				System.out.println("Library system closed.");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}
