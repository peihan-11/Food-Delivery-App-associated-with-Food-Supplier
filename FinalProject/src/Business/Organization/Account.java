/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Order.OrderDirectory;
import Business.Rule.Role;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author JANFAN
 */
//contain basic infomation for every Account
public class Account {
    private String name;
    private String username;
    private String password;
    private double asset;
    private OrderDirectory orderDir;
    private String nation;
    private Role role;
    private ImageIcon image;

    public Account(String name, String username, String password, double asset, String nation) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.asset = asset;
        this.nation = nation;
        orderDir=new OrderDirectory();
    }
    public enum Type{
        Farm("Farm") {
//            //@Override
//            public Organization createOrganization() {
//                return new AdminOrganization();
//            }
        }, Company("Company"){
//            public Organization createOrganization() {
//                return new DoctorOrganization();
//            }
        }, Branch("Branch"){
//            public Organization createOrganization() {
//                return new LabOrganization();
//            }
        },Customer("Customer"){};
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }

    }
    public ArrayList<Role> getSupportedRole(){
        return null;
    };

    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }
    

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getAsset() {
        return asset;
    }

    public void setAsset(double asset) {
        this.asset = asset;
    }

    public OrderDirectory getOrderDir() {
        return orderDir;
    }

    public void setOrderDir(OrderDirectory orderDir) {
        this.orderDir = orderDir;
    }

   public ImageIcon getImage() {
           return image;
           }

   public void setImage(ImageIcon image) {
            this.image = image;
           }
    
    
}
