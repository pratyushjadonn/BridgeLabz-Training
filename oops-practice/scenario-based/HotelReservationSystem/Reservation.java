package HotelReservationSystem;

public class Reservation {
    Room room;
    Guest guest;
    int days;

    public Reservation(Room room, Guest guest, int days) {
        this.room = room;
        this.guest = guest;
        this.days = days;
    }
}
