package mFinanceLoanManagement;


import mFinanceUserInformation.Address;

public class Payment {

    //Payment: Loan_number, amount, account, type
    private int loanNumber;
    private double amount;


    /**
     * Constructor
     * @param loanNumber
     * @param paymentAmount
     */
    public Payment (int loanNumber, double paymentAmount){
        this.loanNumber = loanNumber;
        this.amount = amount;
    }

    /**
     * submits a payment using a bank account and returns a payment confirmation to the user
     * @param accountNumber
     * @param routingNumber
     * @return PaymentConfirmation object
     * @see
     */
    public PaymentConfirmation payLoanByAccountDebit(String accountNumber, String routingNumber) {

        PaymentConfirmation paymentConfirmation = null;
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        boolean isPaymentSubmitted = submitPayment(paymentProcessor);
        if (isPaymentSubmitted) {
            paymentConfirmation = new PaymentConfirmation();
        }
        return paymentConfirmation;

    }

    /**
     * submits a payment using a debit card and returns a payment confirmation to the user
     * @param cardType
     * @param cardNumber
     * @param cvvNumber
     * @param expirationDate
     * @param nameOnCard
     * @param billingAddress
     * @return PaymentConfirmation object
     */
    public PaymentConfirmation payLoanByCard(String cardType, String cardNumber, String cvvNumber, String expirationDate, String nameOnCard, Address billingAddress) {

        PaymentConfirmation paymentConfirmation = null;
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        boolean isPaymentSubmitted = submitPayment(paymentProcessor);
        if (isPaymentSubmitted) {
             paymentConfirmation = new PaymentConfirmation();
        }
        return paymentConfirmation;
    }

    /**
     * submits the actual payment
     * @param payment
     * @return boolean
     */
    public boolean submitPayment(PaymentProcessor payment) {

        return true;

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

}

