public class FlightBooking extends Booking {

    private String flightDetails;

    public FlightBooking(int bookingID, Customer customer, String startDate,
                         String endDate, double cost, String flightDetails) {
        super(bookingID, customer, "Flight", startDate, endDate, cost);
        this.flightDetails = flightDetails;
    }

    public String getFlightDetails() {
        return flightDetails;
    }

    public void setFlightDetails(String flightDetails) {
        this.flightDetails = flightDetails;
    }

    @Override
    public void displayBookingDetails() {
        super.displayBookingDetails();
        System.out.println("Flight Details: " + flightDetails);
    }
}