/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Food.Food;
import Business.Rule.FarmRole;
import Business.Rule.Role;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author JANFAN
 */
public class Farm extends Account{
    private HashMap<Food, Double>menu;
    public Farm(String name, String username, String password, double asset, String nation){
        super(name,username,password,asset,nation);
        menu=new HashMap<>();
        super.setRole(new FarmRole());
    }
    public void addMenu(Food food){
        menu.put(food, food.getPrice());
    }
    public void removeMenu(Food food){
        menu.remove(food);
    }

    public HashMap<Food, Double> getMenu() {
        return menu;
    }
    
    
        @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FarmRole());
        return roles;
    }
    
    @Override
    public String toString(){
        return this.getName();
    }
    
    
}
