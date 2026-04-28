import java.util.ArrayList;

public class TravelPackage {

    private int packageID;
    private String packageName;
    private String description;
    private int duration;
    private double cost;
    private ArrayList<Booking> bookings;

    public TravelPackage(int packageID, String packageName, String description,
                         int duration, double cost) {
        this.packageID = packageID;
        this.packageName = packageName;
        this.description = description;
        this.duration = duration;
        this.cost = cost;
        this.bookings = new ArrayList<>();
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public double calculateTotalCost() {
        double total = cost;

        for (Booking booking : bookings) {
            total += booking.getCost();
        }

        return total;
    }

    public void displayPackageDetails() {
        System.out.println("Package ID: " + packageID);
        System.out.println("Package Name: " + packageName);
        System.out.println("Description: " + description);
        System.out.println("Duration: " + duration + " days");
        System.out.println("Base Cost: £" + cost);
        System.out.println("Total Package Cost: £" + calculateTotalCost());
    }
}
