/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Implement.Home;
import Implement.Homeable;
import MODEL.Food;
import MODEL.Tabel_Food;
import VIEW.HomePage;
import java.util.List;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author shintadl
 */
public class ControllerHome {
    private Food food;
    HomePage homepage;
    Homeable implHome;
    List<Food> foodList;
    public ControllerHome(HomePage hp) {
        this.food = food;
        this.homepage = hp;
        this.implHome = new Home();
        this.foodList = implHome.FoodTable();
        
        
    }
    
    public void showFoodTable() {
        foodList = implHome.FoodTable();
        
        Tabel_Food tFood = new Tabel_Food(foodList);
        homepage.getTableFood().setModel(tFood);
        homepage.getTableFood().getTableHeader().getColumnModel().getColumn(0).setHeaderValue("Food");
        
    }
    
    public void showSearchFood() {
        String foodText;
        foodText = homepage.getTfSearch().getText();
        if (!foodText.isEmpty()) {
            foodList = implHome.SearchFoodTable(foodText);
            Tabel_Food tFood = new Tabel_Food(foodList);
            homepage.getTableFood().setModel(tFood);
           homepage.getTableFood().getTableHeader().getColumnModel().getColumn(0).setHeaderValue("Food");
        }
        else {
            showFoodTable();
        }
        
    }

}
