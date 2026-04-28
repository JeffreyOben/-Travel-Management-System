public class BookingTask implements Runnable {

    private TravelManagementSystem system;
    private Booking booking;

    public BookingTask(TravelManagementSystem system, Booking booking) {
        this.system = system;
        this.booking = booking;
    }

    @Override
    public void run() {
        system.addBooking(booking);
    }
}
