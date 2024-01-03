/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Food.Food;
import Business.Food.FoodCombo;
import Business.Rule.CompanyRole;
import Business.Rule.Role;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author JANFAN
 */
public class Company extends Account{
    private HashMap<Food, Double>menu;
    private double membershpPrice;
    private double discount;
    private ArrayList<Branch>branchList;
    private ArrayList<Customer>primeList;
    private ArrayList<FoodCombo>ingerdientStock;
    private ArrayList<FoodCombo>productStock;
    private ArrayList<String>nations;
    private double labour;
    private HashMap<Food, ArrayList<FoodCombo>> formula;
    
    public Company(String name, String username, String password, double asset, String nation){
        super(name,username,password,asset,nation);
        menu=new HashMap<>();
        branchList=new ArrayList<>();
        primeList=new ArrayList<>();
        ingerdientStock=new ArrayList<>();
        productStock=new ArrayList<>();
        nations=new ArrayList<>();
        super.setRole(new CompanyRole());
        formula=new HashMap<>();
    }

    public HashMap<Food, ArrayList<FoodCombo>> getFormula() {
        return formula;
    }

    
    //add new food to menu
    public void addMenu(Food food, Double price){
        menu.put(food, price);
    }
    //add and delete branch
    public void addBranch(Branch branch){
        branchList.add(branch);
    }
    public void removeBranch(Branch branch){
        branchList.remove(branch);
    }
    //add customer to primeList
    public void addPrimeCustomer(Customer customer){
        primeList.add(customer);
    }
    //add ingerdient stock 
    
    public boolean checkIngerdientStock(FoodCombo foodcombo){
       String foodName=foodcombo.toString();
       int num=foodcombo.getNum();
        for(FoodCombo f:ingerdientStock){
            if(f.toString().equals(foodName)){
                if(f.getNum()<num)
                    return false;
            }
        }
        return true;
    }
    public String addIngerdientStock(FoodCombo foodcombo){
        String foodName=foodcombo.toString();
        for(FoodCombo f:ingerdientStock){
            if(f.toString().equals(foodName)){
                f.setNum(f.getNum()+foodcombo.getNum());
                return "Success";
            }
        }
        //if food is not in stock, create new foodcombo
        ingerdientStock.add(foodcombo);
        return "Add new Food";
    } 
    
    //remove ingerdient stock 
    public String removeIngerdientStock(FoodCombo foodcombo) throws Exception{
        String foodName=foodcombo.toString();
        for(FoodCombo f:ingerdientStock){
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
    
    //add product stock 
    public String addProductStock(FoodCombo foodcombo){
        String foodName=foodcombo.toString();
        for(FoodCombo f:productStock){
            if(f.toString().equals(foodName)){
                f.setNum(f.getNum()+foodcombo.getNum());
                return "Success";
            }
        }
        //if food is not in stock, create new foodcombo
        productStock.add(foodcombo);
        return "Add new Food";
    } 
    //remove product stock 
    public String removeProductStock(FoodCombo foodcombo) throws Exception{
        String foodName=foodcombo.toString();
        for(FoodCombo f:this.productStock){
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
    
    

    public HashMap<Food, Double> getMenu() {
        return menu;
    }

    public ArrayList<Branch> getBranchList() {
        return branchList;
    }

    public ArrayList<Customer> getPrimeList() {
        return primeList;
    }

    public ArrayList<FoodCombo> getIngerdientStock() {
        return ingerdientStock;
    }

    public ArrayList<FoodCombo> getProductStock() {
        return productStock;
    }

    public ArrayList<String> getNations() {
        return nations;
    }
    
    public double getMembershpPrice() {
        return membershpPrice;
    }

    public void setMembershpPrice(double membershpPrice) {
        this.membershpPrice = membershpPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getLabour() {
        return labour;
    }

    public void setLabour(double labour) {
        this.labour = labour;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CompanyRole());
        return roles;
    }
    
    
    
    
    
    
}
