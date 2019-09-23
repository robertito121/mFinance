package mFinanceProductInformation;

public class Loan {
    
    //Loan: loanType, loanNumber
    private String loanType;
    private int loanNumber;
    
    
    /**
     * Constructor
     * @param loanType;
     * @param loanNumber;
     */
    public Loan(String loanType, int loanNumber) {
        this.loanType= loanType;
        this.loanNumber = loanNumber;
    }
    
    /**
     * Gets the loanType attribute of the Loan
     * @return the Loans loanType
     * @see loanType
     */
    public String getLoanType() {
        return loanType;
    }
    
    /**
     * Gets the loanNumber attribute of the Loan
     * @return the Loans loanNumber
     * @see loanNumber
     */
    public int getLoanNumber() {
        return loanNumber;
    }

    /**
     * Sets the loanType attribute of the loan
     * @param loanType 
     */
    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    /**
     * Sets the loanNumber attribute of the loan
     * @param loanNumber 
     */
    public void setLoanNumber(int loanNumber) {
        this.loanNumber = loanNumber;
    }
    
    
    
}
