/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Rule;

import Business.Business;
import Business.Organization.Account;
import Business.Organization.Company;
import UI.BranchRole.BranchWorkAreaJPanel;
import UI.CompanyRole.CompanyWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author JANFAN
 */
public class CompanyRole extends Role {
    public CompanyRole() {
        this.type = RoleType.Company;
    }
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Business business) {
        return new CompanyWorkAreaJPanel(userProcessContainer, Business.getInstance(),(Company)account);
    }
}
