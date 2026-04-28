public class Payment {

    private int paymentID;
    private Booking booking;
    private double amount;
    private PaymentMethod paymentMethod;

    public Payment(int paymentID, Booking booking, double amount, PaymentMethod paymentMethod) {
        this.paymentID = paymentID;
        this.booking = booking;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public void processPayment() {
        System.out.println("Payment processed successfully.");
    }

    public void displayPaymentDetails() {
        System.out.println("Payment ID: " + paymentID);
        System.out.println("Booking ID: " + booking.getBookingID());
        System.out.println("Amount: £" + amount);
        System.out.println("Payment Method: " + paymentMethod);
    }
}