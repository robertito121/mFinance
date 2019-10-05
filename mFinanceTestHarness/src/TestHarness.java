import mFinanceLoanManagement.Payment;
import mFinanceLoanManagement.PaymentConfirmation;
import mFinanceUserInformation.Address;

public class TestHarness {

    public static void testLoanPayment() {
        System.out.println("starting test for LoanPayment");
        System.out.println("Instantiating Payment object");
        Payment payment = new Payment(123456, 100.00);
        System.out.println(payment);
        System.out.println("Testing payLoanByAccountDebit");
        PaymentConfirmation accountDebitPaymentConfirmation = payment.payLoanByAccountDebit("123456", "123456");
        System.out.println("getting payment confirmation number and transaction date");
        System.out.println("Transaction date: " + accountDebitPaymentConfirmation.getTransactionDate() + " payment confirmation number: " + accountDebitPaymentConfirmation.getConfirmationNumber());
        if (!(accountDebitPaymentConfirmation == null)) {
            System.out.println("payLoanByAccountDebit test passed");
        }
        else {
            System.out.println("payLoanByAccountDebit test failed");
        }
        System.out.println("Testing payLoanByCard");
        Address billingAddress = new Address(1123, "testing street", "Testing city", "TS", 20152);
        PaymentConfirmation debitCardPaymentConfirmation = payment.payLoanByCard("Visa", "123456", "123", "03/2020", "Robert Gonzales", billingAddress);
        System.out.println("getting payment confirmation number and transaction date");
        System.out.println("Transaction date: " + debitCardPaymentConfirmation.getTransactionDate() + " payment confirmation number: " + debitCardPaymentConfirmation.getConfirmationNumber());
        if (!(debitCardPaymentConfirmation == null)) {
            System.out.println("payLoanByCard test passed");
        }
        else {
            System.out.println("payLoanByCard test failed");
        }
    }
}
