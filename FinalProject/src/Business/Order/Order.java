/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Order;

import Business.Food.FoodCombo;
import Business.Organization.Branch;
import Business.Organization.Company;
import Business.Organization.Customer;
import Business.Organization.Farm;
import java.util.ArrayList;

/**
 *
 * @author JANFAN
 */
//Order class will include information for one order from seller to buyer
public class Order {
    private ArrayList<FoodCombo>foodCombo;
    private double totalPrice;
    private String orderID;//begin of "b"(customer from branch) "c"(branch from company) "f"(company from farm)
    private Customer customer;
    private Branch branch;
    private Company company;
    private Farm farm;
    
    private String status;//"uncomplete" "processing" "completed" "canceled"

    public Order(ArrayList<FoodCombo>foodCombo, double totalPrice, String OrderID, Customer customer, Branch branch, String status) {
        this.foodCombo = foodCombo;
        this.totalPrice = totalPrice;
        this.orderID = OrderID;
        this.customer = customer;
        this.branch = branch;
        this.status = status;
        this.company=null;
        this.farm=null;
    }

    public Order(ArrayList<FoodCombo>foodCombo, double totalPrice, String OrderID, Branch branch, Company company, String status) {
        this.foodCombo = foodCombo;
        this.totalPrice = totalPrice;
        this.orderID = OrderID;
        this.branch = branch;
        this.company = company;
        this.status = status;
        this.customer=null;
        this.farm=null;
    }

    public Order(ArrayList<FoodCombo>foodCombo, double totalPrice, String OrderID, Company company, Farm farm, String status) {
        this.foodCombo = foodCombo;
        this.totalPrice = totalPrice;
        this.orderID = OrderID;
        this.company = company;
        this.farm = farm;
        this.status = status;
        this.customer=null;
        this.branch=null;  
    }
    
    public String typeOfOrder(){
        char begin =this.orderID.charAt(0);
        if(begin=='b')
            return "B2C";
        else if(begin=='c')
            return "C2B";
        else if(begin=='f')
            return "F2C";
        return "error";
    }

    public ArrayList<FoodCombo> getFoodCombo() {
        return foodCombo;
    }

    public void setFoodCombo(ArrayList<FoodCombo>foodCombo) {
        this.foodCombo = foodCombo;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Farm getFarm() {
        return farm;
    }

    public void setFarm(Farm farm) {
        this.farm = farm;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString(){
        return orderID;
    }
    
    
    
}
