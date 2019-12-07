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
    private String username;
    /**
     * Creates new form PersonalLoanCategories
     */
    public PersonalLoanCategories(JLayeredPane j, String user) {
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

        personalLoanRadioButtons = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        personalLineOfCreditLoanApplyButton = new javax.swing.JButton();
        FixedRateRadioButton = new javax.swing.JRadioButton();
        VariableRateRadioButton = new javax.swing.JRadioButton();
        DebtConsolidationRadioButton = new javax.swing.JRadioButton();
        CoSignRadioButton = new javax.swing.JRadioButton();
        LineOfCreditRadioButton = new javax.swing.JRadioButton();
        PersonalLoanBackButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();

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

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Fixed APR: 5.99% - 25.99%\nVariable APR: 5.25% - 21.25%\nLoan Term: 12 - 84 months\nMin Credit Score: 660");
        jScrollPane1.setViewportView(jTextArea1);
        jTextArea1.setEditable(false);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("APR;: 5.99% - 22.99%\nLoan Term: 6 - 84 months\nMax Loan: $100,000");
        jScrollPane2.setViewportView(jTextArea2);
        jTextArea2.setEditable(false);

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("Current APR;: 5.25%\nLoan Term: 12 - 84 months\nMax Loan: $100,000");
        jScrollPane3.setViewportView(jTextArea3);
        jTextArea3.setEditable(false);

        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setText("Fixed APR: 5.99% - 25.99%\nVariable APR: 5.25% - 21.25%\nLoan Term: 24 - 84 months\n");
        jScrollPane4.setViewportView(jTextArea4);
        jTextArea4.setEditable(false);

        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea5.setRows(5);
        jTextArea5.setText("Only pay for what you use, rates starting at 8.35%");
        jScrollPane5.setViewportView(jTextArea5);
        jTextArea5.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(PersonalLoanBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FixedRateRadioButton)
                            .addComponent(VariableRateRadioButton)
                            .addComponent(DebtConsolidationRadioButton)
                            .addComponent(CoSignRadioButton)
                            .addComponent(LineOfCreditRadioButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(personalLineOfCreditLoanApplyButton)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(PersonalLoanBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(FixedRateRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(VariableRateRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DebtConsolidationRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(CoSignRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LineOfCreditRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(personalLineOfCreditLoanApplyButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void personalLineOfCreditLoanApplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalLineOfCreditLoanApplyButtonActionPerformed
        // TODO add your handling code here:
        ApplicationForm applicationForm = new ApplicationForm(jLayeredPane, username);
         if(FixedRateRadioButton.isSelected()){
           applicationForm.getjComboBoxLoanType().setSelectedIndex(15); 
        }
        if(LineOfCreditRadioButton.isSelected()){
           applicationForm.getjComboBoxLoanType().setSelectedIndex(19); 
        }
        if(CoSignRadioButton.isSelected()){
           applicationForm.getjComboBoxLoanType().setSelectedIndex(18); 
        }
        if(DebtConsolidationRadioButton.isSelected()){
           applicationForm.getjComboBoxLoanType().setSelectedIndex(17); 
        }
        if(VariableRateRadioButton.isSelected()){
           applicationForm.getjComboBoxLoanType().setSelectedIndex(16); 
        }
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
        ProductUi productUI = new ProductUi(jLayeredPane, username);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JButton personalLineOfCreditLoanApplyButton;
    private javax.swing.ButtonGroup personalLoanRadioButtons;
    // End of variables declaration//GEN-END:variables
}
