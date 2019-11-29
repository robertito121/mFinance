/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * https://www.nerdwallet.com/blog/loans/personal-loan-types/
 */
package mFinanceUI;

/**
 *
 * @author Parker
 */
import javax.swing.JLayeredPane;
public class PersonalLoanCategories extends javax.swing.JPanel {
    private JLayeredPane jLayeredPane;
    /**
     * Creates new form PersonalLoanCategories
     */
    public PersonalLoanCategories(JLayeredPane j) {
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

        personalLoanRadioButtons = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        personalLineOfCreditLoanApplyButton = new javax.swing.JButton();
        FixedRateRadioButton = new javax.swing.JRadioButton();
        VariableRateRadioButton = new javax.swing.JRadioButton();
        DebtConsolidationRadioButton = new javax.swing.JRadioButton();
        CoSignRadioButton = new javax.swing.JRadioButton();
        LineOfCreditRadioButton = new javax.swing.JRadioButton();
        PersonalLoanBackButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(600, 600));
        setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Personal Loans");
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        personalLineOfCreditLoanApplyButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        personalLineOfCreditLoanApplyButton.setText("Apply Now");
        personalLineOfCreditLoanApplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalLineOfCreditLoanApplyButtonActionPerformed(evt);
            }
        });

        FixedRateRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        personalLoanRadioButtons.add(FixedRateRadioButton);
        FixedRateRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FixedRateRadioButton.setText("Fixed-Rate Loan");
        FixedRateRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FixedRateRadioButtonActionPerformed(evt);
            }
        });

        VariableRateRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        personalLoanRadioButtons.add(VariableRateRadioButton);
        VariableRateRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        VariableRateRadioButton.setText("Variable-Rate Loan");

        DebtConsolidationRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        personalLoanRadioButtons.add(DebtConsolidationRadioButton);
        DebtConsolidationRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DebtConsolidationRadioButton.setText("Debt Consolidation Loan");

        CoSignRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        personalLoanRadioButtons.add(CoSignRadioButton);
        CoSignRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CoSignRadioButton.setText("Co-Sign Loan");

        LineOfCreditRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        personalLoanRadioButtons.add(LineOfCreditRadioButton);
        LineOfCreditRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LineOfCreditRadioButton.setText("Personal Line of Credit");

        PersonalLoanBackButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PersonalLoanBackButton.setText("Back");
        PersonalLoanBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonalLoanBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FixedRateRadioButton)
                            .addComponent(VariableRateRadioButton)
                            .addComponent(DebtConsolidationRadioButton)
                            .addComponent(CoSignRadioButton)
                            .addComponent(LineOfCreditRadioButton))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PersonalLoanBackButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(personalLineOfCreditLoanApplyButton)
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(PersonalLoanBackButton))
                .addGap(34, 34, 34)
                .addComponent(FixedRateRadioButton)
                .addGap(48, 48, 48)
                .addComponent(VariableRateRadioButton)
                .addGap(54, 54, 54)
                .addComponent(DebtConsolidationRadioButton)
                .addGap(45, 45, 45)
                .addComponent(CoSignRadioButton)
                .addGap(52, 52, 52)
                .addComponent(LineOfCreditRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 451, Short.MAX_VALUE)
                .addComponent(personalLineOfCreditLoanApplyButton)
                .addGap(72, 72, 72))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void personalLineOfCreditLoanApplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalLineOfCreditLoanApplyButtonActionPerformed
        // TODO add your handling code here:
        ApplicationForm applicationForm = new ApplicationForm(jLayeredPane);
        jLayeredPane.removeAll();
        jLayeredPane.add(applicationForm);
        jLayeredPane.repaint();
        jLayeredPane.revalidate();
    }//GEN-LAST:event_personalLineOfCreditLoanApplyButtonActionPerformed

    private void FixedRateRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FixedRateRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FixedRateRadioButtonActionPerformed

    private void PersonalLoanBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonalLoanBackButtonActionPerformed
        // TODO add your handling code here:
        ProductUi productUI = new ProductUi(jLayeredPane);
        jLayeredPane.removeAll();
        jLayeredPane.add(productUI);
        jLayeredPane.repaint();
        jLayeredPane.revalidate();
    }//GEN-LAST:event_PersonalLoanBackButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton CoSignRadioButton;
    private javax.swing.JRadioButton DebtConsolidationRadioButton;
    private javax.swing.JRadioButton FixedRateRadioButton;
    private javax.swing.JRadioButton LineOfCreditRadioButton;
    private javax.swing.JButton PersonalLoanBackButton;
    private javax.swing.JRadioButton VariableRateRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton personalLineOfCreditLoanApplyButton;
    private javax.swing.ButtonGroup personalLoanRadioButtons;
    // End of variables declaration//GEN-END:variables
}
