package keywords;
public class LibraryManagementSystem {
    // Static variable shared across all books
    private static String libraryName = "Egmore Library";
    // Final variable (unique and cannot be changed)
    private final String isbn;
    // Instance variables
    private String title;
    private String author;
    // Constructor using 'this'
    public LibraryManagementSystem(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
    // Display book details
    public void displayBookDetails() {
        if (this instanceof LibraryManagementSystem) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Invalid Book Object");
        }
    }
    // Main method
    public static void main(String[] args) {
    	LibraryManagementSystem book = new LibraryManagementSystem("Effective Java","Joshua Bloch","978-0134685991");
        // Display library and book details
    	LibraryManagementSystem.displayLibraryName();
        book.displayBookDetails();
    }
}