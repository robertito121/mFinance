package mFinanceLoanManagement;


import java.io.Serializable;
import mFinanceUserInformation.Address;

public class Payment implements Serializable{

    //Payment: Loan_number, amount, account, type
    private String loanNumber;
    private double amount;
    private String chargeNumber;
    private PaymentConfirmation confirmation;


    /**
     * Constructor
     * @param loanNumber
     * @param paymentAmount
     */
    public Payment (String newLoanNumber, double newPaymentAmount, String newChargeNumber, PaymentConfirmation newConfirmation){
        loanNumber = newLoanNumber;
        amount = newPaymentAmount;
        chargeNumber = newChargeNumber;
        confirmation = newConfirmation;
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
    public String getLoanNumber() {
        return loanNumber;
    }

    /**
     * Set the loanNumber attribute of the user
     * @param loanNumber
     */
    public void setLoanNumber(String loanNumber) {
        this.loanNumber = loanNumber;
    }

    /**
     * Get the amount attribute of the user
     * @return amount of the user
     */
    public double getAmount() {
        System.out.println(amount);
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
     * @return the confirmation
     */
    public PaymentConfirmation getConfirmation() {
        return confirmation;
    }

    /**
     * @param confirmation the confirmation to set
     */
    public void setConfirmation(PaymentConfirmation confirmation) {
        this.confirmation = confirmation;
    }

}

