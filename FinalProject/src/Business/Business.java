/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Food.Food;
import Business.Food.FoodCombo;
import Business.Organization.Account;
import Business.Organization.Branch;
import Business.Organization.Company;
import Business.Organization.Customer;
import Business.Organization.Farm;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author JANFAN
 */
public class Business {
    private static Business business;
    private ArrayList<Company>companyList;
    private ArrayList<Farm>farmList;
    private ArrayList<Branch>branchList;
    private ArrayList<Customer>customerList;
    
    private ArrayList<Account>accountList;
    

    public static Business getInstance() {
        if (business == null) {
            business = new Business();
        }
        return business;
    }

    private Business() {
        companyList=new ArrayList<>();
        farmList=new ArrayList<>();
        branchList=new ArrayList<>();
        customerList=new ArrayList<>();
        accountList=new ArrayList<>();
        
    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }




    

    public ArrayList<Company> getCompanyList() {
        return companyList;
    }

    public ArrayList<Farm> getFarmList() {
        return farmList;
    }

    public ArrayList<Branch> getBranchList() {
        return branchList;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    public Account authenticateUser(String username, String password){
        for (Account ua : accountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    
}
