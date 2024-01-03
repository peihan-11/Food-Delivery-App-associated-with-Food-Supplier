/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Rule;

import Business.Business;
import Business.Organization.Account;
import Business.Organization.Customer;
import UI.BranchRole.BranchWorkAreaJPanel;
import UI.CustomerRole.CustomerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author JANFAN
 */
public class CustomerRole extends Role {
    public CustomerRole() {
        this.type = RoleType.Customer;
    }
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Business business) {
        return new CustomerWorkAreaJPanel(userProcessContainer, Business.getInstance(),(Customer)account);
    }
}
