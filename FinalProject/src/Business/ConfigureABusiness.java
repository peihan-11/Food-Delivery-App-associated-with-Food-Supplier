/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Food.Food;
import Business.Food.FoodCombo;
import Business.Organization.Branch;
import Business.Organization.Company;
import Business.Organization.Customer;
import Business.Organization.Farm;
import Business.Order.OrderDirectory;
import java.util.ArrayList;

/**
 *
 * @author JANFAN
 */
public class ConfigureABusiness {
    public static Business configure(){
        Business business=Business.getInstance();
        
        //initialize farm
        Farm farm1=new Farm("Boston Farm","farm1","farm1",0.0,"USA");
        Farm farm2=new Farm("New York Farm","farm2","farm2",0.0,"USA");
        Farm farm3=new Farm("Shanghai Farm","farm3","farm3",0.0,"China");
        //create material for farm
        Food BostonFlour=new Food("Boston Flour",0,1);
        Food BostonChicken=new Food("Boston Chicken",0,2);
        Food BostonBeef=new Food("Boston Beef",0,3);
        Food BostonPotato=new Food("Boston Potato",0,1.5);
        Food BostonLettuce=new Food("Boston Lettuce",0,1.5);
        
        Food NYFlour=new Food("New York Flour",0,1);
        Food NYChicken=new Food("New York Chicken",0,2);
        Food NYBeef=new Food("New York Beef",0,3);
        Food NYPotato=new Food("New York Potato",0,1.5);
        Food NYLettuce=new Food("New York Lettuce",0,1.5);
        
        Food SHFlour=new Food("Shanghai Flour",0,1);
        Food SHChicken=new Food("Shanghai Chicken",0,2);
        Food SHBeef=new Food("Shanghai Beef",0,3);
        Food SHPotato=new Food("Shanghai Potato",0,1.5);
        Food SHLettuce=new Food("Shanghai Lettuce",0,1.5);
        
        farm1.addMenu(BostonFlour);
        farm1.addMenu(BostonChicken);
        farm1.addMenu(BostonPotato);
        farm1.addMenu(BostonBeef);
        farm1.addMenu(BostonLettuce);
        
        farm2.addMenu(NYBeef);
        farm2.addMenu(NYChicken);
        farm2.addMenu(NYFlour);
        farm2.addMenu(NYLettuce);
        farm2.addMenu(NYPotato);
        
        farm3.addMenu(SHBeef);
        farm3.addMenu(SHChicken);
        farm3.addMenu(SHFlour);
        farm3.addMenu(SHLettuce);
        farm3.addMenu(SHPotato);
        
        
        business.getFarmList().add(farm1);
        business.getFarmList().add(farm2);
        business.getFarmList().add(farm3);
        
        business.getAccountList().add(farm1);
        business.getAccountList().add(farm2);
        business.getAccountList().add(farm3);
        
        //initialize company
        Company KFC=new Company("KFC","kfc","kfc",0,"USA");
        Company BK=new Company("Burger King","bk","bk",0,"USA");
        Company Dumplin=new Company("Burger King","d","d",0,"China");
        
        business.getCompanyList().add(KFC);
        business.getCompanyList().add(BK);
        business.getCompanyList().add(Dumplin);
        
        business.getAccountList().add(KFC);
        business.getAccountList().add(BK);
        business.getAccountList().add(Dumplin);
        
        KFC.setMembershpPrice(500);
        KFC.setDiscount(0.8);
        
        BK.setMembershpPrice(200);
        BK.setDiscount(0.9);
        
        Dumplin.setMembershpPrice(100);
        Dumplin.setDiscount(0.5);
        
        
        //initialize formula
        ArrayList<FoodCombo>formular1=new ArrayList<>();
        formular1.add(new FoodCombo(BostonFlour,2));
        formular1.add(new FoodCombo(BostonChicken,1));
        
        Food KFCchickenBurger=new Food("chicken burger",(BostonFlour.getPrice()*2+BostonChicken.getPrice()),(BostonFlour.getPrice()*2+BostonChicken.getPrice())+2);
        
        ArrayList<FoodCombo>formular2=new ArrayList<>();
        formular2.add(new FoodCombo(BostonFlour,2));
        formular2.add(new FoodCombo(BostonBeef,1));
        Food KFCbeefBurger=new Food("beef burger",(BostonFlour.getPrice()*2+BostonBeef.getPrice()),(BostonFlour.getPrice()*2+BostonBeef.getPrice())+2);
        
        ArrayList<FoodCombo>formular3=new ArrayList<>();
        formular3.add(new FoodCombo(BostonPotato,1));
        Food KFCfries=new Food("fries",BostonPotato.getPrice(),BostonPotato.getPrice()+2);
        
        ArrayList<FoodCombo>formular4=new ArrayList<>();
        formular2.add(new FoodCombo(BostonFlour,2));
        formular2.add(new FoodCombo(BostonBeef,1));
        formular3.add(new FoodCombo(BostonLettuce,1));
        Food KFChealthyBurger=new Food("healthy burger",(BostonFlour.getPrice()*2+BostonBeef.getPrice()+BostonLettuce.getPrice()),(BostonFlour.getPrice()*2+BostonBeef.getPrice()+BostonLettuce.getPrice())+2);
        
        //add these to KFC
        KFC.getFormula().put(KFCchickenBurger, formular1);
        KFC.getFormula().put(KFCbeefBurger, formular2);
        KFC.getFormula().put(KFCfries,formular3);
        KFC.getFormula().put(KFChealthyBurger,formular4);
        
        KFC.addMenu(KFCchickenBurger, KFCchickenBurger.getPrice());
        KFC.addMenu(KFCfries, KFCfries.getPrice());
        KFC.addMenu(KFChealthyBurger,KFChealthyBurger.getPrice());
        KFC.addMenu(KFCbeefBurger,KFCbeefBurger.getPrice());
        //for test
        
        FoodCombo fc1=new FoodCombo(KFCchickenBurger,50);
        FoodCombo fc3=new FoodCombo(KFChealthyBurger,50);
        FoodCombo fc2=new FoodCombo(KFCbeefBurger,50);
        FoodCombo fc4=new FoodCombo(KFCfries,50);
        
        FoodCombo fc5=new FoodCombo(KFCchickenBurger,20);
        FoodCombo fc6=new FoodCombo(KFCfries,20);
        Double price5 = KFCchickenBurger.getPrice()* 2 + KFCfries.getPrice();
        ArrayList<FoodCombo>comboList1=new ArrayList<>();
        comboList1.add(fc5);
        comboList1.add(fc6);
        
        KFC.getProductStock().add(fc1);
        KFC.getProductStock().add(fc2);
        KFC.getProductStock().add(fc3);
        KFC.getProductStock().add(fc4);
        
        FoodCombo mc1=new FoodCombo(BostonFlour,10);
        FoodCombo mc2=new FoodCombo(BostonChicken,50);
        
        KFC.getIngerdientStock().add(mc1);
        KFC.getIngerdientStock().add(mc2);

        //for test
        Branch b1=new Branch("boston kfc","bkfc","bkfc",0,"USA","Boston",11111,KFC);
        b1.addStock(fc5);
        b1.addStock(fc6);

        Customer c1=new Customer("c1","c1","c1",0,"USA");
        b1.getOrderDir().createOrder(comboList1, price5, "b28475", c1, b1, "uncomplete");
        KFC.addBranch(b1);
        
        business.getBranchList().add(b1);
        business.getCustomerList().add(c1);
        
        business.getAccountList().add(b1);
        business.getAccountList().add(c1);
        return business;
    }
}
