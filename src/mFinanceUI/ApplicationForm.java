/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mFinanceUI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLayeredPane;
import mFinanceProductInformation.Loan;
import mFinanceProductInformation.LoanApplication;
import mFinanceProductInformation.LoanInformationApplication;
import mFinanceProductInformation.LoanList;
import mFinanceProductInformation.PersonalDataApplication;

/**
 *
 * @author Gonzales
 */
public class ApplicationForm extends javax.swing.JPanel {
    private JLayeredPane jLayeredPane;
    /**
     * Creates new form ApplicationForm
     */
    public ApplicationForm(JLayeredPane j) {
        initComponents();
        setVisible(true);
        jLayeredPane = j;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jLabel1 = new javax.swing.JLabel();
        jComboBoxLoanType = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldLoanAmount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldSocialSecurityNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldHouseholdIncome = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxPropertyOwnership = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxMaritalStatus = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldJobTitle = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldPlaceOfEmployment = new javax.swing.JTextField();
        jLabelProposedCollaterals = new javax.swing.JLabel();
        jTextFieldProposedCollaterals = new javax.swing.JTextField();
        jLabelDate = new javax.swing.JLabel();
        jTextFieldDateDay = new javax.swing.JTextField();
        jTextFieldDateMonth = new javax.swing.JTextField();
        jTextFieldDateYear = new javax.swing.JTextField();
        jCheckBoxSignature = new javax.swing.JCheckBox();
        SubmitLoanButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel1.setText("Personal Information");

        jComboBoxLoanType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Business – Term Loan", "Business – SBA Loan", "Business – Line Of Credit", "Business – Financing Loan", "Business – Merchant Cash Advances", "Auto – New Car Loan", "Auto – Used Car Loan", "Auto -Motorcycle/Boat", "Auto -Refinance Loan", "Student – Direct Subsidized", "Student – Direct Unsubsidized", "Student – Direct PLUS", "Student – Direct Consolidation", "Student – Private Student Loan", "Mortgage – Fixed Rate", "Mortgage – Variable Rate", "Mortgage – First Time Buyer", "Mortgage – VA Loan", "Personal – Fixed Rate", "Personal – Variable Rate", "Personal – Debt Consolidation", "Personal – Co-Sign", "Personal – Line of Credit" }));
        jComboBoxLoanType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLoanTypeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Loan Amount");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Loan Type");

        jTextFieldLoanAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLoanAmountActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Social Security Number");

        jTextFieldSocialSecurityNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSocialSecurityNumberActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel5.setText("Loan Aplication Form");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel6.setText("Loan Information");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Marital Status");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("HouseHold Income");

        jComboBoxPropertyOwnership.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sole Ownership", "Joint Tenancy", "Joint Tenancy with Survivorship", "Tenancy in Common", "Community Property" }));
        jComboBoxPropertyOwnership.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPropertyOwnershipActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Job Title");

        jComboBoxMaritalStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Widowed", "Divorced", "Separated" }));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Property Ownership");

        jTextFieldJobTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldJobTitleActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Place of Employment");

        jTextFieldPlaceOfEmployment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPlaceOfEmploymentActionPerformed(evt);
            }
        });

        jLabelProposedCollaterals.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelProposedCollaterals.setText("Proposed Collaterals");

        jTextFieldProposedCollaterals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProposedCollateralsActionPerformed(evt);
            }
        });

        jLabelDate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelDate.setText("Date (dd/mm/yyyy):");

        jTextFieldDateDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDateDayActionPerformed(evt);
            }
        });

        jTextFieldDateMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDateMonthActionPerformed(evt);
            }
        });

        jTextFieldDateYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDateYearActionPerformed(evt);
            }
        });

        jCheckBoxSignature.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jCheckBoxSignature.setText("Signature Check Box");

        SubmitLoanButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SubmitLoanButton.setText("Submit");
        SubmitLoanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitLoanButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxLoanType, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldLoanAmount)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabelProposedCollaterals)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldProposedCollaterals, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabelDate)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldDateDay, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldDateMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldDateYear, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 124, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(57, 57, 57))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldSocialSecurityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldJobTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                        .addComponent(jTextFieldPlaceOfEmployment))
                                    .addComponent(jTextFieldHouseholdIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBoxPropertyOwnership, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                                        .addComponent(jComboBoxMaritalStatus, javax.swing.GroupLayout.Alignment.LEADING, 0, 168, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBoxSignature)
                        .addGap(98, 98, 98))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(SubmitLoanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel5)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBoxLoanType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextFieldLoanAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelProposedCollaterals)
                                    .addComponent(jTextFieldProposedCollaterals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelDate)
                                    .addComponent(jTextFieldDateDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldDateMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldDateYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextFieldSocialSecurityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldHouseholdIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBoxMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBoxPropertyOwnership, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPlaceOfEmployment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jTextFieldJobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(40, 40, 40)
                        .addComponent(jCheckBoxSignature)
                        .addGap(42, 42, 42)
                        .addComponent(SubmitLoanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(38, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxLoanTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLoanTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxLoanTypeActionPerformed

    private void jTextFieldLoanAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLoanAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLoanAmountActionPerformed

    private void jTextFieldSocialSecurityNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSocialSecurityNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSocialSecurityNumberActionPerformed

    private void jComboBoxPropertyOwnershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPropertyOwnershipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPropertyOwnershipActionPerformed

    private void jTextFieldJobTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldJobTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldJobTitleActionPerformed

    private void jTextFieldPlaceOfEmploymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPlaceOfEmploymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPlaceOfEmploymentActionPerformed

    private void jTextFieldProposedCollateralsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProposedCollateralsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProposedCollateralsActionPerformed

    private void jTextFieldDateDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDateDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDateDayActionPerformed

    private void jTextFieldDateMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDateMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDateMonthActionPerformed

    private void jTextFieldDateYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDateYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDateYearActionPerformed

    private void SubmitLoanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitLoanButtonActionPerformed
        // TODO add your handling code here:
        
        //Making loanlist
        LoanList list = new LoanList();
        list.getLoanList();
        
        String loanType;
        loanType = jComboBoxLoanType.getSelectedItem().toString();
        
        String amountString;
        double amount;
        amountString = jTextFieldLoanAmount.getText();
        amount = Double.parseDouble(amountString);
        
        //making loan object
        Loan loan = new Loan(list.getLastLoanNumber(), loanType, amount, "Pending Approval");
        list.addLoan(loan);
        
        String collateral = jTextFieldProposedCollaterals.getText();
        String stringDate = jTextFieldDateDay.getText() + "/" + jTextFieldDateMonth.getText() + "/" +
                jTextFieldDateYear.getText();
        
        //making loan information object
        LoanInformationApplication loanInfo = new LoanInformationApplication(loanType, collateral);
        Date date;
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse(stringDate);
            loanInfo.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(ApplicationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        //making personal data object
        String socialSecurity = jTextFieldSocialSecurityNumber.getText();
        String income = jTextFieldHouseholdIncome.getText();
        String maritalStatus = jComboBoxMaritalStatus.getSelectedItem().toString();
        String propertyOwnership = jComboBoxPropertyOwnership.getSelectedItem().toString();
        String employment = jTextFieldPlaceOfEmployment.getText();
        String jobTitle = jTextFieldJobTitle.getText();
        
        PersonalDataApplication personalData = new PersonalDataApplication(socialSecurity, income, maritalStatus, propertyOwnership,employment
                , jobTitle);
        
        //creating loan application
        LoanApplication loanApplication = new LoanApplication(loan, amount, "Pending Approval", loanInfo, personalData);
        
        //code to add loan application to loan application list
        
        
        LoanCompleteForm loanCompleteForm = new LoanCompleteForm(jLayeredPane);
        jLayeredPane.removeAll();
        jLayeredPane.add(loanCompleteForm);
        jLayeredPane.repaint();
        jLayeredPane.revalidate();
    }//GEN-LAST:event_SubmitLoanButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SubmitLoanButton;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JCheckBox jCheckBoxSignature;
    private javax.swing.JComboBox<String> jComboBoxLoanType;
    private javax.swing.JComboBox<String> jComboBoxMaritalStatus;
    private javax.swing.JComboBox<String> jComboBoxPropertyOwnership;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelProposedCollaterals;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldDateDay;
    private javax.swing.JTextField jTextFieldDateMonth;
    private javax.swing.JTextField jTextFieldDateYear;
    private javax.swing.JTextField jTextFieldHouseholdIncome;
    private javax.swing.JTextField jTextFieldJobTitle;
    private javax.swing.JTextField jTextFieldLoanAmount;
    private javax.swing.JTextField jTextFieldPlaceOfEmployment;
    private javax.swing.JTextField jTextFieldProposedCollaterals;
    private javax.swing.JTextField jTextFieldSocialSecurityNumber;
    // End of variables declaration//GEN-END:variables
}
