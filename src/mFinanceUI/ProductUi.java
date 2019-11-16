/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mFinanceUI;

import javax.swing.JLayeredPane;

/**
 *
 * @author Joey
 */
public class ProductUi extends javax.swing.JPanel {

    private JLayeredPane jLayeredPane1;
    /**
     * Creates new form ProductUi
     */
    public ProductUi(JLayeredPane j) {
        
        initComponents();
        setVisible(true);
        jLayeredPane1 = j;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        businessButton = new javax.swing.JButton();
        vehicleButton = new javax.swing.JButton();
        studentButton = new javax.swing.JButton();
        mortgageButton = new javax.swing.JButton();
        personalButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        businessButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        businessButton.setText("Business");
        businessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                businessButtonActionPerformed(evt);
            }
        });

        vehicleButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        vehicleButton.setText("Vehicle");
        vehicleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleButtonActionPerformed(evt);
            }
        });

        studentButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        studentButton.setText("Student");
        studentButton.setMaximumSize(new java.awt.Dimension(100, 29));
        studentButton.setMinimumSize(new java.awt.Dimension(100, 29));
        studentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentButtonActionPerformed(evt);
            }
        });

        mortgageButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        mortgageButton.setText("Mortgage");
        mortgageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mortgageButtonActionPerformed(evt);
            }
        });

        personalButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        personalButton.setText("Personal");
        personalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Loan Type");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(businessButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vehicleButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mortgageButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(personalButton)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(217, 217, 217))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(businessButton)
                    .addComponent(vehicleButton)
                    .addComponent(studentButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mortgageButton)
                    .addComponent(personalButton))
                .addContainerGap(196, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void personalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalButtonActionPerformed
        // TODO add your handling code here:
        PersonalLoanCategories personalPanel = new PersonalLoanCategories(jLayeredPane1);
        jLayeredPane1.removeAll();
        jLayeredPane1.add(personalPanel);
        jLayeredPane1.repaint();
        jLayeredPane1.revalidate();
    }//GEN-LAST:event_personalButtonActionPerformed

    private void businessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_businessButtonActionPerformed
        // TODO add your handling code here:
        BusinessLoanCategories businessPanel = new BusinessLoanCategories(jLayeredPane1);
        jLayeredPane1.removeAll();
        jLayeredPane1.add(businessPanel);
        jLayeredPane1.repaint();
        jLayeredPane1.revalidate();
    }//GEN-LAST:event_businessButtonActionPerformed

    private void vehicleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleButtonActionPerformed
        // TODO add your handling code here:
        AutoLoanCategories auto = new AutoLoanCategories(jLayeredPane1);
        jLayeredPane1.removeAll();
        jLayeredPane1.add(auto);
        jLayeredPane1.repaint();
        jLayeredPane1.revalidate();
    }//GEN-LAST:event_vehicleButtonActionPerformed

    private void studentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentButtonActionPerformed
        // TODO add your handling code here:
        StudentLoanCategories studentPanel = new StudentLoanCategories(jLayeredPane1);
        jLayeredPane1.removeAll();
        jLayeredPane1.add(studentPanel);
        jLayeredPane1.repaint();
        jLayeredPane1.revalidate();
    }//GEN-LAST:event_studentButtonActionPerformed

    private void mortgageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mortgageButtonActionPerformed
        // TODO add your handling code here:
        MortgageLoanCategories mortgage = new MortgageLoanCategories( jLayeredPane1);
        jLayeredPane1.removeAll();
        jLayeredPane1.add(mortgage);
        jLayeredPane1.repaint();
        jLayeredPane1.revalidate();
    }//GEN-LAST:event_mortgageButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton businessButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mortgageButton;
    private javax.swing.JButton personalButton;
    private javax.swing.JButton studentButton;
    private javax.swing.JButton vehicleButton;
    // End of variables declaration//GEN-END:variables
}