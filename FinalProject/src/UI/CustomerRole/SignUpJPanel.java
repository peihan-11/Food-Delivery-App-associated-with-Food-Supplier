/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.CustomerRole;

import Business.Business;
import Business.Organization.Account;
import Business.Organization.Customer;
import UI.mainScreen;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author JANFAN
 */
public class SignUpJPanel extends javax.swing.JPanel {

           /**
            * Creates new form SignUpJPanel
            */
           JPanel userProcessContainer;
           Business business;

           public SignUpJPanel(JPanel userProcessContainer, Business business) {
                      initComponents();
                      this.business = business;
                      this.userProcessContainer = userProcessContainer;
           }

           /**
            * This method is called from within the constructor to initialize the form. WARNING: Do
            * NOT modify this code. The content of this method is always regenerated by the Form
            * Editor.
            */
           @SuppressWarnings("unchecked")
           // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
           private void initComponents() {

                      lblUsername = new javax.swing.JLabel();
                      txtUsername = new javax.swing.JTextField();
                      lblPassword = new javax.swing.JLabel();
                      txtPassword = new javax.swing.JTextField();
                      lblConfirmPassword = new javax.swing.JLabel();
                      txtConfirmPassword = new javax.swing.JTextField();
                      btnSignUp = new javax.swing.JButton();
                      btnLogin = new javax.swing.JButton();

                      setBackground(new java.awt.Color(243, 222, 186));

                      lblUsername.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                      lblUsername.setText("Username");

                      txtUsername.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      txtUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                      txtUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
                      txtUsername.addActionListener(new java.awt.event.ActionListener() {
                                 public void actionPerformed(java.awt.event.ActionEvent evt) {
                                            txtUsernameActionPerformed(evt);
                                 }
                      });

                      lblPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                      lblPassword.setText("Password");

                      txtPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                      txtPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

                      lblConfirmPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      lblConfirmPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                      lblConfirmPassword.setText("Confirm Password");

                      txtConfirmPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      txtConfirmPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                      txtConfirmPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

                      btnSignUp.setBackground(new java.awt.Color(103, 93, 80));
                      btnSignUp.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
                      btnSignUp.setText("SIGN UP");
                      btnSignUp.addActionListener(new java.awt.event.ActionListener() {
                                 public void actionPerformed(java.awt.event.ActionEvent evt) {
                                            btnSignUpActionPerformed(evt);
                                 }
                      });

                      btnLogin.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      btnLogin.setText("Already had account yet? Sign In");
                      btnLogin.setBorderPainted(false);
                      btnLogin.setContentAreaFilled(false);
                      btnLogin.addActionListener(new java.awt.event.ActionListener() {
                                 public void actionPerformed(java.awt.event.ActionEvent evt) {
                                            btnLoginActionPerformed(evt);
                                 }
                      });

                      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                      this.setLayout(layout);
                      layout.setHorizontalGroup(
                                 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addGroup(layout.createSequentialGroup()
                                            .addContainerGap(175, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                       .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                  .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                  .addGap(268, 268, 268))
                                                       .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                  .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                  .addGap(176, 176, 176))))
                                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                       .addGap(148, 148, 148)
                                                       .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                  .addComponent(lblConfirmPassword)
                                                                  .addComponent(lblPassword)
                                                                  .addComponent(lblUsername))
                                                       .addGap(18, 18, 18)
                                                       .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                  .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                                  .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                                  .addComponent(txtConfirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                                       .addContainerGap(163, Short.MAX_VALUE)))
                      );
                      layout.setVerticalGroup(
                                 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addContainerGap(336, Short.MAX_VALUE)
                                            .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnLogin)
                                            .addGap(195, 195, 195))
                                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                       .addGap(179, 179, 179)
                                                       .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                  .addComponent(lblUsername)
                                                                  .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                       .addGap(18, 18, 18)
                                                       .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                  .addComponent(lblPassword)
                                                                  .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                       .addGap(18, 18, 18)
                                                       .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                  .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                  .addComponent(lblConfirmPassword))
                                                       .addContainerGap(295, Short.MAX_VALUE)))
                      );
           }// </editor-fold>//GEN-END:initComponents

           private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
                      // TODO add your handling code here:
           }//GEN-LAST:event_txtUsernameActionPerformed

           private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
                      // TODO add your handling code here:
                      if (txtPassword.getText().isEmpty() || txtConfirmPassword.getText().isEmpty() || txtUsername.getText().isEmpty()) {
                                 JOptionPane.showMessageDialog(this, "You don't fill it out completely ");
                      } else {
                                 if (txtPassword.getText().equals(txtConfirmPassword.getText())) {
                                            Customer c = new Customer("Unknown", txtUsername.getText(), txtPassword.getText(), 0, "Unknown");

                                            business.getAccountList().add(c);
                                            business.getCustomerList().add(c);
                                            JPanel mainScreen = new mainScreen(userProcessContainer, c, business);
                                            userProcessContainer.add("MainScreen", mainScreen);
                                            CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
                                            cardlayout.next(userProcessContainer);

                                 } else {
                                            JOptionPane.showMessageDialog(this, "Two Password are not equal");
                                 }
                      }


           }//GEN-LAST:event_btnSignUpActionPerformed

           private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
                      userProcessContainer.remove(this);
                      CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                      layout.previous(userProcessContainer);
           }//GEN-LAST:event_btnLoginActionPerformed


           // Variables declaration - do not modify//GEN-BEGIN:variables
           private javax.swing.JButton btnLogin;
           private javax.swing.JButton btnSignUp;
           private javax.swing.JLabel lblConfirmPassword;
           private javax.swing.JLabel lblPassword;
           private javax.swing.JLabel lblUsername;
           private javax.swing.JTextField txtConfirmPassword;
           private javax.swing.JTextField txtPassword;
           private javax.swing.JTextField txtUsername;
           // End of variables declaration//GEN-END:variables
}