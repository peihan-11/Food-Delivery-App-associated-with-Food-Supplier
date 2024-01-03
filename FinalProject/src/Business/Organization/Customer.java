/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Rule.CustomerRole;
import Business.Rule.Role;
import java.util.ArrayList;

/**
 *
 * @author JANFAN
 */
public class Customer extends Account{
    public Customer(String name, String username, String password, double asset, String nation){
        super(name,username,password,asset,nation);
        super.setRole(new CustomerRole());
    }

          
        @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CustomerRole());
        return roles;
    }
    
}
