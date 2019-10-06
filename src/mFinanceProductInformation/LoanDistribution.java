package mFinanceProductInformation;

public class LoanDistribution {
    
    private int loanNumber;
    private String distributionAccount;
    private String status;
    private boolean distributed;

    /**
     * Constructor
     * @param loanNumber
     * @param distributionAccount;
     * @param status
     */
    public LoanDistribution(int loanNumber, String distributionAccount, String status) {
        this.loanNumber = loanNumber;
        this.distributionAccount = distributionAccount;
        this.status = status;
        distributed = false;
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
    public String getDistributionAccount() {
        return distributionAccount;
    }

    /**
     * Sets the distributionAccount attribute of the loanDistribution
     * @param String object
     * @see distributionAccount
     */
    public void setDistributionAccount(String distributionAccount) {
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
    
    
    /*
    * stub of transfering loan into distribution account
    */
    public void distributeLoan() {
        
        //loan distribution
        boolean loandistributed = true;
        if(loandistributed) {
            status = "active";
            distributed = true;
        }
    }
    
    /*
    * confirming loan distribution
    * @return boolean
    */
    public boolean distributionConfirmation() {        
        return distributed;
    }
    
    
}
