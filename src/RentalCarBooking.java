public class RentalCarBooking extends Booking {

    private String carDetails;

    public RentalCarBooking(int bookingID, Customer customer, String startDate,
                            String endDate, double cost, String carDetails) {
        super(bookingID, customer, "Rental Car", startDate, endDate, cost);
        this.carDetails = carDetails;
    }

    public String getCarDetails() {
        return carDetails;
    }

    public void setCarDetails(String carDetails) {
        this.carDetails = carDetails;
    }

    @Override
    public void displayBookingDetails() {
        super.displayBookingDetails();
        System.out.println("Car Details: " + carDetails);
    }
}