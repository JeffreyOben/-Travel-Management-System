public abstract class Booking {

    protected int bookingID;
    protected Customer customer;
    protected String bookingType;
    protected String startDate;
    protected String endDate;
    protected double cost;

    public Booking(int bookingID, Customer customer, String bookingType,
                   String startDate, String endDate, double cost) {
        this.bookingID = bookingID;
        this.customer = customer;
        this.bookingType = bookingType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.cost = cost;
    }

    public int getBookingID() {
        return bookingID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getCost() {
        return cost;
    }

    public void displayBookingDetails() {
        System.out.println("Booking ID: " + bookingID);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Type: " + bookingType);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
        System.out.println("Cost: £" + cost);
    }
}