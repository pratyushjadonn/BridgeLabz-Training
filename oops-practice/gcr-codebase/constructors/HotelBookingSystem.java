package level1;

public class HotelBookingSystem {
    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking(); 
        HotelBooking booking2 = new HotelBooking("John Doe", "Suite", 3); 
        HotelBooking booking3 = new HotelBooking(booking2); 
    }
}
class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;
    // Default constructor
    public HotelBooking() {
        this.guestName = "Guest";
        this.roomType = "Standard";
        this.nights = 1;
        displayBookingInfo();
    }
    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
        displayBookingInfo();
    }
    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
        displayBookingInfo();
    }
    public void displayBookingInfo() {
        System.out.printf("Guest Name: %s, Room Type: %s, Nights: %d%n", guestName, roomType, nights);
    }
}
