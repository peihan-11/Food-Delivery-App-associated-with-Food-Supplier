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
public class OrderDirectory {
    private ArrayList<Order>orderList;

    public OrderDirectory() {
        orderList=new ArrayList<>();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }
    public Order createOrder(ArrayList<FoodCombo>foodCombo, double totalPrice, String OrderID, Customer customer, Branch branch, String status){
        Order order=new Order(foodCombo,totalPrice,OrderID,customer,branch,status);
        orderList.add(order);
        return order;
    }
    public Order createOrder(ArrayList<FoodCombo>foodCombo, double totalPrice, String OrderID,Branch branch,Company company, String status){
        Order order=new Order(foodCombo,totalPrice,OrderID,branch,company,status);
        orderList.add(order);
        return order;
    }
    public Order createOrder(ArrayList<FoodCombo>foodCombo, double totalPrice, String OrderID,Company company,Farm farm, String status){
        Order order=new Order(foodCombo,totalPrice,OrderID,company,farm,status);
        orderList.add(order);
        return order;
    }
    public void addOrder(Order order){
        orderList.add(order);
    }
    
    
    
}
