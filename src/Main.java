
import java.util.Map;
import mFinanceUI.LoginUI;
import mFinanceUserInformation.Address;
import mFinanceUserInformation.Customer;
import mFinanceUserInformation.CustomerList;
import mFinanceUserInformation.User;
import mFinanceUserInformation.UserCredentials;

public class Main {

    public static void main(String[] args) {
        LoginUI loginUI = new LoginUI();
        loginUI.setVisible(true);
        Address address = new Address(12345, "test street", "test city", "test state", 12445);
        String userId = "testuser";
        UserCredentials credentials = new UserCredentials(userId, "password");
        Customer customer = new Customer("Testing", "User", userId, address, "123456789", "testemail@testemail.com", credentials);
        CustomerList.addCustomerToList(customer);
        ObjectListSingleTon database = new ObjectListSingleTon();
        System.out.println(CustomerList.getCustomersMap());
    }
}
