/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Rule;

import Business.Business;
import Business.Organization.Account;
import javax.swing.JPanel;

/**
 *
 * @author JANFAN
 */
public abstract class Role {
    public enum RoleType {
        Branch("Branch"),
        Company("Company"),
        Customer("Customer"),
        Farm("Farm");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public RoleType type;

    public abstract JPanel createWorkArea(JPanel userProcessContainer, Account account, Business business);

    @Override
    public String toString() {
        return (type != null) ? this.type.getValue() : this.getClass().getName();
    }
}
