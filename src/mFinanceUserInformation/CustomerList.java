package mFinanceUserInformation;

import java.util.ArrayList;
import java.util.HashMap;

public class CustomerList {

    private static HashMap<String, Customer> customersMap;

    /**
     * return a list of Customers given a set of customer Ids
     * @param ids
     * @return ArrayList</Customer> that yields Customer objects
     * @see Customer
     */
    public static ArrayList<Customer> getCustomersListById(String ... ids) {
        ArrayList<Customer> customers = new ArrayList<>();
        for (String id : ids) {
            customers.add(customersMap.get(id));
        }
        return customers;
    }

    /**
     * gets the Customer Map
     * @return HashMap</String, Customer> that yields Customer objects as values with customerId as
     * their corresponding keys
     */
    public static HashMap<String, Customer> getCustomersMap() {
        return customersMap;
    }

    /**
     * sets the Customer Map
     * @param customersMap
     */
    public static void setCustomersMap(HashMap<String, Customer> customersMap) {
        CustomerList.customersMap = customersMap;
    }
}
