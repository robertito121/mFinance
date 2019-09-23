package mFinanceLoanManagement;


public class Payment {

    //Payment: Loan_number, amount, account, type
    private int loanNumber;
    private double amount;
    private String account;
    private String type;


    /**
     * Constructor
     * @param loanNumber
     * @param amount
     * @param account
     * @param type
     */
    public Payment (int loanNumber, double amount, String account, String type){
        this.loanNumber = loanNumber;
        this.amount = amount;
        this.account = account;
        this.type = type;
    }

    /**
     * Get the loanNumber attribute of the user
     * @return loanNumber of the user
     */
    public int getLoanNumber() {
        return loanNumber;
    }

    /**
     * Set the loanNumber attribute of the user
     * @param loanNumber
     */
    public void setLoanNumber(int loanNumber) {
        this.loanNumber = loanNumber;
    }

    /**
     * Get the amount attribute of the user
     * @return amount of the user
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Set the amount attribute of the user
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Get the account attribute of the user
     * @return account of the user
     */
    public String getAccount() {
        return account;
    }

    /**
     * Set the account attribute of the user
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * Get the type attribute of the user
     * @return type of the user
     */
    public String getType() {
        return type;
    }

    /**
     * Set the type attribute of the user
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
}

