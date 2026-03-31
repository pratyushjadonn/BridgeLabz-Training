package HotelReservationSystem;

public class HotelApp {

    public static void main(String[] args) {

        // Create Room
        Room room1 = new Room(101, 3000);

        // Create Guest
        Guest guest1 = new Guest(1, "Shagun");

        // Pricing strategy
        SeasonalPricing pricing = new SeasonalPricing();

        try {
            // Check availability (Check-in)
            if (!room1.available) {
                throw new RoomNotAvailableException("Room is already booked");
            }

            room1.available=false; // room booked

            // Reservation
            Reservation reservation =
                    new Reservation(room1, guest1, 2);

            // Billing
            double bill =
                    pricing.calculatePrice(room1, reservation.days);

            System.out.println("Reservation Successful");
            System.out.println("Guest: " + guest1.guestName);
            System.out.println("Room No: " + room1.roomNo);
            System.out.println("Total Bill: ₹" + bill);

            // Check-out
            room1.available=true;
            System.out.println("Check-out done");

        } catch (RoomNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
