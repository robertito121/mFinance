
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import mFinanceUserInformation.Customer;
import mFinanceUserInformation.CustomerList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gonzales
 */
public class ObjectListSingleTon implements Serializable {
    
    private final String CUSTOMER_LIST_FILE_NAME = "customerList.ser";
    private final String EMPLOYEE_LIST_FILE_NAME = "employeesList.ser";
    
    public ObjectListSingleTon() {
        Map<String, Customer> customerMap = CustomerList.getCustomersMap();
        readUserListFile(CUSTOMER_LIST_FILE_NAME, customerMap);  
    }
   
   private void readUserListFile(String fileName, Object object) {
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(fileName);
            in = new ObjectInputStream(fis);
            object = (object.getClass()); in.readObject();
            in.close();
        }
        catch (IOException | ClassNotFoundException exception) {
        } 
    }
   
   public void writeUserListFile(String fileName, Object object) {
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(fileName);
            out = new ObjectOutputStream(fos);
            out.writeObject(object);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
