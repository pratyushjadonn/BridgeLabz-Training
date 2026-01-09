package linkedlist;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Ticket class
class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;

    Ticket(int ticketId, String customerName, String movieName, String seatNumber) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}

// Node class for circular linked list
class Node {
    Ticket data;
    Node next;

    Node(Ticket data) {
        this.data = data;
        this.next = null;
    }
}

// Online Ticket Reservation System
public class OnlineTicketReservationSystem {
    private Node tail; // tail.next points to head

    // Add a ticket at the end
    public void addTicket(Ticket ticket) {
        Node newNode = new Node(ticket);
        if (tail == null) {
            tail = newNode;
            tail.next = tail; // circular
        } else {
            newNode.next = tail.next; // new node points to head
            tail.next = newNode;      // previous tail points to new node
            tail = newNode;           // update tail
        }
        System.out.println("Ticket booked for " + ticket.customerName + " (" + ticket.movieName + ")");
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(int ticketId) {
        if (tail == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Node current = tail.next; // head
        Node prev = tail;
        boolean found = false;

        do {
            if (current.data.ticketId == ticketId) {
                found = true;
                if (current == tail && current.next == tail) { // only one ticket
                    tail = null;
                } else {
                    prev.next = current.next;
                    if (current == tail) tail = prev; // removed tail
                }
                System.out.println("Ticket removed: " + ticketId);
                break;
            }
            prev = current;
            current = current.next;
        } while (current != tail.next);

        if (!found) System.out.println("Ticket ID not found: " + ticketId);
    }

    // Display all tickets
    public void displayTickets() {
        if (tail == null) {
            System.out.println("No tickets booked.");
            return;
        }
        Node temp = tail.next; // head
        System.out.println("---- Current Tickets ----");
        do {
            Ticket t = temp.data;
            System.out.println("Ticket ID: " + t.ticketId + ", Customer: " + t.customerName +
                    ", Movie: " + t.movieName + ", Seat: " + t.seatNumber + ", Booking Time: " + t.bookingTime);
            temp = temp.next;
        } while (temp != tail.next);
        System.out.println("-------------------------");
    }

    // Search tickets by Customer Name or Movie Name
    public void searchTicket(String customerName, String movieName) {
        if (tail == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Node temp = tail.next;
        boolean found = false;
        do {
            Ticket t = temp.data;
            if ((customerName != null && t.customerName.equalsIgnoreCase(customerName)) ||
                (movieName != null && t.movieName.equalsIgnoreCase(movieName))) {
                System.out.println("Ticket Found -> ID: " + t.ticketId + ", Customer: " + t.customerName +
                        ", Movie: " + t.movieName + ", Seat: " + t.seatNumber +
                        ", Booking Time: " + t.bookingTime);
                found = true;
            }
            temp = temp.next;
        } while (temp != tail.next);

        if (!found) System.out.println("No matching tickets found.");
    }

    // Count total booked tickets
    public int countTickets() {
        if (tail == null) return 0;

        Node temp = tail.next;
        int count = 0;
        do {
            count++;
            temp = temp.next;
        } while (temp != tail.next);

        return count;
    }

    // Main method
    public static void main(String[] args) {
        OnlineTicketReservationSystem system = new OnlineTicketReservationSystem();

        // Adding tickets
        system.addTicket(new Ticket(1, "Alice", "Avengers", "A1"));
        system.addTicket(new Ticket(2, "Bob", "Avengers", "A2"));
        system.addTicket(new Ticket(3, "Charlie", "Inception", "B1"));
        system.addTicket(new Ticket(4, "David", "Avengers", "A3"));

        // Display tickets
        system.displayTickets();

        // Search tickets
        system.searchTicket("Alice", null);
        system.searchTicket(null, "Avengers");

        // Remove a ticket
        system.removeTicket(2);
        system.displayTickets();

        // Count tickets
        System.out.println("Total tickets booked: " + system.countTickets());
    }
}
