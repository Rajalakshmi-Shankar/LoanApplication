package loan_application;


/**
 * Represents employment and income details.
 */
public class Employment {

    private String companyName;
    private String jobTitle;
    private double annualIncome;

    public Employment(String companyName, String jobTitle, double annualIncome) {
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.annualIncome = annualIncome;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public void displayEmployment() {
        System.out.println("Company       : " + companyName);
        System.out.println("Job Title     : " + jobTitle);
        System.out.println("Annual Income : " + annualIncome);
    }
}
