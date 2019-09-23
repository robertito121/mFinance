package mFinanceProductInformation;

public class LoanApplication {
    
    private Loan loan;
    private Double amount;
    private String status;

    /**
     * @param loan
     * @param amount
     * @param status 
     */
    public LoanApplication(Loan loan, Double amount, String status) {
        this.loan = loan;
        this.amount = amount;
        this.status = status;
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
    
    
    
}
