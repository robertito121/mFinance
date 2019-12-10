/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mFinanceUI;
import javax.swing.JLayeredPane;
import mFinanceLoanManagement.Payment;
import mFinanceLoanManagement.PaymentConfirmation;
import mFinanceLoanManagement.PaymentList;
import mFinanceProductInformation.Loan;

/**
 *
 * @author Parker
 */

public class PaymentForm extends javax.swing.JPanel {
    private JLayeredPane jLayeredPane;
    private String userID;
    private Loan loan;
    private Payment payment;
    private PaymentList paymentList;
    /**
     * Creates new form PaymentForm
     */
    public PaymentForm(JLayeredPane j, String userID, Loan newLoan) {
        initComponents();
        setVisible(true);
        jLayeredPane = j;
        this.userID = userID;
        paymentList = new PaymentList();
        loan = newLoan;
        loanNumberTextField.setText(loan.getLoanNumber()+"");
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paymentsLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        loanNumberTextField = new javax.swing.JTextField();
        firstNameLabel1 = new javax.swing.JLabel();
        paymentAmountTextField = new javax.swing.JTextField();
        firstNameLabel2 = new javax.swing.JLabel();
        chargeNumberTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();

        paymentsLabel.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        paymentsLabel.setText("Payment Form");

        firstNameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        firstNameLabel.setText("Loan Number:");

        firstNameLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        firstNameLabel1.setText("Payment Amount:");

        firstNameLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        firstNameLabel2.setText("Charge Account Number: ");

        chargeNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chargeNumberTextFieldActionPerformed(evt);
            }
        });

        submitButton.setText("Submit Payment");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(paymentsLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(firstNameLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(paymentAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(firstNameLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(chargeNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(169, 169, 169)
                                    .addComponent(submitButton)
                                    .addGap(177, 177, 177)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(firstNameLabel)
                                .addGap(18, 18, 18)
                                .addComponent(loanNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paymentsLabel)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(loanNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel1)
                    .addComponent(paymentAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel2)
                    .addComponent(chargeNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submitButton)
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chargeNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chargeNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chargeNumberTextFieldActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        PaymentConfirmation confirmation = new PaymentConfirmation();
        String loanNumber = loanNumberTextField.getText();
        String paymentAmount = paymentAmountTextField.getText();
        String chargeNumber = chargeNumberTextField.getText();
        double paymentAmountNumber = Double.parseDouble(paymentAmount);
        payment = new Payment(loanNumber, paymentAmountNumber, chargeNumber, confirmation);
        paymentList.addPaymentToList(payment, userID);
    }//GEN-LAST:event_submitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField chargeNumberTextField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel firstNameLabel1;
    private javax.swing.JLabel firstNameLabel2;
    private javax.swing.JTextField loanNumberTextField;
    private javax.swing.JTextField paymentAmountTextField;
    private javax.swing.JLabel paymentsLabel;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
