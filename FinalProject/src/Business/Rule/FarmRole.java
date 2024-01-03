/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Rule;

import Business.Business;
import Business.Organization.Account;
import Business.Organization.Farm;
import UI.BranchRole.BranchWorkAreaJPanel;
import UI.FarmRole.FarmWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author JANFAN
 */
public class FarmRole extends Role {
    public FarmRole() {
        this.type = RoleType.Farm;
    }
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Business business) {
        return new FarmWorkAreaJPanel(userProcessContainer, Business.getInstance(),(Farm)account);
    }
}
