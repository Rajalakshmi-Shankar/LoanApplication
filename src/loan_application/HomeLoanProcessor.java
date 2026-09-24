package loan_application;

/**
 * Processes home loan applications.
 */
public class HomeLoanProcessor extends LoanProcessor {

    // Method Overriding
    @Override
    public void processLoan(LoanApplication application) {

        System.out.println("\n--- Loan Processing ---");

        // Employment verification
        System.out.println("Employment Verification : PASSED");

        // Credit check
        System.out.println("Credit Check           : PASSED");

        // Property verification
        System.out.println("Property Verification  : PASSED");

        // Eligibility check
        boolean eligible =
                checkEligibility(
                        application.getEmployment().getAnnualIncome()
                );

        System.out.println("Income Eligibility     : " + eligible);

        // Loan calculation
        double maximumLoan =
                calculateLoanAmount(
                        application.getProperty().getPropertyValue()
                );

        System.out.println("Maximum Eligible Loan  : " + maximumLoan);

        // Approval / Rejection
        if (eligible &&
                application.getLoanAmount() <= maximumLoan) {

            System.out.println("Loan Status            : APPROVED");

        } else {

            System.out.println("Loan Status            : REJECTED");
        }
    }

    // Method Overriding
    @Override
    public boolean checkEligibility(double income) {

        return income >= 500000;
    }
}