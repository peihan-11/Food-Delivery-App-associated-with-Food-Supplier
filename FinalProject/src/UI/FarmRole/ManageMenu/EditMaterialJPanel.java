/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.FarmRole.ManageMenu;

import Business.Business;
import Business.Food.Food;
import Business.Organization.Farm;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author JANFAN
 */
public class EditMaterialJPanel extends javax.swing.JPanel {

           /**
            * Creates new form EditMaterialJPanel
            */
           JPanel userProcessContainer;
           Business business;
           Farm farm;
           JSplitPane SplitPanel;
           Food food;

           public EditMaterialJPanel(JPanel userProcessContainer, Business business, Farm farm, Food food, JSplitPane SplitPanel) {
                      initComponents();
                      this.userProcessContainer = userProcessContainer;
                      this.business = business;
                      this.farm = farm;
                      this.SplitPanel = SplitPanel;
                      this.food = food;
                      txtName.setText(food.getFoodName());
                      txtPrice.setText(String.valueOf(food.getPrice()));
           }

           /**
            * This method is called from within the constructor to initialize the form. WARNING: Do
            * NOT modify this code. The content of this method is always regenerated by the Form
            * Editor.
            */
           @SuppressWarnings("unchecked")
           // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
           private void initComponents() {

                      btnBack = new javax.swing.JButton();
                      jLabel1 = new javax.swing.JLabel();
                      txtName = new javax.swing.JTextField();
                      txtPrice = new javax.swing.JTextField();
                      jLabel2 = new javax.swing.JLabel();
                      btnConfirm = new javax.swing.JButton();

                      setBackground(new java.awt.Color(243, 222, 186));

                      btnBack.setBackground(new java.awt.Color(169, 144, 126));
                      btnBack.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      btnBack.setForeground(new java.awt.Color(255, 255, 255));
                      btnBack.setText("<< BACK");
                      btnBack.addActionListener(new java.awt.event.ActionListener() {
                                 public void actionPerformed(java.awt.event.ActionEvent evt) {
                                            btnBackActionPerformed(evt);
                                 }
                      });

                      jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      jLabel1.setText("Name");

                      txtName.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                      txtName.addActionListener(new java.awt.event.ActionListener() {
                                 public void actionPerformed(java.awt.event.ActionEvent evt) {
                                            txtNameActionPerformed(evt);
                                 }
                      });

                      txtPrice.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      txtPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                      txtPrice.addActionListener(new java.awt.event.ActionListener() {
                                 public void actionPerformed(java.awt.event.ActionEvent evt) {
                                            txtPriceActionPerformed(evt);
                                 }
                      });

                      jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      jLabel2.setText("Price");

                      btnConfirm.setBackground(new java.awt.Color(103, 93, 80));
                      btnConfirm.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
                      btnConfirm.setText("EDIT");
                      btnConfirm.addActionListener(new java.awt.event.ActionListener() {
                                 public void actionPerformed(java.awt.event.ActionEvent evt) {
                                            btnConfirmActionPerformed(evt);
                                 }
                      });

                      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                      this.setLayout(layout);
                      layout.setHorizontalGroup(
                                 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                       .addGroup(layout.createSequentialGroup()
                                                                  .addGap(18, 18, 18)
                                                                  .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                       .addGroup(layout.createSequentialGroup()
                                                                  .addGap(200, 200, 200)
                                                                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                             .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(jLabel1)
                                                                                        .addGap(30, 30, 30)
                                                                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                        .addComponent(jLabel2)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                   .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                   .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                            .addContainerGap(197, Short.MAX_VALUE))
                      );
                      layout.setVerticalGroup(
                                 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addGroup(layout.createSequentialGroup()
                                            .addGap(17, 17, 17)
                                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(180, 180, 180)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                       .addComponent(jLabel1)
                                                       .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                       .addComponent(jLabel2)
                                                       .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap(247, Short.MAX_VALUE))
                      );
           }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
               // TODO add your handling code here:

               ManageMenuJPanel Panel = new ManageMenuJPanel(userProcessContainer, business, farm, SplitPanel);
               SplitPanel.setRightComponent(Panel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
               // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
               // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
               // TODO add your handling code here:
               if (txtName.getText().isEmpty() || txtPrice.getText().isEmpty()) {
                          JOptionPane.showMessageDialog(this, "Please fill it out completely");
               } else {
                          food.setFoodName(txtName.getText());
                          food.setPrice(Double.parseDouble(txtPrice.getText()));
                          farm.getMenu().put(food, Double.parseDouble(txtPrice.getText()));
                          ManageMenuJPanel Panel = new ManageMenuJPanel(userProcessContainer, business, farm, SplitPanel);
                          SplitPanel.setRightComponent(Panel);
               }
    }//GEN-LAST:event_btnConfirmActionPerformed


           // Variables declaration - do not modify//GEN-BEGIN:variables
           private javax.swing.JButton btnBack;
           private javax.swing.JButton btnConfirm;
           private javax.swing.JLabel jLabel1;
           private javax.swing.JLabel jLabel2;
           private javax.swing.JTextField txtName;
           private javax.swing.JTextField txtPrice;
           // End of variables declaration//GEN-END:variables
}
