/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Rule;

import Business.Business;
import Business.Organization.Account;
import Business.Organization.Branch;
import UI.BranchRole.BranchWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author JANFAN
 */
public class BranchRole extends Role {
    
    public BranchRole() {
        this.type = RoleType.Branch;
    }
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Business business) {
        return new BranchWorkAreaJPanel(userProcessContainer, Business.getInstance(),(Branch)account);
    }
    
}
