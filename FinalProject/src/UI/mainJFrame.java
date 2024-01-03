/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Business.Business;
import Business.ConfigureABusiness;
import Business.Organization.Account;
import UI.CustomerRole.SignUpJPanel;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author JANFAN
 */
public class mainJFrame extends javax.swing.JFrame {

           /**
            * Creates new form mainJFrame
            */
           private Business business;

           public mainJFrame() {
                      initComponents();
                      business = ConfigureABusiness.configure();
           }

           /**
            * This method is called from within the constructor to initialize the form. WARNING: Do
            * NOT modify this code. The content of this method is always regenerated by the Form
            * Editor.
            */
           @SuppressWarnings("unchecked")
           // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
           private void initComponents() {

                      MainJPanel = new javax.swing.JPanel();
                      jPanel1 = new javax.swing.JPanel();
                      jLabel1 = new javax.swing.JLabel();
                      jLabel2 = new javax.swing.JLabel();
                      jLabel3 = new javax.swing.JLabel();
                      txtUsername = new javax.swing.JTextField();
                      txtPassword = new javax.swing.JTextField();
                      btnLogin = new javax.swing.JButton();
                      btnSignUp = new javax.swing.JButton();

                      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                      MainJPanel.setLayout(new java.awt.CardLayout());

                      jPanel1.setBackground(new java.awt.Color(243, 222, 186));

                      jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
                      jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                      jLabel1.setText("LOG IN");

                      jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      jLabel2.setText("Username");

                      jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      jLabel3.setText("Password");

                      txtUsername.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      txtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

                      txtPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

                      btnLogin.setBackground(new java.awt.Color(103, 93, 80));
                      btnLogin.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      btnLogin.setForeground(new java.awt.Color(255, 255, 255));
                      btnLogin.setText("LOG IN");
                      btnLogin.addActionListener(new java.awt.event.ActionListener() {
                                 public void actionPerformed(java.awt.event.ActionEvent evt) {
                                            btnLoginActionPerformed(evt);
                                 }
                      });

                      btnSignUp.setBackground(new java.awt.Color(103, 93, 80));
                      btnSignUp.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
                      btnSignUp.setText("CUSTOMER SIGN UP");
                      btnSignUp.addActionListener(new java.awt.event.ActionListener() {
                                 public void actionPerformed(java.awt.event.ActionEvent evt) {
                                            btnSignUpActionPerformed(evt);
                                 }
                      });

                      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                      jPanel1.setLayout(jPanel1Layout);
                      jPanel1Layout.setHorizontalGroup(
                                 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                 .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(226, 226, 226)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                       .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                       .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                       .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                       .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                       .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                       .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addContainerGap(279, Short.MAX_VALUE))
                      );
                      jPanel1Layout.setVerticalGroup(
                                 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(92, 92, 92)
                                            .addComponent(jLabel1)
                                            .addGap(84, 84, 84)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                       .addComponent(jLabel2)
                                                       .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                       .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                       .addComponent(jLabel3))
                                            .addGap(18, 18, 18)
                                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap(220, Short.MAX_VALUE))
                      );

                      MainJPanel.add(jPanel1, "card2");

                      getContentPane().add(MainJPanel, java.awt.BorderLayout.CENTER);

                      pack();
           }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
               // TODO add your handling code here:
               String username = txtUsername.getText();
               String password = txtPassword.getText();
               boolean flag = false;
               Account account = business.authenticateUser(username, password);
               if (account != null) {

                          JPanel mainScreen = new mainScreen(MainJPanel, account, business);
                          MainJPanel.add("MainScreen", mainScreen);
                          CardLayout layout = (CardLayout) MainJPanel.getLayout();
                          layout.next(MainJPanel);
                          flag = true;

               }
               if (flag == false) {
                          JOptionPane.showMessageDialog(null, "Invalid User Name/ Password.");
                          return;
               }


    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
               // TODO add your handling code here:
               SignUpJPanel panel = new SignUpJPanel(MainJPanel, business);
               MainJPanel.add("SignUp", panel);
               CardLayout layout = (CardLayout) MainJPanel.getLayout();
               layout.next(MainJPanel);
    }//GEN-LAST:event_btnSignUpActionPerformed

           /**
            * @param args the command line arguments
            */
           public static void main(String args[]) {
                      /* Set the Nimbus look and feel */
                      //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
                      /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
                       */
                      try {
                                 for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                                            if ("Nimbus".equals(info.getName())) {
                                                       javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                                       break;
                                            }
                                 }
                      } catch (ClassNotFoundException ex) {
                                 java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                      } catch (InstantiationException ex) {
                                 java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                      } catch (IllegalAccessException ex) {
                                 java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                                 java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                      }
                      //</editor-fold>

                      /* Create and display the form */
                      java.awt.EventQueue.invokeLater(new Runnable() {
                                 public void run() {
                                            new mainJFrame().setVisible(true);
                                 }
                      });
           }
// color rgb(169, 144, 126) / rgb(243, 222, 186) / rgb(171, 196, 170) / rgb(103, 93, 80)
           // Variables declaration - do not modify//GEN-BEGIN:variables
           private javax.swing.JPanel MainJPanel;
           private javax.swing.JButton btnLogin;
           private javax.swing.JButton btnSignUp;
           private javax.swing.JLabel jLabel1;
           private javax.swing.JLabel jLabel2;
           private javax.swing.JLabel jLabel3;
           private javax.swing.JPanel jPanel1;
           private javax.swing.JTextField txtPassword;
           private javax.swing.JTextField txtUsername;
           // End of variables declaration//GEN-END:variables
}