/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Food.FoodCombo;
import Business.Rule.BranchRole;
import Business.Rule.Role;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author JANFAN
 */
//Branch is each brach shop from company. play a role as selling food to customer
public class Branch extends Account{
    private String location;
    private int postcode;
    private Company company;
    private ArrayList<FoodCombo>stock;
    
    public Branch(String name, String username, String password, double asset, String nation,String location,int postcode,Company company){
        super(name,username,password,asset,nation);
        this.location=location;
        this.postcode=postcode;
        this.company=company;
        this.stock=new ArrayList<>();
        super.setRole(new BranchRole());
    }
    
    //add stock 
    public String addStock(FoodCombo foodcombo){
        String foodName=foodcombo.toString();
        for(FoodCombo f:this.stock){
            if(f.toString().equals(foodName)){
                System.out.println(f.getNum());
                System.out.println(foodcombo.getNum());
                System.out.println(f.getNum()+foodcombo.getNum());//50
                f.setNum(f.getNum()+foodcombo.getNum());
                System.out.println(f.getNum()+foodcombo.getNum());//60
                System.out.println(f.getNum());//50
                return "Success";
            }
        }
        //if food is not in stock, create new foodcombo
        stock.add(foodcombo);
        return "Add new Food";
    } 
    public String removeStock(FoodCombo foodcombo) throws Exception{
        String foodName=foodcombo.toString();
        for(FoodCombo f:stock){
            if(f.toString().equals(foodName)){
                int remain=f.getNum()-foodcombo.getNum();
                if(remain>=0){
                    f.setNum(remain);
                    return "Success";
                }    
                else
                    throw new Exception();
            }
        }
        //if food is not in stock, throw exception;
        throw new Exception();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public ArrayList<FoodCombo> getStock() {
        return stock;
    }

    public void setStock(ArrayList<FoodCombo> stock) {
        this.stock = stock;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new BranchRole());
        return roles;
    }
    @Override
    public String toString(){
        return this.getName();
    }
    
    
}
