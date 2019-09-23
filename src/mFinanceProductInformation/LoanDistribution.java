package mFinanceProductInformation;

public class LoanDistribution {
    
    private int loanNumber;
    private int distributionAccount;
    private String status;

    /**
     * Constructor
     * @param loanNumber
     * @param distributionAccount;
     * @param status
     */
    public LoanDistribution(int loanNumber, int distributionAccount, String status) {
        this.loanNumber = loanNumber;
        this.distributionAccount = distributionAccount;
        this.status = status;
    }

    /**
     * Gets the loanNumber attribute of the loanDistribution
     * @return loanNumber
     * @see loanNumber
     */
    public int getLoanNumber() {
        return loanNumber;
    }

    /**
     * Sets the loanNumber attribute of the loanDistribution
     * @param int object
     * @see loanNumber
     */
    public void setLoanNumber(int loanNumber) {
        this.loanNumber = loanNumber;
    }

    /**
     * Gets the distributionAccount attribute of the loanDistribution
     * @return distributionAccount
     * @see distributionAccount
     */
    public int getDistributionAccount() {
        return distributionAccount;
    }

    /**
     * Sets the distributionAccount attribute of the loanDistribution
     * @param int object
     * @see distributionAccount
     */
    public void setDistributionAccount(int distributionAccount) {
        this.distributionAccount = distributionAccount;
    }

    /**
     * Gets the status attribute of the loanDistribution
     * @return status
     * @see status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status attribute of the loanDistribution
     * @param String object
     * @see status
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
