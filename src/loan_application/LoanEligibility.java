package loan_application;
/**
 * Interface for checking loan eligibility.
 */
public interface LoanEligibility {

    // Abstract method
    boolean checkEligibility(double income);

    // Default method
    default void showEligibilityMessage() {
        System.out.println("Eligibility check completed.");
    }

    // Static method
    static void showEligibilityRule() {
        System.out.println("Minimum annual income required: 5,00,000");
    }
}