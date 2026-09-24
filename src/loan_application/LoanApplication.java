package loan_application;

/**
 * Represents a mortgage loan application.
 */
public class LoanApplication {

    private String applicationId;
    private double loanAmount;

    // HAS-A relationships
    private Customer customer;
    private Employment employment;
    private Property property;

    public LoanApplication(String applicationId,
                           double loanAmount,
                           Customer customer,
                           Employment employment,
                           Property property) {

        this.applicationId = applicationId;
        this.loanAmount = loanAmount;
        this.customer = customer;
        this.employment = employment;
        this.property = property;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Employment getEmployment() {
        return employment;
    }

    public Property getProperty() {
        return property;
    }

    // Method Overloading - compile-time polymorphism
    public void displayApplication() {

        System.out.println("\nApplication ID : " + applicationId);
        System.out.println("Loan Amount    : " + loanAmount);
    }

    public void displayApplication(boolean detailed) {

        displayApplication();

        if (detailed) {

            System.out.println("\n--- Customer Details ---");
            customer.displayCustomer();

            System.out.println("\n--- Employment Details ---");
            employment.displayEmployment();

            System.out.println("\n--- Property Details ---");
            property.displayProperty();
        }
    }
}