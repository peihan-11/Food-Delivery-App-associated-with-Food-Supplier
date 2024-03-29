/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Business.Business;
import Business.Organization.Account;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author JANFAN
 */
public class mainScreen extends javax.swing.JPanel {

           /**
            * Creates new form MainScreen
            */
           JPanel mainWorkArea;
           Account account;
           Business business;

           public mainScreen(JPanel mainWorkArea, Account account, Business business) {
                      initComponents();
                      this.mainWorkArea = mainWorkArea;
                      this.account = account;
                      this.business = business;
                      initUserWorkArea();
           }

           /**
            * This method is called from within the constructor to initialize the form. WARNING: Do
            * NOT modify this code. The content of this method is always regenerated by the Form
            * Editor.
            */
           @SuppressWarnings("unchecked")
           // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
           private void initComponents() {

                      SplitPanel = new javax.swing.JSplitPane();
                      MenuArea = new javax.swing.JPanel();
                      btnLogout = new javax.swing.JButton();
                      lblWelcome = new javax.swing.JLabel();
                      WorkArea = new javax.swing.JPanel();

                      SplitPanel.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

                      MenuArea.setBackground(new java.awt.Color(243, 222, 186));

                      btnLogout.setBackground(new java.awt.Color(169, 144, 126));
                      btnLogout.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      btnLogout.setForeground(new java.awt.Color(255, 255, 255));
                      btnLogout.setText("LOG OUT");
                      btnLogout.addActionListener(new java.awt.event.ActionListener() {
                                 public void actionPerformed(java.awt.event.ActionEvent evt) {
                                            btnLogoutActionPerformed(evt);
                                 }
                      });

                      lblWelcome.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
                      lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                      lblWelcome.setText("<WelcomeMsg>");

                      javax.swing.GroupLayout MenuAreaLayout = new javax.swing.GroupLayout(MenuArea);
                      MenuArea.setLayout(MenuAreaLayout);
                      MenuAreaLayout.setHorizontalGroup(
                                 MenuAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuAreaLayout.createSequentialGroup()
                                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnLogout)
                                            .addContainerGap())
                                 .addGroup(MenuAreaLayout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(lblWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE))
                      );
                      MenuAreaLayout.setVerticalGroup(
                                 MenuAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addGroup(MenuAreaLayout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(4, 4, 4)
                                            .addComponent(lblWelcome)
                                            .addContainerGap(31, Short.MAX_VALUE))
                      );

                      SplitPanel.setTopComponent(MenuArea);

                      WorkArea.setLayout(new java.awt.CardLayout());
                      SplitPanel.setRightComponent(WorkArea);

                      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                      this.setLayout(layout);
                      layout.setHorizontalGroup(
                                 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addComponent(SplitPanel)
                      );
                      layout.setVerticalGroup(
                                 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addComponent(SplitPanel)
                      );
           }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
               mainWorkArea.remove(this);
               CardLayout layout = (CardLayout) mainWorkArea.getLayout();
               layout.previous(mainWorkArea);        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutActionPerformed


           // Variables declaration - do not modify//GEN-BEGIN:variables
           private javax.swing.JPanel MenuArea;
           private javax.swing.JSplitPane SplitPanel;
           private javax.swing.JPanel WorkArea;
           private javax.swing.JButton btnLogout;
           private javax.swing.JLabel lblWelcome;
           // End of variables declaration//GEN-END:variables
private void initUserWorkArea() {

                      lblWelcome.setText("Welcome " + (account.getName() + " type:" + account.getRole()));

                      CardLayout layout = (CardLayout) WorkArea.getLayout();
                      System.out.println(account.getRole());
                      WorkArea.add("workArea", account.getRole().createWorkArea(WorkArea, account, business));
                      layout.next(WorkArea);
           }
}
