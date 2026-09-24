package loan_application;

/**
 * Abstract class for loan processing.
 */
public abstract class LoanProcessor implements LoanEligibility {

    // Abstract method
    public abstract void processLoan(LoanApplication application);

    // Concrete method
    public void showBankName() {
        System.out.println("Bank : MentorBridge Bank");
    }

    // Concrete method
    public double calculateLoanAmount(double propertyValue) {
        return propertyValue * 0.80;
    }

    // Method Overloading
    public double calculateLoanAmount(double propertyValue, double percentage) {
        return propertyValue * percentage / 100;
    }
}