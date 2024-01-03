/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Food;

/**
 *
 * @author JANFAN
 */
//Food class will include basic information for food like name, cost and price
public class Food {
    private String foodName;
    private double cost;
    private double price;

    public Food(String foodName, double cost, double price) {
        this.foodName = foodName;
        this.cost = cost;
        this.price = price;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString(){
        return foodName;
    }
    
}
