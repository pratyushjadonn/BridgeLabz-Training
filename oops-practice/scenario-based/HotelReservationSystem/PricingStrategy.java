package HotelReservationSystem;

public interface PricingStrategy {
	double calculatePrice(Room room, int days);

}
