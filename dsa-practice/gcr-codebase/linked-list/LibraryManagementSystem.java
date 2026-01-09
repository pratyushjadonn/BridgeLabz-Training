package linkedlist;

// Book class
class Book {
    int bookId;
    String title;
    String author;
    String genre;
    boolean isAvailable; // true = available, false = issued

    Book(int bookId, String title, String author, String genre, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
    }
}

// Node class for doubly linked list
class Node {
    Book data;
    Node next;
    Node prev;

    Node(Book data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

// Library Management System
public class LibraryManagementSystem {
    private Node head;
    private Node tail;

    // Add book at the beginning
    public void addBookAtBeginning(Book book) {
        Node newNode = new Node(book);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add book at the end
    public void addBookAtEnd(Book book) {
        Node newNode = new Node(book);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Add book at a specific position (1-based index)
    public void addBookAtPosition(Book book, int position) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            addBookAtBeginning(book);
            return;
        }

        Node temp = head;
        int count = 1;
        while (count < position - 1 && temp != null) {
            temp = temp.next;
            count++;
        }

        if (temp != null) {
            Node newNode = new Node(book);
            newNode.next = temp.next;
            newNode.prev = temp;
            if (temp.next != null) temp.next.prev = newNode;
            temp.next = newNode;

            if (newNode.next == null) tail = newNode; // Update tail if added at the end
        } else {
            System.out.println("Invalid position");
        }
    }

    // Remove book by Book ID
    public void removeBook(int bookId) {
        Node temp = head;
        while (temp != null && temp.data.bookId != bookId) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Book not found: " + bookId);
            return;
        }

        if (temp.prev != null) temp.prev.next = temp.next;
        else head = temp.next; // removed head

        if (temp.next != null) temp.next.prev = temp.prev;
        else tail = temp.prev; // removed tail

        System.out.println("Book removed: " + bookId);
    }

    // Search for a book by title or author
    public void searchBook(String title, String author) {
        Node temp = head;
        boolean found = false;
        while (temp != null) {
            if ((title != null && temp.data.title.equalsIgnoreCase(title)) ||
                (author != null && temp.data.author.equalsIgnoreCase(author))) {
                Book b = temp.data;
                System.out.println("Book Found -> ID: " + b.bookId + ", Title: " + b.title +
                        ", Author: " + b.author + ", Genre: " + b.genre +
                        ", Available: " + (b.isAvailable ? "Yes" : "No"));
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("Book not found");
    }

    // Update book availability
    public void updateAvailability(int bookId, boolean status) {
        Node temp = head;
        while (temp != null && temp.data.bookId != bookId) temp = temp.next;
        if (temp != null) {
            temp.data.isAvailable = status;
            System.out.println("Book availability updated: " + bookId);
        } else {
            System.out.println("Book not found: " + bookId);
        }
    }

    // Display all books forward
    public void displayForward() {
        Node temp = head;
        System.out.println("----- Library Books (Forward) -----");
        while (temp != null) {
            Book b = temp.data;
            System.out.println("ID: " + b.bookId + ", Title: " + b.title + ", Author: " + b.author +
                    ", Genre: " + b.genre + ", Available: " + (b.isAvailable ? "Yes" : "No"));
            temp = temp.next;
        }
        System.out.println("----------------------------------");
    }

    // Display all books in reverse
    public void displayReverse() {
        Node temp = tail;
        System.out.println("----- Library Books (Reverse) -----");
        while (temp != null) {
            Book b = temp.data;
            System.out.println("ID: " + b.bookId + ", Title: " + b.title + ", Author: " + b.author +
                    ", Genre: " + b.genre + ", Available: " + (b.isAvailable ? "Yes" : "No"));
            temp = temp.prev;
        }
        System.out.println("----------------------------------");
    }

    // Count total number of books
    public int countBooks() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Main method to test
    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();

        Book b1 = new Book(101, "Harry Potter", "J.K. Rowling", "Fantasy", true);
        Book b2 = new Book(102, "The Alchemist", "Paulo Coelho", "Fiction", true);
        Book b3 = new Book(103, "Clean Code", "Robert C. Martin", "Programming", true);
        Book b4 = new Book(104, "The Hobbit", "J.R.R. Tolkien", "Fantasy", true);
        Book b5 = new Book(105, "1984", "George Orwell", "Dystopia", true);

        // Adding books
        library.addBookAtBeginning(b1);
        library.addBookAtEnd(b2);
        library.addBookAtPosition(b3, 2);
        library.addBookAtEnd(b4);
        library.addBookAtPosition(b5, 3);

        // Display books
        library.displayForward();
        library.displayReverse();

        // Count books
        System.out.println("Total books: " + library.countBooks());

        // Search books
        library.searchBook("The Hobbit", null);
        library.searchBook(null, "Paulo Coelho");

        // Update availability
        library.updateAvailability(103, false);
        library.displayForward();

        // Remove a book
        library.removeBook(102);
        library.displayForward();
    }
}
