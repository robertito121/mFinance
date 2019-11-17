
package mFinanceProductInformation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class LoanList {


    private ArrayList<Loan> loanList;
    private final String listOfLoans = "listOfLoans.ser";

    public LoanList() {
        //initialize loanlist
        loanList = new ArrayList<>();
         this.readLoanListFile();
        if (loanList.isEmpty()) {
            initializeList();
        }
    }
    
     public void initializeList() {
         Loan testData = new Loan(0, "Test", 4321.00);
         loanList.add(testData);
     }

    
    /**
     * Get the value of loanList
     *
     * @return the value of loanList
     */
    public ArrayList<Loan> getLoanList() {
        return loanList;
    }

    /**
     * Set the value of loanList
     *
     * @param loanList new value of loanList
     */
    public void addLoan(Loan loan) {
        loanList.add(loan);
        writeLoanListFile();
    }
    
     private void readLoanListFile() {
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(listOfLoans);
            in = new ObjectInputStream(fis);
            loanList = (ArrayList<Loan>) in.readObject();
            in.close();
            if (!loanList.isEmpty()) {
            }
        } catch (IOException | ClassNotFoundException ex) {
        }
    }
    
    public void writeLoanListFile() {
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(listOfLoans);
            out = new ObjectOutputStream(fos);
            out.writeObject(loanList);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
