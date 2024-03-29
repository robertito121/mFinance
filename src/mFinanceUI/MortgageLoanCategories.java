
package mFinanceUI;

import java.awt.*;
import javax.swing.JLayeredPane;

/**
 *
 * @author julia
 */
public class MortgageLoanCategories extends javax.swing.JPanel {
    private JLayeredPane jLayeredPane;
    private String username;
    /**
     * Creates new form MortgageLoanCategories
     */
    public MortgageLoanCategories(JLayeredPane j, String user) {
        //jLabel1.setFont(new Font("TimesRoman", Font.PLAIN, 45));
        initComponents();
        setVisible(true);
        jLayeredPane = j;
        username = user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mortgageLoanRadioButtons = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        MortgageLoanBackButton = new javax.swing.JButton();
        MortgageLoanApplyButton = new javax.swing.JButton();
        FixedRateRadioButton = new javax.swing.JRadioButton();
        VariableRateRadioButton = new javax.swing.JRadioButton();
        FirstTimeBuyerRadioButton = new javax.swing.JRadioButton();
        VAMortgageRadioButton = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));

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
        MortgageLoanApplyButton.setText("Apply Now");
        MortgageLoanApplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MortgageLoanApplyButtonActionPerformed(evt);
            }
        });

        FixedRateRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        mortgageLoanRadioButtons.add(FixedRateRadioButton);
        FixedRateRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FixedRateRadioButton.setText("Fixed Rate 30/20/15 Year Loan");

        VariableRateRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        mortgageLoanRadioButtons.add(VariableRateRadioButton);
        VariableRateRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        VariableRateRadioButton.setText("Variable Rate Loan");

        FirstTimeBuyerRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        mortgageLoanRadioButtons.add(FirstTimeBuyerRadioButton);
        FirstTimeBuyerRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FirstTimeBuyerRadioButton.setText("First Time Buyer FHA Loan");

        VAMortgageRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        mortgageLoanRadioButtons.add(VAMortgageRadioButton);
        VAMortgageRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        VAMortgageRadioButton.setText("VA Mortgage Loan");
        VAMortgageRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VAMortgageRadioButtonActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("A great choice for buyers who want a stable monthly mortgage. \nDown Payment: 10%\nRates as low as 3.15%");
        jScrollPane1.setViewportView(jTextArea1);
        jTextArea1.setEditable(false);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("These loans begin with a low fixed interest rate for the initial term and then adjust according to an index\nDown Payment: 0 - 10%\nRates as low as 3.3%");
        jScrollPane2.setViewportView(jTextArea2);
        jTextArea1.setEditable(false);

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("Insured by the Federal Housing Administration and ideal for buyers looking for easier qualification and a low down \npayment option.\nDown Payment: 3.5%\nRates as low as 4.15%");
        jScrollPane3.setViewportView(jTextArea3);
        jTextArea1.setEditable(false);

        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setText("Use your Military benefits and apply for a mortgage with $0 down and no PMI required.  Rates starting at 2.85%");
        jScrollPane4.setViewportView(jTextArea4);
        jTextArea4.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MortgageLoanApplyButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(VAMortgageRadioButton)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(VariableRateRadioButton)
                        .addComponent(FirstTimeBuyerRadioButton)
                        .addComponent(FixedRateRadioButton)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(MortgageLoanBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(160, 160, 160)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(203, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(MortgageLoanBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(FixedRateRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(VariableRateRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(FirstTimeBuyerRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(VAMortgageRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(MortgageLoanApplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void MortgageLoanApplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MortgageLoanApplyButtonActionPerformed
        // TODO add your handling code here:
        ApplicationForm applicationForm = new ApplicationForm(jLayeredPane, username);
        if(FixedRateRadioButton.isSelected()){
           applicationForm.getjComboBoxLoanType().setSelectedIndex(11); 
        }
        if(VariableRateRadioButton.isSelected()){
           applicationForm.getjComboBoxLoanType().setSelectedIndex(12); 
        }
        if(FirstTimeBuyerRadioButton.isSelected()){
           applicationForm.getjComboBoxLoanType().setSelectedIndex(13); 
        }
        if(VAMortgageRadioButton.isSelected()){
           applicationForm.getjComboBoxLoanType().setSelectedIndex(14); 
        }
        jLayeredPane.removeAll();
        jLayeredPane.add(applicationForm);
        jLayeredPane.repaint();
        jLayeredPane.revalidate();
    }//GEN-LAST:event_MortgageLoanApplyButtonActionPerformed

    private void MortgageLoanBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MortgageLoanBackButtonActionPerformed
        // TODO add your handling code here:
        ProductUi productUI = new ProductUi(jLayeredPane, username);
        jLayeredPane.removeAll();
        jLayeredPane.add(productUI);
        jLayeredPane.repaint();
        jLayeredPane.revalidate();
    }//GEN-LAST:event_MortgageLoanBackButtonActionPerformed

    private void VAMortgageRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VAMortgageRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VAMortgageRadioButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton FirstTimeBuyerRadioButton;
    private javax.swing.JRadioButton FixedRateRadioButton;
    private javax.swing.JButton MortgageLoanApplyButton;
    private javax.swing.JButton MortgageLoanBackButton;
    private javax.swing.JRadioButton VAMortgageRadioButton;
    private javax.swing.JRadioButton VariableRateRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.ButtonGroup mortgageLoanRadioButtons;
    // End of variables declaration//GEN-END:variables
}
