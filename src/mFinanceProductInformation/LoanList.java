
package mFinanceProductInformation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;


public class LoanList {
    
    private HashMap<String, ArrayList<Loan>> loanMap;
    private final String listOfLoans = "listOfLoans.ser";

    public LoanList() {
        loanMap = new HashMap<String, ArrayList<Loan>>();
        this.readLoanMapFile();
    }
    

    
    /**
     * Get the value of loanList
     *
     * @return the value of loanList
     */
    public ArrayList<Loan> getLoanList(String user) {
        ArrayList<Loan> loans = new ArrayList<Loan>();
        loans = loanMap.get(user);
        return loans;
    }

    /**
     * Set the value of loanList
     *
     * @param loanList new value of loanList
     */
    public void addLoan(String userId ,Loan loan) {
        ArrayList<Loan> loans = new ArrayList<Loan>();
        System.out.println("Loan Added to " + userId);
        if (loanMap.get(userId) != null){
            loans = loanMap.get(userId);
        }
        loans.add(loan);
        loanMap.put(userId, loans);
        this.writeLoanMapFile();
    }
    
     private void readLoanMapFile() {
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(listOfLoans);
            in = new ObjectInputStream(fis);
            setLoanMap((HashMap<String, ArrayList<Loan>>) in.readObject());
            in.close();
        } catch (IOException | ClassNotFoundException ex) {
        }
    }
    
    public void writeLoanMapFile() {
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(listOfLoans);
            out = new ObjectOutputStream(fos);
            out.writeObject(loanMap);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public int getLastLoanNumber(String userId) {
        int number;
        int index;
        Loan loan;
        ArrayList<Loan> loanList = new  ArrayList<Loan>();
        loanList = getLoanList(userId);
        System.out.println(loanList);
        if (loanList != null){
            index = loanList.size()-1;
            number = loanList.get(index).getLoanNumber()+1;            
        }
        else {
            number = 1;
        }
        return number;
    }
    


    /**
     * @return the loanMap
     */
    public HashMap<String, ArrayList<Loan>> getLoanMap() {
        return loanMap;
    }

    /**
     * @param loanMap the loanMap to set
     */
    public void setLoanMap(HashMap<String, ArrayList<Loan>> loanMap) {
        this.loanMap = loanMap;
    }
    
}
