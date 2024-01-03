/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Food;

/**
 *
 * @author JANFAN
 */
//FoodCombo class will play as a bundle for food
public class FoodCombo {
    
    private Food food;
    private int num;//number of food

    public FoodCombo(){}
    public FoodCombo(Food food, int num){
        this.food=food;
        this.num=num;
    }
    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    @Override
    public String toString(){
        return food.toString();
    }
    
}
