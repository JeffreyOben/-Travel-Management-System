import java.util.ArrayList;

public class TravelManagementSystem {

    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Booking> bookings = new ArrayList<>();
    private ArrayList<TravelPackage> packages = new ArrayList<>();
    private ArrayList<Payment> payments = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer added successfully.");
    }

    public Customer findCustomer(int customerID) {
        for (Customer customer : customers) {
            if (customer.getCustomerID() == customerID) {
                return customer;
            }
        }
        return null;
    }

    public Booking findBooking(int bookingID) {
        for (Booking booking : bookings) {
            if (booking.getBookingID() == bookingID) {
                return booking;
            }
        }
        return null;
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
        System.out.println("Booking added successfully.");
    }

    public void deleteBooking(int bookingID) {
        Booking booking = findBooking(bookingID);

        if (booking != null) {
            bookings.remove(booking);
            System.out.println("Booking deleted successfully.");
        } else {
            System.out.println("Booking not found.");
        }
    }

    public void addPackage(TravelPackage travelPackage) {
        packages.add(travelPackage);
        System.out.println("Travel package added successfully.");
    }

    public void addPayment(Payment payment) {
        payments.add(payment);
        payment.processPayment();
    }

    public void displayCustomers() {
        for (Customer customer : customers) {
            customer.displayCustomer();
            System.out.println("--------------------");
        }
    }

    public void displayBookings() {
        for (Booking booking : bookings) {
            booking.displayBookingDetails();
            System.out.println("--------------------");
        }
    }

    public void displayPackages() {
        for (TravelPackage travelPackage : packages) {
            travelPackage.displayPackageDetails();
            System.out.println("--------------------");
        }
    }

    public void displayPayments() {
        for (Payment payment : payments) {
            payment.displayPaymentDetails();
            System.out.println("--------------------");
        }
    }
}
