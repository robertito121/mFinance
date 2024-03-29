/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mFinanceUI;

/**
 *
 * @author Parker
 */
import javax.swing.JLayeredPane;
public class StudentLoanCategories extends javax.swing.JPanel {
    private JLayeredPane jLayeredPane;
    private String username;
    /**
     * Creates new form StudentLoansCategories
     */
    public StudentLoanCategories(JLayeredPane j, String user) {
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

        studentLoanRadioButtons = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        privateStudentLoanApplyButton = new javax.swing.JButton();
        RefinanceStudentLoanRadioButton = new javax.swing.JRadioButton();
        PrivateStudentRadioButton = new javax.swing.JRadioButton();
        StudentLoanBackButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Student Loans");
        jLabel2.setAlignmentY(0.0F);
        jLabel2.setFocusable(false);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        privateStudentLoanApplyButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        privateStudentLoanApplyButton.setText("Apply Now");
        privateStudentLoanApplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                privateStudentLoanApplyButtonActionPerformed(evt);
            }
        });

        RefinanceStudentLoanRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        studentLoanRadioButtons.add(RefinanceStudentLoanRadioButton);
        RefinanceStudentLoanRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RefinanceStudentLoanRadioButton.setText("Refinance Student Loans");
        RefinanceStudentLoanRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefinanceStudentLoanRadioButtonActionPerformed(evt);
            }
        });

        PrivateStudentRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        studentLoanRadioButtons.add(PrivateStudentRadioButton);
        PrivateStudentRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PrivateStudentRadioButton.setText("Private Student Loan");
        PrivateStudentRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrivateStudentRadioButtonActionPerformed(evt);
            }
        });

        StudentLoanBackButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        StudentLoanBackButton.setText("Back");
        StudentLoanBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentLoanBackButtonActionPerformed(evt);
            }
        });

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("Already graduated? Save time and money by refinancing and consolidating your existing federal and private \nstudent loans\nVariable Rates as low as 3.39% APR\nFixed Rates as low as 4.29% APR");
        jScrollPane3.setViewportView(jTextArea3);
        jTextArea3.setEditable(false);

        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea5.setRows(5);
        jTextArea5.setText("Looking for additional funding for school? Finance your education with a private student loan.\nVariable Rates as low as 4.89% APR\nFixed Rates as low as 5.99% APR");
        jScrollPane5.setViewportView(jTextArea5);
        jTextArea5.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(StudentLoanBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PrivateStudentRadioButton)
                            .addComponent(RefinanceStudentLoanRadioButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(202, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(privateStudentLoanApplyButton)
                .addGap(227, 227, 227))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StudentLoanBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(PrivateStudentRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(RefinanceStudentLoanRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(privateStudentLoanApplyButton)
                .addContainerGap(526, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void privateStudentLoanApplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_privateStudentLoanApplyButtonActionPerformed
        // TODO add your handling code here:
        ApplicationForm applicationForm = new ApplicationForm(jLayeredPane, username);
        if(PrivateStudentRadioButton.isSelected()){
           applicationForm.getjComboBoxLoanType().setSelectedIndex(10); 
        }
        if(RefinanceStudentLoanRadioButton.isSelected()){
           applicationForm.getjComboBoxLoanType().setSelectedIndex(9); 
        }
        jLayeredPane.removeAll();
        jLayeredPane.add(applicationForm);
        jLayeredPane.repaint();
        jLayeredPane.revalidate();
    }//GEN-LAST:event_privateStudentLoanApplyButtonActionPerformed

    private void RefinanceStudentLoanRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefinanceStudentLoanRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RefinanceStudentLoanRadioButtonActionPerformed

    private void PrivateStudentRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrivateStudentRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrivateStudentRadioButtonActionPerformed

    private void StudentLoanBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentLoanBackButtonActionPerformed
        // TODO add your handling code here:
        ProductUi productUI = new ProductUi(jLayeredPane, username);
        jLayeredPane.removeAll();
        jLayeredPane.add(productUI);
        jLayeredPane.repaint();
        jLayeredPane.revalidate();
    }//GEN-LAST:event_StudentLoanBackButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton PrivateStudentRadioButton;
    private javax.swing.JRadioButton RefinanceStudentLoanRadioButton;
    private javax.swing.JButton StudentLoanBackButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JButton privateStudentLoanApplyButton;
    private javax.swing.ButtonGroup studentLoanRadioButtons;
    // End of variables declaration//GEN-END:variables
}
