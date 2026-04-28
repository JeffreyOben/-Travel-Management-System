public class Customer {
    private int customerID;
    private String name;
    private String contactDetails;
    private String billingInfo;

    public Customer(int customerID, String name, String contactDetails, String billingInfo) {
        this.customerID = customerID;
        this.name = name;
        this.contactDetails = contactDetails;
        this.billingInfo = billingInfo;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public String getBillingInfo() {
        return billingInfo;
    }

    public void displayCustomer() {
        System.out.println("Customer ID: " + customerID);
        System.out.println("Name: " + name);
        System.out.println("Contact Details: " + contactDetails);
        System.out.println("Billing Info: " + billingInfo);
    }
}