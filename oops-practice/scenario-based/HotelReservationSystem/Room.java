package HotelReservationSystem;

public class Room {
    int roomNo;
    double roomPrice;
    boolean available;

    // Constructor
    public Room(int roomNo, double roomPrice) {
        this.roomNo = roomNo;
        this.roomPrice = roomPrice;
        this.available = true; // default available
    }
}
