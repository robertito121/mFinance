
public class Main {

    public static void main(String[] args) {
        System.out.println("Running TestHarness");
        TestHarness.testAuthentication();
        TestHarness.testLoanApplication();
        TestHarness.testLoanStatusChange();
        TestHarness.testLoanDistribution();
        TestHarness.testLoanPayment();


    }
}
