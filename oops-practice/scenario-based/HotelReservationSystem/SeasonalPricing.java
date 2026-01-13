package HotelReservationSystem;

public class SeasonalPricing implements PricingStrategy {

    @Override
    public double calculatePrice(Room room, int days) {
        return room.roomPrice * days * 1.2; // seasonal surge
    }
}
