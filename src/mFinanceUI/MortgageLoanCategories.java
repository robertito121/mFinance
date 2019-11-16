
package mFinanceUI;

import java.awt.*;
import javax.swing.JLayeredPane;

/**
 *
 * @author julia
 */
public class MortgageLoanCategories extends javax.swing.JPanel {
    private JLayeredPane jLayeredPane;
    /**
     * Creates new form MortgageLoanCategories
     */
    public MortgageLoanCategories(JLayeredPane j) {
        //jLabel1.setFont(new Font("TimesRoman", Font.PLAIN, 45));
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

        jLabel1 = new javax.swing.JLabel();
        MortgageLoanBackButton = new javax.swing.JButton();
        MortgageLoanApplyButton = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Mortgage Loan");

        MortgageLoanBackButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MortgageLoanBackButton.setText("Back");
        MortgageLoanBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MortgageLoanBackButtonActionPerformed(evt);
            }
        });

        MortgageLoanApplyButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MortgageLoanApplyButton.setText("Apply");
        MortgageLoanApplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MortgageLoanApplyButtonActionPerformed(evt);
            }
        });

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton1.setText("Fixed Rate 30/20/15 Year Loan");

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton2.setText("Variable Rate Loan");

        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton3.setText("First Time Buyer FHA Loan");

        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton4.setText("VA Mortgage Loan");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MortgageLoanBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(239, 239, 239)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(320, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MortgageLoanApplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(MortgageLoanBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addComponent(jRadioButton1)
                .addGap(47, 47, 47)
                .addComponent(jRadioButton2)
                .addGap(55, 55, 55)
                .addComponent(jRadioButton3)
                .addGap(57, 57, 57)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(MortgageLoanApplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void MortgageLoanApplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MortgageLoanApplyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MortgageLoanApplyButtonActionPerformed

    private void MortgageLoanBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MortgageLoanBackButtonActionPerformed
        // TODO add your handling code here:
        ProductUi productUI = new ProductUi(jLayeredPane);
        jLayeredPane.removeAll();
        jLayeredPane.add(productUI);
        jLayeredPane.repaint();
        jLayeredPane.revalidate();
    }//GEN-LAST:event_MortgageLoanBackButtonActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MortgageLoanApplyButton;
    private javax.swing.JButton MortgageLoanBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables
}
