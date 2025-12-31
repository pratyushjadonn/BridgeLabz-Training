package level1;
import  java.util.*;

public class BookLibrarySystem {
    public static void main(String[] args) {
        Book book1 = new Book(1234567890, "The Great Gatsby", "F. Scott Fitzgerald");
        book1.displayBookInfo();
        // Modify author
        book1.setAuthor("Francis Scott Fitzgerald");
        System.out.println("Updated Author: " + book1.getAuthor());
        // Create an EBook
        EBook ebook = new EBook(987653210, "1984", "George Orwell", "PDF");
        ebook.displayEBookInfo();
    }
}
class Book {
    public long ISBN;
    protected String title;
    private String author;

    // Parameterized constructor
    public Book(long ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    // Public method to access author
    public String getAuthor() {
        return author;
    }

    // Public method to modify author
    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookInfo() {
        System.out.printf("ISBN: %d, Title: %s, Author: %s%n", ISBN, title, author);
    }
}
class EBook extends Book {
    private String format;
    // Parameterized constructor
    public EBook(long ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }
    public void displayEBookInfo() {
        displayBookInfo();
        System.out.printf("Format: %s%n", format);
    }
}

