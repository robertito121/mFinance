package mFinanceUserInformation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class CustomerList {

    private HashMap<String, Customer> customersMap;
    private final String USERS_LIST_FILE_NAME = "customerList.ser";
    
    public CustomerList() {
        customersMap = new HashMap<String, Customer>();
        this.readUserListFile();
    }

    /**
     * return a list of Customers given a set of customer Ids
     * @param ids
     * @return ArrayList</Customer> that yields Customer objects
     * @see Customer
     */
    public ArrayList<Customer> getCustomersListById(String ... ids) {
        ArrayList<Customer> customers = new ArrayList<>();
        for (String id : ids) {
            customers.add(customersMap.get(id));
        }
        return customers;
    }
    
    public void addCustomerToList(Customer customer) {
        customersMap.put(customer.getCustomerId(), customer);
        this.writeUserListFile();
        
        
    }

    /**
     * gets the Customer Map
     * @return HashMap</String, Customer> that yields Customer objects as values with customerId as
     * their corresponding keys
     */
    public HashMap<String, Customer> getCustomersMap() {
        return customersMap;
    }

    /**
     * sets the Customer Map
     * @param customersMap
     */
    public void setCustomersMap(HashMap<String, Customer> customersMap) {
        customersMap = customersMap;
    }
    
     private void readUserListFile() {
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(USERS_LIST_FILE_NAME);
            in = new ObjectInputStream(fis);
            customersMap = (HashMap<String, Customer>) in.readObject();
            in.close();
        }
        catch (IOException | ClassNotFoundException exception) {
        }
    }

    public void writeUserListFile() {
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(USERS_LIST_FILE_NAME);
            out = new ObjectOutputStream(fos);
            out.writeObject(customersMap);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
