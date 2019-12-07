/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mFinanceLoanManagement;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author gillj
 */
public class PaymentList {
    

    private HashMap<String, ArrayList<Payment>> paymentMap;
    private String PAYMENT_LIST_FILE_NAME = "paymentList.ser";
    
    public PaymentList() {
        paymentMap = new HashMap<String, ArrayList<Payment>>();
        this.readPaymentListFile();
    }

   /**
     * Get the value of loanList
     *
     * @return the value of loanList
     */
    public ArrayList<Payment> getPaymentList(String user) {
        ArrayList<Payment> payments = new ArrayList<Payment>();
        payments = paymentMap.get(user);
        return payments;
    }
    
     /**
     * Set the value of paymentList
     *
     * @param paymentList new value of loanList
     */
    public void addPaymentToList(Payment payment, String user) {
        ArrayList<Payment> paymentList = new ArrayList<Payment>();
        if (paymentMap.get(user) != null){
            paymentList = paymentMap.get(user);
        }
        paymentList.add(payment);
        paymentMap.put(user, paymentList);
        this.writePaymentListFile();       
    }

    /**
     * gets the Customer Map
     * @return HashMap</String, Payment> that yields Payment objects as values with customerId as
     * their corresponding keys
     */
    public HashMap<String, ArrayList<Payment>> getPaymentMap() {
        return paymentMap;
    }

    /**
     * sets the Customer Map
     * @param customersMap
     */
    public void setPaymentMap(HashMap<String, ArrayList<Payment>> paymentMap) {
        this.paymentMap = paymentMap;
    }
    
     private void readPaymentListFile() {
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(PAYMENT_LIST_FILE_NAME);
            in = new ObjectInputStream(fis);
            paymentMap = (HashMap<String, ArrayList<Payment>>) in.readObject();
            in.close();
        }
        catch (IOException | ClassNotFoundException exception) {
        }
    }

    public void writePaymentListFile() {
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(PAYMENT_LIST_FILE_NAME);
            out = new ObjectOutputStream(fos);
            out.writeObject(paymentMap);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
