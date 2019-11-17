package mFinanceProductInformation;

import java.io.Serializable;

public class Loan implements Serializable{
    
    //Loan: loanType, loanNumber
    private int loanNumber;
    private String loanType;
    private Double amount;
    
    
    /**
     * Constructor
     * @param loanType;
     * @param loanNumber;
     * 
     */
    public Loan(int loanNumber, String loanType, Double amount) {
        this.loanType= loanType;
        this.loanNumber = loanNumber;
        this.amount = amount;
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

    /**
     * @return the amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    
    
    
}
