import mFinanceLoanManagement.Payment;
import mFinanceLoanManagement.PaymentConfirmation;
import mFinanceProductInformation.Loan;
import mFinanceProductInformation.LoanApplication;
import mFinanceUserInformation.Address;
import mFinanceProductInformation.LoanDistribution;
import mFinanceUserInformation.Authentication;

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
        System.out.println();
    }
    public static void testAuthentication(){
        Authentication user1 = new Authentication("jsmith","p@55word1");
        System.out.println("Running Authentication Test....");
        System.out.println("Test User Name");
        System.out.println(user1.getUserName());
        System.out.println("Test Password");
        System.out.println(user1.getPassword());
        if(user1.getUserName() == null || user1.getPassword() == null){
            System.out.println("Authentication Test Failed");
        }
        else{
            System.out.println("Authentication Test Passed");

        }
        System.out.println();
    }

     public static void testLoanApplication(){
        Loan loan1 = new Loan("Auto",1351354931);
        LoanApplication loanApp1 = new LoanApplication(loan1,25000.00,"Approved");
        System.out.println("Running Loan Application Test......");
        System.out.println("Test Loan Type");
        System.out.println(loanApp1.getLoan().getLoanType());
        System.out.println("Test Loan Number");
        System.out.println(loanApp1.getLoan().getLoanNumber());
        System.out.println("Test Loan Amount");
        System.out.println(loanApp1.getAmount());
        System.out.println("Test Loan Status");
        System.out.println(loanApp1.getStatus());
       if(loanApp1.getLoan().getLoanType() == null || loanApp1.getLoan().getLoanNumber() < 1 || loanApp1.getAmount() == null ||loanApp1.getStatus() == null){
           System.out.println("Loan Application Test Failed");
       }
       else{
           System.out.println("Loan Application Test Passed");

       }
       System.out.println();
    }
    
    public static void testLoanStatusChange() {
        System.out.println("starting test for LoanStatusChange");
        System.out.println("Instantiating Loan object");
        Loan loan1 = new Loan("Auto",1351354931);
        System.out.println("Instantiating LoanApplication object");
        LoanApplication loanApp1 = new LoanApplication(loan1,25000.00,"Approved");
        System.out.println("Testing loan status change from Approved to Pending");
        loanApp1.setStatus("Pending");
        if(loanApp1.getStatus()=="Pending"){
            System.out.println("Loan Status Change Test Passed");
        }
        else{
            System.out.println("Loan Status Change Test Failed");
        }
        System.out.println();
    }
    
    public static void testLoanDistribution() {
        System.out.println("starting test for LoanDistribution");
        System.out.println("Instantiating LoanDistribution object");     
        LoanDistribution loanDistribution = new LoanDistribution(1234, "1a4", "pending");
        System.out.println(loanDistribution);
        System.out.println("Testing loan distribution");
        loanDistribution.distributeLoan();
        System.out.println("Distribution account: " + loanDistribution.getDistributionAccount());
        System.out.println("Loan Status: " + loanDistribution.getStatus());
        
        if (loanDistribution.distributionConfirmation() && loanDistribution.getStatus().equalsIgnoreCase("active")) {
            System.out.println("LoanDistribution test passed");
        }
        else {
            System.out.println("LoanDistribution test failed");
        }
        System.out.println();
    }
}
