/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implement;

import Connection.ConnectDB;
import MODEL.Food;
import java.sql.*;
import VIEW.HomePage;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author shintadl
 */
public class Home implements Homeable {
    Connection connection;
    HomePage homePage;
    String queryHome = "SELECT foodName as 'Food' FROM food";
    
    public Home() {
        this.connection = ConnectDB.getCon();
    }
    
    
    
    @Override
    public List<Food> FoodTable() {
        List <Food> foodList = null;
        
        try {
            foodList = new ArrayList<Food>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(queryHome);
            while (rs.next()) {
                Food food = new Food();
                food.setfoodName(rs.getString(1));
                foodList.add(food);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return foodList;
    }
    
    public List<Food> SearchFoodTable(String foodName) {
        List <Food> foodList = null;
        
        try {
            foodList = new ArrayList<Food>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT foodName as 'Food' FROM food WHERE food.foodName LIKE '%"+foodName+"%'");
            while (rs.next()) {
                Food food = new Food();
                food.setfoodName(rs.getString(1));
                foodList.add(food);
                
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return foodList;
    }
    
}
