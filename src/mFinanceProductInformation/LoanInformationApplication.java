/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mFinanceProductInformation;

import java.util.Date;


public class LoanInformationApplication {
    
    private String loanType;
    private String proposedCollateral;
    private Date date;

    public LoanInformationApplication(String loanType, String proposedCollateral) {
        this.loanType = loanType;
        this.proposedCollateral = proposedCollateral;
    }

    /**
     * @return the loanType
     */
    public String getLoanType() {
        return loanType;
    }

    /**
     * @param loanType the loanType to set
     */
    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    /**
     * @return the proposedCollateral
     */
    public String getProposedCollateral() {
        return proposedCollateral;
    }

    /**
     * @param proposedCollateral the proposedCollateral to set
     */
    public void setProposedCollateral(String proposedCollateral) {
        this.proposedCollateral = proposedCollateral;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }
    
}
