/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mFinanceUI;

import java.util.ArrayList;
import javax.swing.JLayeredPane;
import javax.swing.table.DefaultTableModel;
import mFinanceLoanManagement.Payment;
import mFinanceLoanManagement.PaymentList;
import mFinanceUserInformation.Customer;

/**
 *
 * @author gillj
 */
public class PaymentUi extends javax.swing.JPanel {

    String user;

    /**
     * Creates new form PaymentUi
     */
    public PaymentUi(JLayeredPane j , String username) {
        initComponents();
        user = username;
        addRowToJTable();
    }
    
    
        public void addRowToJTable() {
        DefaultTableModel model = (DefaultTableModel) loansTable.getModel();
        PaymentList paymentList = new PaymentList();
        ArrayList<Payment> list = paymentList.getPaymentList(user);
        Object[] rowData = new Object[4];
        if(list != null){
            for(int i = 0; i < list.size(); i++) {
                rowData[0] = list.get(i).getLoanNumber(); 
                rowData[1] = "$"+list.get(i).getAmount();
                rowData[2] = list.get(i).getConfirmation().getTransactionDate();
                rowData[3] = list.get(i).getConfirmation().getConfirmationNumber();
                model.addRow(rowData);
            }
        }
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
        paymentsTableJScrollPane = new javax.swing.JScrollPane();
        loansTable = new javax.swing.JTable();

        setBackground(java.awt.Color.white);

        paymentsLabel.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        paymentsLabel.setText("Payments");

        loansTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Loan Number", "Amount", "Date", "Confirmation Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        loansTable.getTableHeader().setReorderingAllowed(false);
        paymentsTableJScrollPane.setViewportView(loansTable);
        if (loansTable.getColumnModel().getColumnCount() > 0) {
            loansTable.getColumnModel().getColumn(0).setResizable(false);
            loansTable.getColumnModel().getColumn(1).setResizable(false);
            loansTable.getColumnModel().getColumn(2).setResizable(false);
            loansTable.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(paymentsTableJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(paymentsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(paymentsLabel)
                .addGap(18, 18, 18)
                .addComponent(paymentsTableJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable loansTable;
    private javax.swing.JLabel paymentsLabel;
    private javax.swing.JScrollPane paymentsTableJScrollPane;
    // End of variables declaration//GEN-END:variables
}
