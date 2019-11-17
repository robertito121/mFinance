/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mFinanceUI;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.Border;
import javax.swing.plaf.BorderUIResource;

/**
 *
 * @author Gonzales
 */
public class MainUI extends javax.swing.JFrame {

    /**
     * Creates new form MainUI
     */
    public MainUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        productPanel = new javax.swing.JPanel();
        sideBarPanel = new javax.swing.JPanel();
        myProfileButton = new javax.swing.JLabel();
        myLoansButton = new javax.swing.JLabel();
        paymentsButton = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        loanProductsMenu = new javax.swing.JMenu();
        viewProductsMenyItem = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Callisto mFinance System");

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setOpaque(true);
        jLayeredPane1.setLayout(new java.awt.CardLayout());

        productPanel.setBackground(new java.awt.Color(255, 255, 255));
        productPanel.setOpaque(false);

        javax.swing.GroupLayout productPanelLayout = new javax.swing.GroupLayout(productPanel);
        productPanel.setLayout(productPanelLayout);
        productPanelLayout.setHorizontalGroup(
            productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 855, Short.MAX_VALUE)
        );
        productPanelLayout.setVerticalGroup(
            productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
        );

        jLayeredPane1.add(productPanel, "card2");

        sideBarPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        myProfileButton.setBackground(new java.awt.Color(204, 204, 204));
        myProfileButton.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        myProfileButton.setText("   My Profile");
        myProfileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myProfileButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                myProfileButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                myProfileButtonMouseExited(evt);
            }
        });

        myLoansButton.setBackground(new java.awt.Color(204, 204, 204));
        myLoansButton.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        myLoansButton.setText("   My Loans");
        myLoansButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myLoansButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                myLoansButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                myLoansButtonMouseExited(evt);
            }
        });

        paymentsButton.setBackground(new java.awt.Color(204, 204, 204));
        paymentsButton.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        paymentsButton.setText("   Payments");
        paymentsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentsButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paymentsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paymentsButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout sideBarPanelLayout = new javax.swing.GroupLayout(sideBarPanel);
        sideBarPanel.setLayout(sideBarPanelLayout);
        sideBarPanelLayout.setHorizontalGroup(
            sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myProfileButton, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
            .addComponent(myLoansButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paymentsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sideBarPanelLayout.setVerticalGroup(
            sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(myProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(myLoansButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paymentsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fileMenu.setText("File");
        fileMenu.setToolTipText("Application Settings");
        menuBar.add(fileMenu);

        loanProductsMenu.setText("Loan Products");
        loanProductsMenu.setToolTipText("Menu that contains everything related to all\nthe Loan Products that Callisto has to offer");

        viewProductsMenyItem.setText("View Loan Products");
        viewProductsMenyItem.setToolTipText("Displays all the Loan Products that Callisto has to offer");
        viewProductsMenyItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProductsMenyItemActionPerformed(evt);
            }
        });
        loanProductsMenu.add(viewProductsMenyItem);

        menuBar.add(loanProductsMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(sideBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
            .addComponent(sideBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewProductsMenyItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProductsMenyItemActionPerformed

        ProductUi productsUi = new ProductUi(jLayeredPane1);
        jLayeredPane1.removeAll();
        jLayeredPane1.add(productsUi);
        jLayeredPane1.repaint();
        jLayeredPane1.revalidate();

    }//GEN-LAST:event_viewProductsMenyItemActionPerformed

    private void myProfileButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myProfileButtonMouseEntered
        
        BorderUIResource.EtchedBorderUIResource border = new BorderUIResource.EtchedBorderUIResource();
        myProfileButton.setBorder(border);  
    }//GEN-LAST:event_myProfileButtonMouseEntered

    private void myProfileButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myProfileButtonMouseExited
        myProfileButton.setBorder(null);
    }//GEN-LAST:event_myProfileButtonMouseExited

    private void myProfileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myProfileButtonMouseClicked
        myProfileButton.setBackground(new Color(204,204,204));
        myProfileButton.setOpaque(true);
        myProfileButton.setBorder(null);
        myLoansButton.setBackground(null);
        paymentsButton.setBackground(null);
    }//GEN-LAST:event_myProfileButtonMouseClicked

    private void myLoansButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myLoansButtonMouseClicked
        myLoansButton.setBackground(new Color(204,204,204));
        myLoansButton.setOpaque(true);
        myLoansButton.setBorder(null);
        myProfileButton.setBackground(null);
        paymentsButton.setBackground(null);
        MyLoansUI myLoans = new MyLoansUI(jLayeredPane1);
        jLayeredPane1.removeAll();
        jLayeredPane1.add(myLoans);
        jLayeredPane1.repaint();
        jLayeredPane1.revalidate();
        
    }//GEN-LAST:event_myLoansButtonMouseClicked

    private void myLoansButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myLoansButtonMouseEntered
        BorderUIResource.EtchedBorderUIResource border = new BorderUIResource.EtchedBorderUIResource();
        myLoansButton.setBorder(border);  
    }//GEN-LAST:event_myLoansButtonMouseEntered

    private void myLoansButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myLoansButtonMouseExited
        myLoansButton.setBorder(null);
    }//GEN-LAST:event_myLoansButtonMouseExited

    private void paymentsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentsButtonMouseClicked
        paymentsButton.setBackground(new Color(204,204,204));
        paymentsButton.setOpaque(true);
        paymentsButton.setBorder(null);
        myProfileButton.setBackground(null);
        myLoansButton.setBackground(null);
        
    }//GEN-LAST:event_paymentsButtonMouseClicked

    private void paymentsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentsButtonMouseEntered
        BorderUIResource.EtchedBorderUIResource border = new BorderUIResource.EtchedBorderUIResource();
        paymentsButton.setBorder(border); 
    }//GEN-LAST:event_paymentsButtonMouseEntered

    private void paymentsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentsButtonMouseExited
        paymentsButton.setBorder(null);
    }//GEN-LAST:event_paymentsButtonMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu loanProductsMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel myLoansButton;
    private javax.swing.JLabel myProfileButton;
    private javax.swing.JLabel paymentsButton;
    private javax.swing.JPanel productPanel;
    private javax.swing.JPanel sideBarPanel;
    private javax.swing.JMenuItem viewProductsMenyItem;
    // End of variables declaration//GEN-END:variables
}
