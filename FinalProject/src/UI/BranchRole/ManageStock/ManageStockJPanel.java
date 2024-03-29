/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.BranchRole.ManageStock;

/**
 *
 * @author JANFAN
 */
import Business.Business;
import Business.Food.Food;
import Business.Food.FoodCombo;
import Business.Organization.Branch;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class ManageStockJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageStockJPanel
     */
    Business business;
    Branch branch;
    
    public ManageStockJPanel(Business business,Branch branch) {
        initComponents();
        this.business = business;
        this.branch=branch;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
           // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
           private void initComponents() {

                      jLabel1 = new javax.swing.JLabel();
                      jScrollPane1 = new javax.swing.JScrollPane();
                      tblProduct = new javax.swing.JTable();
                      jLabel2 = new javax.swing.JLabel();
                      txtNumber = new javax.swing.JTextField();
                      jButton1 = new javax.swing.JButton();

                      setBackground(new java.awt.Color(243, 222, 186));

                      jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
                      jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                      jLabel1.setText("MANAGE STOCK");

                      tblProduct.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      tblProduct.setModel(new javax.swing.table.DefaultTableModel(
                                 new Object [][] {
                                            {null, null},
                                            {null, null},
                                            {null, null},
                                            {null, null}
                                 },
                                 new String [] {
                                            "Product", "Number"
                                 }
                      ));
                      jScrollPane1.setViewportView(tblProduct);

                      jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      jLabel2.setText("Number to add:");

                      txtNumber.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      txtNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

                      jButton1.setBackground(new java.awt.Color(103, 93, 80));
                      jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      jButton1.setForeground(new java.awt.Color(255, 255, 255));
                      jButton1.setText("ADD PRODUCT");
                      jButton1.addActionListener(new java.awt.event.ActionListener() {
                                 public void actionPerformed(java.awt.event.ActionEvent evt) {
                                            jButton1ActionPerformed(evt);
                                 }
                      });

                      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                      this.setLayout(layout);
                      layout.setHorizontalGroup(
                                 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                 .addGroup(layout.createSequentialGroup()
                                            .addGap(50, 50, 50)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                       .addGroup(layout.createSequentialGroup()
                                                                  .addComponent(jLabel2)
                                                                  .addGap(18, 18, 18)
                                                                  .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                  .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                       .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addContainerGap(50, Short.MAX_VALUE))
                      );
                      layout.setVerticalGroup(
                                 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addGroup(layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addComponent(jLabel1)
                                            .addGap(20, 20, 20)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                       .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                       .addComponent(jLabel2)
                                                       .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(40, 40, 40))
                      );
           }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex=tblProduct.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a Product");
            return;
        }
        DefaultTableModel model=(DefaultTableModel)tblProduct.getModel();
        Food food=(Food)model.getValueAt(selectedRowIndex,0); 
        int num = Integer.parseInt(txtNumber.getText());
        FoodCombo entro_cmb = new FoodCombo(food, num);
        System.out.println(entro_cmb+" "+entro_cmb.getNum());
        try {
            branch.getCompany().removeProductStock(entro_cmb);
            branch.addStock(entro_cmb);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,"Company out of stock");
            return;
        }
        
        JOptionPane.showMessageDialog(this,"Added the stock");
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed


           // Variables declaration - do not modify//GEN-BEGIN:variables
           private javax.swing.JButton jButton1;
           private javax.swing.JLabel jLabel1;
           private javax.swing.JLabel jLabel2;
           private javax.swing.JScrollPane jScrollPane1;
           private javax.swing.JTable tblProduct;
           private javax.swing.JTextField txtNumber;
           // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model=(DefaultTableModel)tblProduct.getModel();
        model.setRowCount(0);
        
        for(FoodCombo cmb : branch.getStock()){
            Object[]row =new Object[2];
            row[0]=cmb.getFood();
            row[1]=cmb.getNum();

            model.addRow(row);
        }
    }
}
