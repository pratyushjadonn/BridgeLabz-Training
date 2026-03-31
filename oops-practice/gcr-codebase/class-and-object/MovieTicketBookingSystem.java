package ClassAndObject;
public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Dragon");
        ticket.displayDetails();
        ticket.bookTicket("A10", 120.0);
        ticket.displayDetails();
        ticket.bookTicket("B15", 150.0); 
        ticket.displayDetails();
    }
}
class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "";
        this.price = 0.0;
        this.isBooked = false;
    }
    public void bookTicket(String seatNumber, double price) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked for movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
        } else {
            System.out.println("House full!!! sorry..... Ticket already booked");
        }
    }
    public void displayDetails() {
        if (isBooked) {
            System.out.println("Ticket booked for movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        } else {
            System.out.println("Ticket have not booked yet....");
        }
    }
}

