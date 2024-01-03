/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.CompanyRole.ManageBranch;

/**
 *
 * @author JANFAN
 */
import Business.Business;
import Business.Organization.Branch;
import Business.Organization.Company;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.DefaultCategoryDataset;

public class ViewDiagramJPanel extends javax.swing.JPanel {

           /**
            * Creates new form ViewDiagramJPanel
            */
           JPanel userProcessContainer;
           Business business;
           Company company;
           JSplitPane SplitPanel;

           public ViewDiagramJPanel(JPanel userProcessContainer, Business business, Company company, JSplitPane SplitPanel) {
                      initComponents();
                      this.userProcessContainer = userProcessContainer;
                      this.business = business;
                      this.company = company;
                      this.SplitPanel = SplitPanel;
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
                      btnViewDiagram = new javax.swing.JButton();

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

                      btnViewDiagram.setBackground(new java.awt.Color(171, 196, 170));
                      btnViewDiagram.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      btnViewDiagram.setText("View Diagram");
                      btnViewDiagram.addActionListener(new java.awt.event.ActionListener() {
                                 public void actionPerformed(java.awt.event.ActionEvent evt) {
                                            btnViewDiagramActionPerformed(evt);
                                 }
                      });

                      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                      this.setLayout(layout);
                      layout.setHorizontalGroup(
                                 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                       .addGroup(layout.createSequentialGroup()
                                                                  .addGap(23, 23, 23)
                                                                  .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                       .addGroup(layout.createSequentialGroup()
                                                                  .addGap(199, 199, 199)
                                                                  .addComponent(btnViewDiagram, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addContainerGap(204, Short.MAX_VALUE))
                      );
                      layout.setVerticalGroup(
                                 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addGroup(layout.createSequentialGroup()
                                            .addGap(23, 23, 23)
                                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(182, 182, 182)
                                            .addComponent(btnViewDiagram, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap(264, Short.MAX_VALUE))
                      );
           }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
               // TODO add your handling code here:
               ManageBranchJPanel Panel = new ManageBranchJPanel(userProcessContainer, business, company, SplitPanel);
               SplitPanel.setRightComponent(Panel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewDiagramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDiagramActionPerformed
               // TODO add your handling code here:
               DefaultCategoryDataset dataset = new DefaultCategoryDataset();
               for (Branch branch : company.getBranchList()) {
                          dataset.setValue(branch.getAsset(), "money", branch.getName());
               }

               JFreeChart chart = ChartFactory.createBarChart("Branch Money", "Branch Name", "money", dataset);
               CategoryPlot p = chart.getCategoryPlot();
               p.setRangeGridlinePaint(Color.black);
               ChartFrame frame = new ChartFrame("Bar Chart for branches", chart);
               frame.setVisible(true);
               frame.setSize(430, 350);
    }//GEN-LAST:event_btnViewDiagramActionPerformed

           // Variables declaration - do not modify//GEN-BEGIN:variables
           private javax.swing.JButton btnBack;
           private javax.swing.JButton btnViewDiagram;
           // End of variables declaration//GEN-END:variables

}