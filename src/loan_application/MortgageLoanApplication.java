package loan_application;
/**
 * Main class for Mortgage Loan Application System.
 */
public class MortgageLoanApplication {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("      MORTGAGE LOAN APPLICATION");
        System.out.println("========================================");

        // Create Customer
        Customer customer = new Customer(
                101,
                "Raji",
                "9876543210"
        );

        // Create Employment
        Employment employment = new Employment(
                "ABC Technologies",
                "Software Engineer",
                800000
        );

        // Create Property
        Property property = new Property(
                "Coimbatore, Tamil Nadu",
                5000000
        );

        // Create Loan Application
        LoanApplication application =
                new LoanApplication(
                        "LA101",
                        4000000,
                        customer,
                        employment,
                        property
                );

        // Method overloading
        application.displayApplication(true);

        System.out.println("\n--- Loan Processor ---");

        /*
         * Runtime Polymorphism
         *
         * Parent reference
         *       ↓
         * Child object
         */
        LoanProcessor processor =
                new HomeLoanProcessor();

        processor.showBankName();

        // Static method
        LoanEligibility.showEligibilityRule();

        // Process loan
        processor.processLoan(application);

        // Default method
        processor.showEligibilityMessage();

        System.out.println("\n========================================");
        System.out.println("          PROCESS COMPLETED");
        System.out.println("========================================");
    }
}