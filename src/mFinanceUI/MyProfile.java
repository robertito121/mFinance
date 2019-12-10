/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mFinanceUI;

import javax.swing.JLayeredPane;
import mFinanceUserInformation.Customer;
import mFinanceUserInformation.User;

/**
 *
 * @author Parker
 */
public class MyProfile extends javax.swing.JPanel {
    private Customer user;
    private JLayeredPane JLayeredPanel;
    /**
     * Creates new form MyProfile
     */
    public MyProfile(JLayeredPane j, Customer user) {
        initComponents();  
        setVisible(true);
        JLayeredPanel = j;
        this.user = user;
        populateProfileData();
    }
    
    private void populateProfileData(){
        header.setText(user.getFirstName() + "'s Profile");
        firstName.setText(user.getFirstName());
        lastName.setText(user.getLastName());
        addressLabel.setText(user.getAddress().getStreetAddress() + ", " + user.getAddress().getCity() + " " + user.getAddress().getState() + " " + user.getAddress().getZipCode() );
        phoneNumber.setText(user.getPhoneNumber());
        emailAddress.setText(user.getEmailAddress());
        userName.setText(user.getCredentials().getUsername());
        password.setText(user.getCredentials().getPassword());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JLabel();
        lastName = new javax.swing.JLabel();
        firstName = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        emailAddress = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        firstName1 = new javax.swing.JLabel();
        firstName2 = new javax.swing.JLabel();
        firstName3 = new javax.swing.JLabel();
        firstName4 = new javax.swing.JLabel();
        firstName5 = new javax.swing.JLabel();
        firstName6 = new javax.swing.JLabel();
        firstName7 = new javax.swing.JLabel();

        header.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        header.setText("HEADER");

        lastName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lastName.setText("LastName");

        firstName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        firstName.setText("FirstName");

        addressLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        addressLabel.setText("Address");

        password.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        password.setText("Password");

        emailAddress.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        emailAddress.setText("Email Address");

        phoneNumber.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        phoneNumber.setText("Phone Number");

        userName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        userName.setText("UserName");

        firstName1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        firstName1.setText("Last Name:");

        firstName2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        firstName2.setText("First Name: ");

        firstName3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        firstName3.setText("Address:");

        firstName4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        firstName4.setText("Email Address:");

        firstName5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        firstName5.setText("Phone Number:");

        firstName6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        firstName6.setText("Username: ");

        firstName7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        firstName7.setText("Password Hint:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstName1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstName2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstName3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstName5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstName4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstName6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstName7, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emailAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(phoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lastName, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addressLabel, emailAddress, firstName, header, lastName, password, phoneNumber, userName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstName2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstName1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstName3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstName5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstName4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstName6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstName7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel emailAddress;
    private javax.swing.JLabel firstName;
    private javax.swing.JLabel firstName1;
    private javax.swing.JLabel firstName2;
    private javax.swing.JLabel firstName3;
    private javax.swing.JLabel firstName4;
    private javax.swing.JLabel firstName5;
    private javax.swing.JLabel firstName6;
    private javax.swing.JLabel firstName7;
    private javax.swing.JLabel header;
    private javax.swing.JLabel lastName;
    private javax.swing.JLabel password;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
