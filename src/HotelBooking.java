public class HotelBooking extends Booking {

    private String hotelDetails;

    public HotelBooking(int bookingID, Customer customer, String startDate,
                        String endDate, double cost, String hotelDetails) {
        super(bookingID, customer, "Hotel", startDate, endDate, cost);
        this.hotelDetails = hotelDetails;
    }

    public String getHotelDetails() {
        return hotelDetails;
    }

    public void setHotelDetails(String hotelDetails) {
        this.hotelDetails = hotelDetails;
    }

    @Override
    public void displayBookingDetails() {
        super.displayBookingDetails();
        System.out.println("Hotel Details: " + hotelDetails);
    }
}