package level1;

public class LibraryBookSystem {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook(); 
        LibraryBook book2 = new LibraryBook("The Great Gatsby", "F. Scott Fitzgerald", 10.99, true); 
        book2.borrowBook(); 
    }
}
class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;
    // Default constructor
    public LibraryBook() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
        this.isAvailable = true;
        displayBookInfo();
    }
    // Parameterized constructor
    public LibraryBook(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
        displayBookInfo();
    }
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed \"" + title + "\".");
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently not available.");
        }
    }
    public void displayBookInfo() {
        System.out.printf("Title: %s, Author: %s, Price: $%.2f, Available: %b%n", title, author, price, isAvailable);
    }
}

