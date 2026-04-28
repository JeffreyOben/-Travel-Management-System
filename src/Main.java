import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TravelManagementSystem system = new TravelManagementSystem();

        boolean running = true;

        while (running) {
            System.out.println("\n===== Travel Management System =====");
            System.out.println("1. Add Customer");
            System.out.println("2. Add Booking");
            System.out.println("3. View Customers");
            System.out.println("4. View Bookings");
            System.out.println("5. Add Travel Package");
            System.out.println("6. View Packages");
            System.out.println("7. Make Payment");
            System.out.println("8. View Payments");
            System.out.println("9. Delete Booking");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Customer ID: ");
                    int customerID = input.nextInt();
                    input.nextLine();

                    System.out.print("Name: ");
                    String name = input.nextLine();

                    System.out.print("Contact Details: ");
                    String contact = input.nextLine();

                    System.out.print("Billing Info: ");
                    String billing = input.nextLine();

                    system.addCustomer(new Customer(customerID, name, contact, billing));
                    break;

                case 2:
                    System.out.print("Booking ID: ");
                    int bookingID = input.nextInt();

                    System.out.print("Customer ID: ");
                    int cID = input.nextInt();
                    input.nextLine();

                    Customer customer = system.findCustomer(cID);

                    if (customer == null) {
                        System.out.println("Customer not found. Add customer first.");
                        break;
                    }

                    System.out.println("Booking Type:");
                    System.out.println("1. Flight");
                    System.out.println("2. Hotel");
                    System.out.println("3. Rental Car");
                    System.out.print("Choose type: ");
                    int type = input.nextInt();
                    input.nextLine();

                    System.out.print("Start Date: ");
                    String startDate = input.nextLine();

                    System.out.print("End Date: ");
                    String endDate = input.nextLine();

                    System.out.print("Cost: ");
                    double cost = input.nextDouble();
                    input.nextLine();

                    if (type == 1) {
                        System.out.print("Flight Details: ");
                        String details = input.nextLine();
                        system.addBooking(new FlightBooking(bookingID, customer, startDate, endDate, cost, details));
                    } else if (type == 2) {
                        System.out.print("Hotel Details: ");
                        String details = input.nextLine();
                        system.addBooking(new HotelBooking(bookingID, customer, startDate, endDate, cost, details));
                    } else if (type == 3) {
                        System.out.print("Car Details: ");
                        String details = input.nextLine();
                        system.addBooking(new RentalCarBooking(bookingID, customer, startDate, endDate, cost, details));
                    } else {
                        System.out.println("Invalid booking type.");
                    }
                    break;

                case 3:
                    system.displayCustomers();
                    break;

                case 4:
                    system.displayBookings();
                    break;

                case 5:
                    System.out.print("Package ID: ");
                    int packageID = input.nextInt();
                    input.nextLine();

                    System.out.print("Package Name: ");
                    String packageName = input.nextLine();

                    System.out.print("Description: ");
                    String description = input.nextLine();

                    System.out.print("Duration in days: ");
                    int duration = input.nextInt();

                    System.out.print("Base Cost: ");
                    double packageCost = input.nextDouble();

                    system.addPackage(new TravelPackage(packageID, packageName, description, duration, packageCost));
                    break;

                case 6:
                    system.displayPackages();
                    break;

                case 7:
                    System.out.print("Payment ID: ");
                    int paymentID = input.nextInt();

                    System.out.print("Booking ID: ");
                    int payBookingID = input.nextInt();

                    Booking booking = system.findBooking(payBookingID);

                    if (booking == null) {
                        System.out.println("Booking not found.");
                        break;
                    }

                    System.out.print("Amount: ");
                    double amount = input.nextDouble();

                    System.out.println("Payment Method:");
                    System.out.println("1. Credit Card");
                    System.out.println("2. Bank Transfer");
                    System.out.println("3. PayPal");
                    System.out.println("4. Cash");
                    System.out.print("Choose method: ");
                    int methodChoice = input.nextInt();

                    PaymentMethod method;

                    if (methodChoice == 1) {
                        method = PaymentMethod.CREDIT_CARD;
                    } else if (methodChoice == 2) {
                        method = PaymentMethod.BANK_TRANSFER;
                    } else if (methodChoice == 3) {
                        method = PaymentMethod.PAYPAL;
                    } else {
                        method = PaymentMethod.CASH;
                    }

                    system.addPayment(new Payment(paymentID, booking, amount, method));
                    break;

                case 8:
                    system.displayPayments();
                    break;

                case 9:
                    System.out.print("Enter Booking ID to delete: ");
                    int deleteID = input.nextInt();
                    system.deleteBooking(deleteID);
                    break;

                case 0:
                    running = false;
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        input.close();
    }
}