package mFinanceProductInformation;

public class LoanApplication {
    
    private Loan loan;
    private Double amount;
    private String status;
    private LoanInformationApplication loanInformation;
    private PersonalDataApplication personalDataApp;

    /**
     * @param loan
     * @param amount
     * @param status 
     * @param LoanInformationApplication
     * @param PersonalDataApplication
     */
    public LoanApplication(Loan loan, Double amount, String status, LoanInformationApplication loanInfo, PersonalDataApplication personalData) {
        this.loan = loan;
        this.amount = amount;
        this.status = status;
        this.loanInformation = loanInfo;
        this.personalDataApp = personalData;
    }

    /**
     * Gets the Loan attribute of the LoanApplication
     * @return the LoanApplications Loan
     * @see Loan
     */
    public Loan getLoan() {
        return loan;
    }

    /**
     * Sets the Loan attribute of the LoanApplication
     * @param Loan
     */
    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    /**
     * Gets the amount attribute of the LoanApplication
     * @return the LoanApplication amount
     * @see amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Sets the amount attribute of the LoanApplication
     * @param Double
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * Gets the status attribute of the LoanApplication
     * @return the LoanApplication status
     * @see status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status attribute of the LoanApplication
     * @param String
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the loanInformation
     */
    public LoanInformationApplication getLoanInformation() {
        return loanInformation;
    }

    /**
     * @param loanInformation the loanInformation to set
     */
    public void setLoanInformation(LoanInformationApplication loanInformation) {
        this.loanInformation = loanInformation;
    }

    /**
     * @return the personalDataApp
     */
    public PersonalDataApplication getPersonalDataApp() {
        return personalDataApp;
    }

    /**
     * @param personalDataApp the personalDataApp to set
     */
    public void setPersonalDataApp(PersonalDataApplication personalDataApp) {
        this.personalDataApp = personalDataApp;
    }
    
    
    
}
