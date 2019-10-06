
package mFinanceProductInformation;

import java.util.ArrayList;


public class LoanList {


    private ArrayList<Loan> loanList;

    public LoanList() {
        //initialize loanlist
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
    }
    
}
