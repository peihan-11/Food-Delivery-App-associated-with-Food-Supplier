/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.CustomerRole;

import Business.Business;
import Business.Order.Order;
import Business.Organization.Customer;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JANFAN
 */
public class ViewOrderJPanel extends javax.swing.JPanel {

           /**
            * Creates new form ViewOrderJPanel
            */
           JPanel userProcessContainer;
           Business business;
           Customer customer;
           JSplitPane SplitPanel;

           public ViewOrderJPanel(JPanel userProcessContainer, Business business, Customer customer, JSplitPane SplitPanel) {
                      initComponents();
                      this.userProcessContainer = userProcessContainer;
                      this.business = business;
                      this.customer = customer;
                      this.SplitPanel = SplitPanel;

                      populate();
           }

           /**
            * This method is called from within the constructor to initialize the form. WARNING: Do
            * NOT modify this code. The content of this method is always regenerated by the Form
            * Editor.
            */
           @SuppressWarnings("unchecked")
           // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
           private void initComponents() {

                      jScrollPane1 = new javax.swing.JScrollPane();
                      tblOrder = new javax.swing.JTable();
                      jLabel1 = new javax.swing.JLabel();

                      setBackground(new java.awt.Color(243, 222, 186));

                      tblOrder.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      tblOrder.setModel(new javax.swing.table.DefaultTableModel(
                                 new Object [][] {
                                            {null, null, null},
                                            {null, null, null},
                                            {null, null, null},
                                            {null, null, null}
                                 },
                                 new String [] {
                                            "Order ID", "Price", "Status"
                                 }
                      ));
                      jScrollPane1.setViewportView(tblOrder);

                      jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
                      jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                      jLabel1.setText("ORDER LIST");

                      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                      this.setLayout(layout);
                      layout.setHorizontalGroup(
                                 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                 .addGroup(layout.createSequentialGroup()
                                            .addGap(50, 50, 50)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap(50, Short.MAX_VALUE))
                      );
                      layout.setVerticalGroup(
                                 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addGroup(layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addComponent(jLabel1)
                                            .addGap(18, 18, 18)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap(29, Short.MAX_VALUE))
                      );
           }// </editor-fold>//GEN-END:initComponents


           // Variables declaration - do not modify//GEN-BEGIN:variables
           private javax.swing.JLabel jLabel1;
           private javax.swing.JScrollPane jScrollPane1;
           private javax.swing.JTable tblOrder;
           // End of variables declaration//GEN-END:variables

           private void populate() {
                      DefaultTableModel model = (DefaultTableModel) tblOrder.getModel();
                      model.setRowCount(0);

                      for (Order odr : customer.getOrderDir().getOrderList()) {

                                 Object[] row = new Object[3];
                                 row[0] = odr;
                                 row[1] = odr.getTotalPrice();
                                 row[2] = odr.getStatus();

                                 model.addRow(row);

                      }
           }
}